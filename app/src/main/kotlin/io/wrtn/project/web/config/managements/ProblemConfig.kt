package io.wrtn.project.web.config.managements

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.zalando.problem.jackson.ProblemModule

@Configuration
@ConditionalOnClass(ProblemModule::class, ObjectMapper::class)
class ProblemConfig {
    /**
     * Configure the Jackson ObjectMapper to use for JSON serialization and deserialization.
     * class path 에 있는 모든 모듈을 등록하고, kommons 에서 제공하는 다양한 module 들을 등록한다.
     * 여기에 Problem Module 의 경우에는 stacktrace 를 출력하지 않도록 설정한다.
     */
    @Bean
    @Primary
    fun objectMapper(): ObjectMapper {
        // Jackson.defaultJsonMapper 를 사용하면 자동으로 ProblemModule 을 등록하므로
        // stacktrace 재 설정을 위한 재등록 시 무시되어 버린다.
        return jacksonObjectMapper()
            .registerModule(ProblemModule().withStackTraces(false))
            .findAndRegisterModules()
    }
}
