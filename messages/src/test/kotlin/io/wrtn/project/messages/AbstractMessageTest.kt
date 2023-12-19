package io.wrtn.project.messages

import io.wrtn.kommons.junit5.faker.Fakers
import io.wrtn.kommons.logging.KLogging

abstract class AbstractMessageTest {

    companion object: KLogging() {
        @JvmStatic
        val faker = Fakers.faker
    }

}
