package io.wrtn.project.domain

import io.wrtn.kommons.junit5.faker.Fakers
import io.wrtn.kommons.logging.KLogging
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [MongoTestApplication::class])
abstract class AbstractDomainTest {

    companion object: KLogging() {

        @JvmStatic
        val faker = Fakers.faker

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
}
