package io.wrtn.project.web.config.infra

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import io.wrtn.project.domain.repository.UserRepository
import io.wrtn.project.web.ProjectApplication
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

/**
 * 동기방식의 MongoDB Client 설정
 *
 * 참고: [ReactiveMongoConfig]는 Reactive 방식의 설정임.
 *
 * 동기방식 및 Reactive 방식으로 모두 사용하려면, 공통으로 사용하는 Converter Bean이 중복되는데,
 * 이럴 경우에는 환경설정에서 `spring.main.allow-bean-definition-overriding=true` 를 설정하여 중복되는 Bean을 덮어쓰도록 한다.
 *
 */
@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackageClasses = [UserRepository::class])
class MongoConfig: AbstractMongoClientConfiguration() {

    // NOTE: application.yml 에 spring.data.mongodb 에 관련 속성을 설정하면, MongoTemplates, MongoRepositories 들을 Bean으로 제공해준다.

    @Value("\${spring.data.mongodb.database:test}")
    private lateinit var databaseName: String

    override fun getDatabaseName(): String {
        return databaseName
    }

    /**
     * 재정의해줘야 제대로 MongoDB 에 접속이 가능합니다.
     *
     * @return
     */
    @Bean
    override fun mongoClient(): MongoClient {
        return MongoClients.create(ProjectApplication.mongodb.connectionString)
    }
}
