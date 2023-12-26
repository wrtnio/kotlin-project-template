package io.wrtn.project.domain

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.testcontainers.storage.MongoDBServer
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
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

}

fun main(vararg args: String) {
    runApplication<MongoTestApplication>(*args) {
        webApplicationType = WebApplicationType.NONE
    }
}
