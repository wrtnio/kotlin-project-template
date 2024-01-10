package io.wrtn.project.events.users

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.trace
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

/**
 * Spring Framework의 [ApplicationEventPublisher]를 이용하여, UserEvent 를 Publish 합니다.
 *
 * @property publisher
 * @constructor Create empty User event publisher
 */
@Component
class UserEventPublisher(private val publisher: ApplicationEventPublisher) {

    companion object: KLogging()

    /**
     * 사용자(User) 관련 Event를 발행합니다.
     */
    fun publish(userEvent: UserEvent) {
        log.trace { "Publish user event. $userEvent" }
        publisher.publishEvent(userEvent)
    }
}
