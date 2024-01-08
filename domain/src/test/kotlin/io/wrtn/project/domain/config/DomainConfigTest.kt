package io.wrtn.project.domain.config

import com.mongodb.client.MongoClient
import io.wrtn.kommons.support.uninitialized
import io.wrtn.project.domain.AbstractDomainTest
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations

class DomainConfigTest: AbstractDomainTest() {

    @Autowired
    private val mongoClient: MongoClient = uninitialized()

    @Autowired
    private val mongoOperations: MongoOperations = uninitialized()

    @Test
    fun `context loading`() {
        mongoClient.shouldNotBeNull()
        mongoOperations.shouldNotBeNull()
    }
}
