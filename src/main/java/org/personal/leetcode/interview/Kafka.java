package org.personal.leetcode.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;

import java.util.concurrent.CompletableFuture;

public class Kafka {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;


    public void sendMessage(String topic, Object message) {

        CompletableFuture<SendResult<String, Object>> send = kafkaTemplate.send(topic, message);

//        @Override
//                on
//
//
//        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, message);
    }
}
