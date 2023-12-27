package io.wrtn.project.domain.repository

import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldHaveSize
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.dropCollection
import org.springframework.data.mongodb.core.find
import org.springframework.data.mongodb.core.findAll
import org.springframework.data.mongodb.core.insert
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo
import java.time.Instant
import java.time.temporal.ChronoUnit

class UserRepositoryTest(
    @Autowired private val repository: UserRepository,
    @Autowired private val operations: MongoOperations,
): AbstractDomainTest() {

    @BeforeEach
    fun beforeEach() {
        operations.dropCollection<User>()
    }

    @Test
    fun `find user by email`() {
        val saved = repository.save(newUser())
        saved.id.shouldNotBeNull()

        val loaded = repository.findByEmail(saved.email)
        loaded.shouldNotBeNull()
        loaded shouldBeEqualTo saved
    }

    @Test
    fun `find user by email and userState`() {
        val saved = repository.saveAll(newUsers(10))
        val target = saved[3]

        val loaded = repository.findByEmailAndUserState(target.email, target.userState)
        loaded.shouldNotBeNull() shouldBeEqualTo target

        // 존재하지 않는 경우 null을 반환한다.
        repository.findByEmailAndUserState("not-exist@example.com", UserState.UNKNOWN).shouldBeNull()
    }

    @Test
    fun `find user by nickname`() {
        repository.saveAll(newUsers(10))
        val saved = repository.save(newUser())

        val loaded = repository.findByNickname(saved.nickname)
        loaded.shouldNotBeNull() shouldBeEqualTo saved
    }

    @Test
    fun `find users by createdAtAfter`() {
        val users = listOf(
            newUser().apply { createdAt = Instant.now().minus(2, ChronoUnit.DAYS) },
            newUser().apply { createdAt = Instant.now().minus(1, ChronoUnit.DAYS) },
            newUser()
        )
        val saved = repository.saveAll(users)

        val loaded = repository.findByCreatedAtAfter(users[0].createdAt)
        loaded shouldHaveSize 2
        loaded shouldBeEqualTo listOf(saved[1], saved[2])
    }

    @Test
    fun `find user by nickname regex - custom repositroy`() {
        operations.insertAll(newUsers(10))
        val saved = operations.insert<User>().one(newUser().copy(nickname = "Debop"))

        val loaded = repository.findByNicknameLike("De.*")
        loaded shouldContain saved
    }

    @Test
    fun `find user by operations and query`() {
        operations.insertAll(newUsers(10))
        val saved = operations.insert<User>().one(newUser().copy(email = "debop@wrtn.io"))

        val query = Query.query(Criteria.where(User::email.name).isEqualTo(saved.email))
        val loaded = operations.find<User>(query)
        loaded shouldHaveSize 1
        loaded.first() shouldBeEqualTo saved
    }

    @Test
    fun `find users as list`() {
        val saved = operations.insertAll(newUsers(10)).toList()
        val loaded = operations.findAll<User>()

        loaded shouldBeEqualTo saved
    }
}
