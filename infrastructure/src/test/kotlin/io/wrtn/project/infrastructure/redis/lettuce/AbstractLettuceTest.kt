package io.wrtn.project.infrastructure.redis.lettuce

import io.lettuce.core.RedisClient
import io.lettuce.core.api.async.RedisAsyncCommands
import io.lettuce.core.api.sync.RedisCommands
import io.wrtn.kommons.support.closeSafe
import io.wrtn.project.infrastructure.redis.AbstractRedisTest
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll

abstract class AbstractLettuceTest: AbstractRedisTest() {

    protected lateinit var client: RedisClient

    protected lateinit var commands: RedisCommands<String, Any>
    protected lateinit var asyncCommands: RedisAsyncCommands<String, Any>

    @BeforeAll
    open fun beforeAll() {
        client = newLettuce()
        commands = syncRedisCommands(lettuceBinaryCodec)
        asyncCommands = asyncRedisCommands(lettuceBinaryCodec)
    }

    @AfterAll
    open fun afterAll() {
        client.closeSafe()
    }

}
