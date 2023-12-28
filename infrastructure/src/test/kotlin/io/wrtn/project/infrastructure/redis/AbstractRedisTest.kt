package io.wrtn.project.infrastructure.redis

import io.lettuce.core.codec.RedisCodec
import io.wrtn.kommons.io.serialize.BinarySerializers
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.redis.lettuce.codec.LettuceBinaryCodec
import io.wrtn.kommons.testcontainers.storage.RedisServer
import io.wrtn.project.infrastructure.AbstractInfraTest
import org.redisson.api.RedissonClient

abstract class AbstractRedisTest: AbstractInfraTest() {

    companion object: KLogging() {
        private val redisServer = RedisServer.Launcher.redis

        @JvmStatic
        val lettuceBinaryCodec by lazy {
            LettuceBinaryCodec<Any>(BinarySerializers.Default)
        }
    }

    /**
     * Redisson [RedissonClient] 를 반환합니다.
     */
    protected fun newRedisson(): RedissonClient {
        return RedisServer.Launcher.RedissonLib.getRedisson(redisServer.url)
    }

    /**
     * Lettuce Library를 사용한 [io.lettuce.core.RedisClient]를 생성합니다.
     */
    protected fun newLettuce(): io.lettuce.core.RedisClient {
        return RedisServer.Launcher.LettuceLib.getRedisClient(redisServer.host, redisServer.port)
    }

    protected fun syncRedisCommands(
        codec: RedisCodec<String, Any> = lettuceBinaryCodec
    ): io.lettuce.core.api.sync.RedisCommands<String, Any> {
        return newLettuce().connect(codec).sync()
    }

    protected fun asyncRedisCommands(
        codec: RedisCodec<String, Any> = lettuceBinaryCodec
    ): io.lettuce.core.api.async.RedisAsyncCommands<String, Any> {
        return newLettuce().connect(codec).async()
    }
}
