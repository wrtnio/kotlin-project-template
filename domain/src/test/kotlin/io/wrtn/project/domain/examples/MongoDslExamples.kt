package io.wrtn.project.domain.examples

import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.model.User
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldHaveSize
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.dropCollection
import org.springframework.data.mongodb.core.find
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo
import org.springframework.data.mongodb.core.query.regex

class MongoDslExamples(
    @Autowired private val operations: MongoOperations,
): AbstractDomainTest() {

    @BeforeEach
    fun beforeEach() {
        operations.dropCollection<User>()
    }

    @Test
    fun `simple type-safe query`() {
        val user1 = operations.insert<User>(newUser())
        val user2 = operations.insert<User>(newUser())

        val loaded = operations.find<User>(Query.query(User::email isEqualTo user2.email))
        loaded shouldHaveSize 1
        loaded.first() shouldBeEqualTo user2

        val loaded2 = operations.find<User>(Query.query(User::email isEqualTo user1.email))
        loaded2 shouldHaveSize 1
        loaded2.first() shouldBeEqualTo user1
    }

    @Test
    fun `complex type-safe query`() {
        operations.insert<User>(newUser())
        val saved = operations.insert<User>(newUser().copy(nickname = "Debop"))

        val criteria = Criteria().andOperator(
            User::age isEqualTo saved.age,
            User::nickname regex "^Deb.*"
        )

        val loaded = operations.find<User>(Query.query(criteria))

        loaded shouldHaveSize 1
        loaded.first() shouldBeEqualTo saved
        // loaded.first().nickname shouldBeEqualTo saved.nickname
    }
}
