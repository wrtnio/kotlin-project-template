package io.wrtn.project

import io.wrtn.kommons.junit5.faker.Fakers
import io.wrtn.kommons.logging.KLogging

abstract class AbstractCoreTest {

    companion object: KLogging() {
        @JvmStatic
        protected val faker = Fakers.faker
    }
}
