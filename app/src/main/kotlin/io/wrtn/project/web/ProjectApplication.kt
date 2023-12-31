package io.wrtn.project.web

import io.wrtn.kommons.logging.KLogging
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectApplication {

    companion object: KLogging()

}

fun main(vararg args: String) {
    runApplication<ProjectApplication>(*args) {
        webApplicationType = WebApplicationType.REACTIVE
    }
}
