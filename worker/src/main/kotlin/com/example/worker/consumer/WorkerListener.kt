package com.example.worker.consumer

import com.example.person.service.PersonService
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class WorkerListener(private val personService: PersonService) {
    private val logger = LoggerFactory.getLogger(WorkerListener::class.java)

    @KafkaListener(topics = ["\${kafka.topics.worker-event}"], autoStartup = "true")
    fun consume(consumerRecord: ConsumerRecord<String?, String?>) {
        logger.info("Test another module - {}", personService.getAll())
        logger.info("message consumed - {}", consumerRecord.value())
    }
}
