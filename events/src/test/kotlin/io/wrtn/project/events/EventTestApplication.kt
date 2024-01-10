package io.wrtn.project.events

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventTestApplication

fun main(vararg args: String) {
    runApplication<EventTestApplication>(*args) {
        webApplicationType = WebApplicationType.NONE
    }
}
