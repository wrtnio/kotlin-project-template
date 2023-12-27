package io.wrtn.project.domain.repository

import io.wrtn.kommons.coroutines.flow.extensions.log
import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirstOrNull
import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldHaveSize
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.ReactiveMongoOperations
import org.springframework.data.mongodb.core.find
import org.springframework.data.mongodb.core.findAll
import org.springframework.data.mongodb.core.insert
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo
import java.time.Instant
import java.time.temporal.ChronoUnit

class UserCoroutineRepositoryTest(
    @Autowired private val repository: UserCoroutineRepository,
    @Autowired private val operations: ReactiveMongoOperations,
): AbstractDomainTest() {


    @Test
    fun `context loading`() {
        repository.shouldNotBeNull()
        operations.shouldNotBeNull()
    }

    @BeforeEach
    fun beforeEach() {
        runBlocking(Dispatchers.IO) {
            repository.deleteAll()
            // operations.dropCollection<User>().awaitSingleOrNull()
        }
    }

    /**
     * [UserCoroutineRepository]를 활용하여 Coroutine 방식으로 비동기로 저장, 조회하는 예
     */
    @Test
    fun `find one user by email`() = runTest {
        val saved = repository.save(newUser())
        saved.id.shouldNotBeNull()

        val loaded = repository.findByEmail(saved.email)
        loaded.shouldNotBeNull()
        loaded shouldBeEqualTo saved
    }

    @Test
    fun `find user by email and userState`() = runTest {
        val saved = repository.saveAll(newUsers(10)).toList()

        val target = saved[3]
        val loaded = repository.findByEmailAndUserState(target.email, target.userState)
        loaded.shouldNotBeNull() shouldBeEqualTo target

        // 존재하지 않는 이메일로 조회하면 null을 반환한다.
        repository.findByEmailAndUserState("not-exist@example.com", UserState.UNKNOWN).shouldBeNull()
    }

    @Test
    fun `find users by nickname`() = runTest {
        val user1 = repository.save(User("Debop", "debop@wrtn.io", 55, UserState.ACTIVE))
        val user2 = repository.save(User("Bob", "bob@wrtn.io", 28, UserState.ACTIVE))
        val saved = repository.saveAll(newUsers(10)).toList()

        val loaded = repository.findByNickname("Debop")
        loaded.shouldNotBeNull() shouldBeEqualTo user1
    }

    @Test
    fun `find users by createdAt after`() = runTest {
        val users = listOf(
            newUser().apply { createdAt = Instant.now().minus(2, ChronoUnit.DAYS) },
            newUser().apply { createdAt = Instant.now().minus(1, ChronoUnit.DAYS) },
            newUser()
        )
        val saved = repository.saveAll(users).toList()

        val loaded = repository.findByCreatedAtAfter(users[0].createdAt).toList()
        loaded shouldHaveSize 2
        loaded shouldBeEqualTo listOf(saved[1], saved[2])
    }

    /**
     * [ReactiveMongoOperations]를 사용하여 저장하고, [Query]를 사용하여 질의를 만들고, 조회하는 예
     */
    @Test
    fun `find user by operations and query`() = runTest {
        val saved = operations.insert<User>().one(newUser().copy(email = "debop@wrtn.io")).awaitSingle()
        saved.id.shouldNotBeNull()

        val query = Query.query(Criteria.where(User::email.name).isEqualTo(saved.email))
        val loaded = operations.find<User>(query).awaitFirstOrNull()
        loaded shouldBeEqualTo saved
    }

    @Test
    fun `find users as flow`() = runTest {
        val saved1 = operations.insert<User>().one(newUser()).awaitSingle()
        val saved2 = operations.insert<User>().one(newUser()).awaitSingle()

        val loaded = operations.findAll<User>().asFlow().log("user").toList()
        loaded shouldBeEqualTo listOf(saved1, saved2)
    }
}
