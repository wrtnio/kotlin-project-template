package io.wrtn.project.web.config.managements

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.wrtn.kommons.support.uninitialized
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.info.BuildProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Swagger 관련 설정을 제공합니다.
 *
 * `/swagger-ui.html` 로 접속하여 확인할 수 있습니다.
 *
 * @constructor Create empty Swagger config
 */
@Configuration
@ConditionalOnClass(OpenAPI::class)
class SwaggerConfig {

    @Autowired
    private val buildProps: BuildProperties = uninitialized()

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI().info(info)
    }

    private val info: Info by lazy {
        Info().title(buildProps.name)
            .description("Wrtn Application의 기본 템플릿입니다.")
            .version(buildProps.version)
            .contact(contact)
            .license(license)
    }

    private val contact by lazy {
        Contact()
            .name("Wrtn")
            .email("dev@wrtn.io")
            .url("https://gitlab.wrtn.club/wrtn/commons/kotlin-project-template") // 현재는 github에 있다
    }

    private val license by lazy {
        License()
            .name("Wrtn License 1.0")
            .url("https://wrtn.io/license")
    }
}
