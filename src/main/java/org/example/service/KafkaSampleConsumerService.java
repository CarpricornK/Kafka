package org.example.service;
import org.example.TestVo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSampleConsumerService {

    @KafkaListener(topics = "test", groupId = "group-id-oing")
    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
    }
//    @KafkaListener(topics = "test", groupId = "group-id-oing")
//    public void consumet(TestVo message) throws IOException {
//        System.out.println("receive message : " + message);
//    }
}