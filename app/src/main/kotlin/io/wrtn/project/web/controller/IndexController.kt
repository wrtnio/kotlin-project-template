package io.wrtn.project.web.controller

import io.wrtn.kommons.logging.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
class IndexController {

    companion object: KLogging()

    @GetMapping
    suspend fun index(): String {
        return "Project Application. produced at ${Instant.now()}"
    }

}
