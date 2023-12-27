package io.wrtn.project.domain.config

import io.wrtn.kommons.logging.KLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("!prod")
@Configuration(proxyBeanMethods = false)
class RepositoryMetricsConfig {

    companion object: KLogging()

    @Bean
    fun repositoryMetricsPostProcessor(): RepositoryMetricsPostProcessor {
        return RepositoryMetricsPostProcessor()
    }

}
