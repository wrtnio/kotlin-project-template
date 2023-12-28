package io.wrtn.project.infrastructure.redis.redisson

import io.wrtn.project.infrastructure.redis.AbstractRedisTest
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.redisson.api.RedissonClient

abstract class AbstractRedissionTest: AbstractRedisTest() {

    protected lateinit var redisson: RedissonClient

    @BeforeAll
    fun beforeAll() {
        redisson = newRedisson()
    }

    @AfterAll
    fun afterAll() {
        redisson.shutdown()
    }
}
