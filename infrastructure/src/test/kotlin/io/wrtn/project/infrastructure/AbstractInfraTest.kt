package io.wrtn.project.infrastructure

import io.wrtn.kommons.junit5.faker.Fakers
import io.wrtn.kommons.logging.KLogging

abstract class AbstractInfraTest {

    companion object: KLogging() {
        @JvmStatic
        val faker = Fakers.faker

        @JvmStatic
        protected fun randomName(): String =
            "project:${faker.name().username()}:${faker.random().nextInt(0, 1000)}"

        @JvmStatic
        protected fun randomString(length: Int = 512): String =
            Fakers.fixedString(length)
    }
}
