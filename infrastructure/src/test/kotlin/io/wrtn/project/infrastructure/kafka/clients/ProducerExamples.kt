package io.wrtn.project.infrastructure.kafka.clients

import io.wrtn.kommons.concurrent.asCompletableFuture
import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.support.closeSafe
import io.wrtn.project.infrastructure.kafka.AbstractKafkaTest
import kotlinx.coroutines.future.await
import kotlinx.coroutines.test.runTest
import org.apache.kafka.clients.producer.Producer
import org.apache.kafka.clients.producer.ProducerRecord
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.RepeatedTest

class ProducerExamples: AbstractKafkaTest() {

    companion object: KLogging() {
        private const val MESSAGE_SIZE = 100
    }

    protected lateinit var producer: Producer<String, String>

    @BeforeAll
    fun beforeAll() {
        producer = newStringKafkaProducer()
    }

    @AfterAll
    fun afterAll() {
        producer.closeSafe()
    }

    @RepeatedTest(REPEAT_SIZE)
    fun `send one message with future`() = runTest {
        val record = ProducerRecord<String?, String>(TEST_TOPIC_NAME, null, randomString())

        val future = producer.send(record).asCompletableFuture()
        producer.flush()
        val metadata = future.await()
        metadata.verifyRecordMetadata()
    }


}
