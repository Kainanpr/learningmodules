package com.example.worker.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WorkerListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerListener.class);

    @KafkaListener(topics = "${kafka.topics.worker-event}", autoStartup = "true")
    public void consume(ConsumerRecord<String, String> consumerRecord) {
        LOGGER.info("message consumed - {}", consumerRecord.value());
    }
}
