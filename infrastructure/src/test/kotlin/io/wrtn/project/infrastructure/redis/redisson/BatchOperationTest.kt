package io.wrtn.project.infrastructure.redis.redisson

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.kommons.redis.redisson.withBatch
import io.wrtn.kommons.redis.redisson.withTransaction
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeNull
import org.junit.jupiter.api.RepeatedTest

class BatchOperationTest: AbstractRedissionTest() {

    companion object: KLogging() {
        private const val REPEAT_SIZE = 3
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `batch operation`() {
        val mapName = randomName()

        val value1 = randomString()
        val value2 = randomString()

        val result = redisson.withBatch {
            val batchMap = getMap<String, String>(mapName)
            batchMap.fastPutAsync("key1", value1)
            batchMap.putAsync("key2", value2)
            batchMap.getAllAsync(setOf("key1", "key2"))
        }

        log.debug { "result=${result.responses}" }

        result.responses[0] shouldBeEqualTo true
        result.responses[1].shouldBeNull()
        result.responses[2] shouldBeEqualTo mapOf("key1" to value1, "key2" to value2)
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `transactional operations`() {
        val mapName = randomName()
        val setName = randomName()

        redisson.withTransaction {
            val map = getMap<String, String>(mapName)
            map["1"] = randomString()
            val value = map["3"]

            val set = getSet<String>(setName)
            set.add(value ?: randomString())
        }

        redisson.getMap<String, String>(mapName).size shouldBeEqualTo 1
        redisson.getSet<String>(setName).size shouldBeEqualTo 1


        redisson.getMap<String, String>(mapName).delete()
        redisson.getSet<String>(setName).delete()
    }
}
