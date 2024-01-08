package io.wrtn.project.web.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.support.uninitialized
import io.wrtn.project.web.AbstractProjectApplicationTest
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class ProjectConfigTest: AbstractProjectApplicationTest() {

    companion object: KLogging()

    @Autowired
    private val objectMapper: ObjectMapper = uninitialized()

    @Test
    fun `context loading`() {
        objectMapper.shouldNotBeNull()
    }
}
