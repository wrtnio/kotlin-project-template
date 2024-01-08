package io.wrtn.project.web

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.info
import io.wrtn.kommons.testcontainers.storage.MongoDBServer
import io.wrtn.kommons.utils.Runtimex
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectApplication {

    @Value("\${spring.application.name}")
    private lateinit var applicationName: String

    companion object: KLogging() {
        // 테스트용으로 MongoDB 사용을 위해
        val mongodb = MongoDBServer.Launcher.mongoDB


        init {
            log.info { "서비스를 시작합니다..." }

            Runtimex.addShutdownHook {
                log.info { "서비스를 종료합니다..." }
            }
        }
    }
}

fun main(vararg args: String) {
    runApplication<ProjectApplication>(*args) {
        webApplicationType = WebApplicationType.REACTIVE
    }
}
