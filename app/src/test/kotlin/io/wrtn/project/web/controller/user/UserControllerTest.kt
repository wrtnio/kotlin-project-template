package io.wrtn.project.web.controller.user

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import io.wrtn.project.web.AbstractProjectApplicationTest
import io.wrtn.project.web.controller.ApiPaths
import io.wrtn.project.web.utils.RestResponsePage
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactive.awaitFirstOrNull
import kotlinx.coroutines.reactive.awaitSingle
import kotlinx.coroutines.test.runTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.returnResult

class UserControllerTest(
    @Autowired private val client: WebTestClient
): AbstractProjectApplicationTest() {

    companion object: KLogging() {
        private const val USER_API_PATH = ApiPaths.API_V1 + "/users"

        @JvmStatic
        fun newUsers(size: Int): List<User> {
            return List(size) { newUser() }
        }

        @JvmStatic
        fun newUser(userState: UserState = UserState.ACTIVE): User {
            return User(
                nickname = faker.name().username(),
                email = faker.internet().emailAddress(),
                age = faker.random().nextInt(10, 80),
                userState = userState,
            )
        }
    }

    @Test
    fun `find by user by id when non-exists`() = runTest {
        val result = findUserById("not-exists")
        result.shouldBeNull()
    }

    @Test
    fun `save new user`() = runTest {
        val newUser = newUser()

        val savedUser = saveUser(newUser)
        log.debug { "saved user=$savedUser" }
        savedUser.shouldNotBeNull()
        savedUser.id.shouldNotBeNull()

        val foundUser = findUserById(savedUser.id!!)
        foundUser.shouldNotBeNull()
        foundUser shouldBeEqualTo savedUser
    }

    @Test
    fun `save multiple users and get all`() = runTest {
        val newUsers = newUsers(15)

        val savedUsers = newUsers.asFlow().flatMapMerge { flowOf(saveUser(it)) }.toList()
        savedUsers.all { it.id != null }.shouldBeTrue()

        val pageable = PageRequest.of(0, 10)
        val foundUsers = findAllUsers(pageable)
        log.debug { "foundUsers=$foundUsers" }
        foundUsers.size shouldBeEqualTo pageable.pageSize
    }

    private suspend fun saveUser(user: User): User {
        return client.post()
            .uri(USER_API_PATH)
            .bodyValue(user)
            .exchange()
            .expectStatus().isOk
            .returnResult<User>().responseBody
            .awaitSingle()
    }

    private suspend fun findUserById(id: String): User? {
        return client.get()
            .uri("$USER_API_PATH/{id}", id)
            .exchange()
            .expectStatus().isOk
            .returnResult<User>().responseBody
            .awaitFirstOrNull()
    }

    private suspend fun findAllUsers(pageable: Pageable): Page<User> {
        return client.get()
            .uri(
                USER_API_PATH + "/pageable?page={page}&size={size}&sort={sort}",
                pageable.pageNumber,
                pageable.pageSize,
                pageable.sort
            )
            .exchange()
            .expectStatus().isOk
            .returnResult<RestResponsePage<User>>().responseBody
            .awaitSingle()
    }
}
