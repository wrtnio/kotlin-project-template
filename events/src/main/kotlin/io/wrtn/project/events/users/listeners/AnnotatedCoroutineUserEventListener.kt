package io.wrtn.project.events.users.listeners

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.events.users.UserEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.reactor.mono
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

/**
 * `@EventListener` 를 이용하여, `UserEvent` 를 수신하는 Listener 입니다.
 */
@Component
open class AnnotatedCoroutineUserEventListener {

    companion object: KLogging()

    /**
     * 수신된 [UserEvent]를 비동기 방식으로 처리합니다.
     *
     * @param event 수신한 이벤트
     */
    @EventListener(classes = [UserEvent::class])
    fun handleEvent(event: UserEvent): Mono<Unit> = mono(Dispatchers.IO) {
        doHandleEvent(event)
    }

    /**
     * 향후 overriding 이나 확장을 위해서 protected 로 선언하고, 실제 Event 처리를 수행하는 함수를 분리합니다.
     *
     * @param event 수신한 이벤트
     */
    protected open suspend fun doHandleEvent(event: UserEvent) {
        log.debug { "Handle user event by @EventListener with coroutines. $event" }
        delay(100)
    }
}
