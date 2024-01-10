package io.wrtn.project.events.user

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.events.users.UserEvent
import kotlinx.atomicfu.atomic
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class TestUserEventListener: ApplicationListener<UserEvent> {

    companion object: KLogging()

    val receivedEventCounter = atomic(0)

    override fun onApplicationEvent(event: UserEvent) {
        val count = receivedEventCounter.incrementAndGet()
        log.debug { "Handle user event. count=$count, event=$event" }
    }
}
