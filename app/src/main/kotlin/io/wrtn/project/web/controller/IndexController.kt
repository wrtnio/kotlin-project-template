package io.wrtn.project.web.controller

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import org.springframework.boot.info.BuildProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class IndexController(private val buildProperties: BuildProperties) {

    companion object: KLogging()

    private val buildInfo = buildProperties.associate { it.key to it.value }

    @GetMapping
    suspend fun index(): Map<String, String> {
        log.debug { "BuildProperties: ${buildInfo.toList().joinToString { it.first + "=" + it.second }}" }
        return buildInfo
    }

    @GetMapping("/ping")
    suspend fun ping(): String {
        return System.currentTimeMillis().toString()
    }

}
