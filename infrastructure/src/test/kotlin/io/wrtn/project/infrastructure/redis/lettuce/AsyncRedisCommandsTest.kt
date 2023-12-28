package io.wrtn.project.infrastructure.redis.lettuce

import io.wrtn.kommons.concurrent.sequence
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.redis.lettuce.await
import kotlinx.coroutines.future.await
import kotlinx.coroutines.test.runTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeTrue
import org.junit.jupiter.api.RepeatedTest

class AsyncRedisCommandsTest: AbstractLettuceTest() {

    companion object: KLogging() {
        private const val REPEAT_SIZE = 5
        private const val ITEM_SIZE = 100
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `bulk hset asynchronously`() = runTest {
        val keyName = randomName()

        val future = List(ITEM_SIZE) { index ->
            asyncCommands.hset(keyName, index.toString(), randomString())
        }.sequence()
        val list = future.await()
        list.all { it }.shouldBeTrue()

        asyncCommands.hlen(keyName).await().toInt() shouldBeEqualTo ITEM_SIZE
        asyncCommands.del(keyName).await() shouldBeEqualTo 1L
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `bulk hset with pipeline`() = runTest {
        val keyName = randomName()

        asyncCommands.multi()
        val futures = try {
            List(ITEM_SIZE) { index ->
                asyncCommands.hset(keyName, index.toString(), randomString())
            }
            asyncCommands.exec()
        } catch (e: Throwable) {
            asyncCommands.discard()
        }
        futures.await()

        asyncCommands.hlen(keyName).await().toInt() shouldBeEqualTo ITEM_SIZE
        asyncCommands.del(keyName).await() shouldBeEqualTo 1L
    }
}
