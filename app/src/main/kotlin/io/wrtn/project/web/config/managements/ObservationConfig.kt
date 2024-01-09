package io.wrtn.project.web.config.managements

import io.micrometer.core.instrument.config.MeterFilter
import io.micrometer.observation.ObservationRegistry
import io.micrometer.observation.aop.ObservedAspect
import io.wrtn.kommons.logging.KLogging
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Spring Boot 3 + Micrometer를 이용한 Observability 를 활용하기 위한 환경 설정
 *
 */
@Configuration
@ConditionalOnClass(ObservedAspect::class)
class ObservationConfig {

    companion object: KLogging() {
        private val ignoredPaths = listOf(
            "/actuator",
            "/swagger",
            "/v2/api-docs",
            "/v3/api-docs",
        )
    }

    @Bean
    @ConditionalOnClass(ObservationRegistry::class)
    fun observedAspect(registry: ObservationRegistry): ObservedAspect {
        return ObservedAspect(registry)
    }

    /**
     * Metrics 측정을 수행할 Http Path의 Filter를 정의합니다.
     * 예: `/actuator` 등 관리용 url은 metric 측정을 하지 않습니다.
     */
    fun metricsHttpServerUriFilter(): MeterFilter {
        return MeterFilter
            .deny { id ->
                val tag = id?.getTag("uri")
                tag?.let { t -> ignoredPaths.any { path -> t.contains(path) } } ?: false
            }
    }
}
