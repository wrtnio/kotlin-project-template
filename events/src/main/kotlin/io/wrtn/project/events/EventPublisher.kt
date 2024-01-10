package io.wrtn.project.events

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.trace
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class EventPublisher(private val publisher: ApplicationEventPublisher) {

    companion object: KLogging()

    fun publish(event: BaseEvent) {
        log.trace { "Publish event. $event" }
        publisher.publishEvent(event)
    }
}
