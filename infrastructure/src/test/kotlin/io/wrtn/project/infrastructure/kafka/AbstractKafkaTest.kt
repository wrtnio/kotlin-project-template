package io.wrtn.project.infrastructure.kafka

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.testcontainers.massage.KafkaServer
import io.wrtn.project.infrastructure.AbstractInfraTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeGreaterOrEqualTo
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.RecordMetadata
import org.springframework.kafka.core.KafkaTemplate

abstract class AbstractKafkaTest: AbstractInfraTest() {

    companion object: KLogging() {

        protected val kafkaServer: KafkaServer by lazy { KafkaServer.Launcher.kafka }

        const val TEST_TOPIC_NAME = "project.kafka.test-topic.1"
        const val REPEAT_SIZE = 3

    }

    protected fun newStringKafkaProducer(): KafkaProducer<String, String> {
        return KafkaServer.Launcher.createStringProducer(kafkaServer)
    }

    protected fun newStringKafkaConsumer(): KafkaConsumer<String, String> {
        return KafkaServer.Launcher.createStringConsumer(kafkaServer)
    }

    protected fun newStringKafkaTemplate(): KafkaTemplate<String, String> {
        return KafkaServer.Launcher.Spring.getStringKafkaTemplate(kafkaServer)
    }


    protected fun RecordMetadata.verifyRecordMetadata(topicName: String = TEST_TOPIC_NAME) {
        topic() shouldBeEqualTo topicName
        partition() shouldBeGreaterOrEqualTo 0
    }
}
