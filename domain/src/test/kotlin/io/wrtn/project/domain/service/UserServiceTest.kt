package io.wrtn.project.domain.service

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.repository.UserRepository
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class UserServiceTest @Autowired constructor(
    private val userService: UserService,
    private val repository: UserRepository
): AbstractDomainTest() {

    companion object: KLogging()

    @BeforeEach
    fun beforeEach() {
        repository.deleteAll()
    }

    @Test
    fun `find user by id`() {
        val saved = repository.saveAll(newUsers(10))
        val target = saved[3]

        val loaded = userService.findByIdOrNull(target.id!!)

        log.debug { "loaded=$loaded" }
        loaded.shouldNotBeNull() shouldBeEqualTo target
    }

    @Test
    fun `save users with transaction`() {
        val saved = userService.saveAll(newUsers(10))

        val loaded = repository.findAll()
        loaded shouldBeEqualTo saved
    }
}
