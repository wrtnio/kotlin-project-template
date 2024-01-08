package io.wrtn.project.web.config

import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import io.wrtn.kommons.logging.KLogging
import io.wrtn.project.web.ProjectApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories
class ReactiveMongoConfig {

    companion object: KLogging()


    @Bean
    fun mongoReactiveClient(): MongoClient {
        return MongoClients.create(ProjectApplication.mongodb.connectionString)
    }
}
