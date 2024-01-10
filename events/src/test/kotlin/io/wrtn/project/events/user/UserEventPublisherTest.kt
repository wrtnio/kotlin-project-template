package io.wrtn.project.events.user

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.support.uninitialized
import io.wrtn.project.events.AbstractEventTest
import io.wrtn.project.events.users.UserEvent
import io.wrtn.project.events.users.UserEventPublisher
import org.amshove.kluent.shouldNotBeNull
import org.awaitility.kotlin.atMost
import org.awaitility.kotlin.await
import org.awaitility.kotlin.until
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import java.time.Duration

class UserEventPublisherTest: AbstractEventTest() {

    companion object: KLogging()

    @Autowired
    private val publisher: UserEventPublisher = uninitialized()

    @Autowired
    private val listener: TestUserEventListener = uninitialized()

    @Test
    fun `context loading`() {
        publisher.shouldNotBeNull()
        listener.shouldNotBeNull()
    }

    @Test
    fun `publish user created event`() {
        val initCount = listener.receivedEventCounter.value

        val userCreated = UserEvent.UserCreated("1", "nickname", "debop@example.com")
        publisher.publish(userCreated)

        await atMost Duration.ofMillis(100) until { listener.receivedEventCounter.value > initCount }
    }
}
