package io.wrtn.project.events.users.listeners

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.events.users.UserEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

/**
 * [ApplicationListener]를 구현하여 [UserEvent]를 수신하여 처리합니다.
 */
@Component
class UserEventListener: ApplicationListener<UserEvent> {

    companion object: KLogging()

    /**
     * 수신된 [UserEvent]를 동기 방식으로 처리합니다.
     *
     * @param event
     */
    override fun onApplicationEvent(event: UserEvent) {
        doHandleEvent(event)
    }

    private fun doHandleEvent(event: UserEvent) {
        // 이렇게 받는 Event 를 Kafka 를 통해 외부로 보내던가, Persistence 에 저장하는 작업을 할 수 있습니다.
        log.debug { "Handle user event. $event" }
        Thread.sleep(100)
    }
}
