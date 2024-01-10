package io.wrtn.project.domain

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.testcontainers.storage.MongoDBServer
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = ["io.wrtn.project"])
class MongoTestApplication {

    companion object: KLogging() {
        val mongodb = MongoDBServer.Launcher.mongoDB
    }

    @Bean
    fun mongoClient(): com.mongodb.client.MongoClient {
        return com.mongodb.client.MongoClients.create(mongodb.connectionString)
    }

    @Bean
    fun mongoReactiveClient(): com.mongodb.reactivestreams.client.MongoClient {
        return com.mongodb.reactivestreams.client.MongoClients.create(mongodb.connectionString)
    }

    /**
     * MongoDB 관련 EmitValue 를 Log 에 쓰는 Listener 입니다.
     */
//    @Bean
//    fun mongoEventListener() = LoggingEventListener()

}

fun main(vararg args: String) {
    runApplication<MongoTestApplication>(*args) {
        webApplicationType = WebApplicationType.NONE
    }
}
