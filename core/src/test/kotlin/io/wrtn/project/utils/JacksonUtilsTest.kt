package io.wrtn.project.utils

import io.wrtn.kommons.junit5.random.RandomValue
import io.wrtn.kommons.junit5.random.RandomizedTest
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.AbstractCoreTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldNotBeEmpty
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.RepeatedTest
import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDateTime

@RandomizedTest
class JacksonUtilsTest: AbstractCoreTest() {

    companion object: KLogging() {
        private const val TEST_SIZE = 5
    }

    @RepeatedTest(TEST_SIZE)
    fun `json serialize and deserialize`(@RandomValue origin: TestObject) {
        val content = JacksonUtils.writeAsString(origin)
        content.shouldNotBeEmpty()
        log.debug { "content=$content" }

        val actual = JacksonUtils.readString<TestObject>(content)
        actual.shouldNotBeNull() shouldBeEqualTo origin
        actual.items shouldBeEqualTo origin.items
    }

    data class TestObject(
        val id: Long,
        val name: String,
        val items: MutableList<TestObjectItem>
    ): Serializable

    data class TestObjectItem(
        val name: String,
        val quantity: Long,
        val price: BigDecimal,
        val savedAt: LocalDateTime
    ): Serializable
}
