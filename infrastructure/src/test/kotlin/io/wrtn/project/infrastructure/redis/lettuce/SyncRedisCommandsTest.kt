package io.wrtn.project.infrastructure.redis.lettuce

import io.wrtn.kommons.junit5.concurrency.MultithreadingTester
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.utils.Runtimex
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test

class SyncRedisCommandsTest: AbstractLettuceTest() {

    companion object: KLogging() {
        private const val REPEAT_SIZE = 5
    }

    @Test
    fun `connect to redis server`() {
        val result = commands.ping()
        result shouldBeEqualTo "PONG"
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `connect to redis server repeatly`() {
        val commands = syncRedisCommands()
        commands.ping() shouldBeEqualTo "PONG"
    }

    @Test
    fun `connect to redis server in multi-threading`() {
        MultithreadingTester()
            .numThreads(2 * Runtimex.availableProcessors)
            .roundsPerThread(2)
            .add {
                val commands = syncRedisCommands()
                commands.ping() shouldBeEqualTo "PONG"
            }
            .run()
    }
}
