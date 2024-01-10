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
        log.debug { "Handle user event. $event" }
        Thread.sleep(100)
    }
}
