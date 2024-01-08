package io.wrtn.project.web.controller

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.kommons.support.toUtf8String
import io.wrtn.project.web.AbstractProjectApplicationTest
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.reactive.server.WebTestClient

class IndexControllerTest(
    @Autowired private val client: WebTestClient
): AbstractProjectApplicationTest() {

    companion object: KLogging()

    @Test
    fun `call root path`() {
        client.get()
            .uri("/")
            .exchange()
            .expectStatus().is3xxRedirection      // WebFilter가 적용되어 있어서 swagger-ui.html로 redirect 됨
    }

    @Test
    fun `call ping path`() {
        client.get()
            .uri("/ping")
            .exchange()
            .expectStatus().isOk
            .expectBody().consumeWith {
                val responseBody = it.responseBody!!.toUtf8String()
                log.debug { "responseBody=$responseBody" }
                responseBody.shouldNotBeEmpty()
            }
    }
}
