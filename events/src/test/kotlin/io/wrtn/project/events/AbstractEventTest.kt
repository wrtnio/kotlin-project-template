package io.wrtn.project.events

import io.wrtn.kommons.logging.KLogging
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [EventTestApplication::class])
abstract class AbstractEventTest {

    companion object: KLogging()
}
