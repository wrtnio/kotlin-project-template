package io.wrtn.project.domain.repository

import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.model.User
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.dropCollection

class UserRepositoryTest(
    @Autowired private val repository: UserRepository,
    @Autowired private val operations: MongoOperations,
): AbstractDomainTest() {

    @BeforeEach
    fun beforeEach() {
        operations.dropCollection<User>()
    }

    @Test
    fun `should find one user by email`() {
        val user = repository.save(newUser())
        user.id.shouldNotBeNull()

        val loaded = repository.findByEmail(user.email)
        loaded.shouldNotBeNull()
        loaded shouldBeEqualTo user
    }
}
