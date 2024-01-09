package io.wrtn.project.web.config.infra

import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import io.wrtn.kommons.logging.KLogging
import io.wrtn.project.web.ProjectApplication
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

/**
 * Reactive 방식의 MongoDB 설정
 *
 * [MongoConfig]는 동기 방식의 설정임.
 *
 * 동기방식 및 Reactive 방식으로 모두 사용하려면, 공통으로 사용하는 Converter Bean이 중복되는데,
 * 이럴 경우에는 환경설정에서 `spring.main.allow-bean-definition-overriding=true` 를 설정하여 중복되는 Bean을 덮어쓰도록 한다.
 */
@Configuration
@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories
class ReactiveMongoConfig: AbstractReactiveMongoConfiguration() {

    companion object: KLogging()

    @Value("\${spring.data.mongodb.database:test}")
    private lateinit var databaseName: String

    override fun getDatabaseName(): String {
        return databaseName
    }

    @Bean
    override fun reactiveMongoClient(): MongoClient {
        return MongoClients.create(ProjectApplication.mongodb.connectionString)
    }
}
