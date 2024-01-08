package io.wrtn.project.web

import com.fasterxml.jackson.databind.json.JsonMapper
import io.wrtn.kommons.json.jackson.Jackson
import io.wrtn.kommons.junit5.faker.Fakers
import io.wrtn.kommons.logging.KLogging
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles(value = ["dev", "test", "local"])
@AutoConfigureWebTestClient(timeout = "10000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class AbstractProjectApplicationTest {

    companion object: KLogging() {

        val faker = Fakers.faker
        val mapper: JsonMapper by lazy { Jackson.defaultJsonMapper }

        fun randomInt(min: Int = 0, max: Int = Int.MAX_VALUE): Int =
            faker.random().nextInt(min, max)

        fun randomLong(min: Long = 0, max: Long = Long.MAX_VALUE): Long =
            faker.random().nextLong(min, max)
    }
}
