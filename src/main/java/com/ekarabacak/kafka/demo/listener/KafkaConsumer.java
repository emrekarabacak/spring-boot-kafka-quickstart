package com.ekarabacak.kafka.demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "messages")
    public void consume(final String message) {
        log.info(String.format("Consumed message %s ", message));
    }


}
