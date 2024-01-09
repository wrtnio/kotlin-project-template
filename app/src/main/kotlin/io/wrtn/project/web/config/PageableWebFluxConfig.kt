package io.wrtn.project.web.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.web.ReactivePageableHandlerMethodArgumentResolver
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.result.method.annotation.ArgumentResolverConfigurer

/**
 * RestController 에서 Pageable 을 사용하기 위한 설정
 *
 * 참고: [No primary or default constructor found for interface org.springframework.data.domain.Pageable](https://stackoverflow.com/questions/52355490/no-primary-or-default-constructor-found-for-interface-org-springframework-data-d/64887583#64887583)
 */
@Configuration
class PageableWebFluxConfig: WebFluxConfigurer {

    override fun configureArgumentResolvers(configurer: ArgumentResolverConfigurer) {
        configurer.addCustomResolver(ReactivePageableHandlerMethodArgumentResolver())
    }
}
