package io.wrtn.project.web.filters

import io.wrtn.kommons.logging.KLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilter
import org.springframework.web.server.WebFilterChain
import reactor.core.publisher.Mono

/**
 * Root path ('/') 를 `app.redirect.root` 설정의 경로 (기본:  `/swagger-ui.html`)로 redirect 합니다.
 */
@Component
class RootRedirectWebFilter: WebFilter {

    companion object: KLogging() {
        const val ROOT_PATH = "/"
        const val SWAGGER_PATH = "/swagger-ui.html"
    }

    @Value("\${app.redirect.root:$SWAGGER_PATH}")
    private var redirectPath: String = SWAGGER_PATH

    override fun filter(exchange: ServerWebExchange, chain: WebFilterChain): Mono<Void> {
        val redirectExchange = when (exchange.request.uri.path) {
            ROOT_PATH -> exchange.mutate().request(exchange.request.mutate().path(redirectPath).build()).build()
            else      -> exchange
        }
        return chain.filter(redirectExchange)
    }
}
