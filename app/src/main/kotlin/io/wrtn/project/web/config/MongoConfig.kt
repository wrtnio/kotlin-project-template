package io.wrtn.project.web.config

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import io.wrtn.project.domain.repository.UserRepository
import io.wrtn.project.web.ProjectApplication.Companion.mongodb
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoDatabaseFactory
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackageClasses = [UserRepository::class])
class MongoConfig {

    @Bean
    fun mongoClient(): MongoClient {
        return MongoClients.create(mongodb.connectionString)
    }

    @Bean
    fun mongoDatabaseFactory(): MongoDatabaseFactory {
        return SimpleMongoClientDatabaseFactory(mongodb.connectionString + "/test")
    }

    @Bean
    fun mongoTemplate(factory: MongoDatabaseFactory): MongoTemplate {
        return MongoTemplate(factory)
    }

}
