package io.wrtn.project.messages

import io.wrtn.kommons.junit5.random.RandomValue
import io.wrtn.kommons.junit5.random.RandomizedTest
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.utils.JacksonUtils
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.RepeatedTest

@RandomizedTest
class MessageJsonTest: AbstractMessageTest() {

    companion object: KLogging() {
        private const val REPEAT_SIZE = 10
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `json serialize SimpleRequest`(@RandomValue request: SimpleRequest) {
        val json = JacksonUtils.writeAsString(request)
        log.debug { "request=$json" }

        val actual = JacksonUtils.readString<SimpleRequest>(json)!!

        actual shouldBeEqualTo request
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `json serialize SimpleResponse`(@RandomValue response: SimpleResponse) {
        val json = JacksonUtils.writeAsString(response)
        log.debug { "response=$json" }

        val actual = JacksonUtils.readString<SimpleResponse>(json)!!

        actual shouldBeEqualTo response
    }
}
