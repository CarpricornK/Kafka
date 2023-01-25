package org.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class KafkaSampleProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        String message2= "hi";
        Scanner sc = new Scanner(System.in);
        System.out.println("sendMessage :");
        String str = sc.nextLine();
        this.kafkaTemplate.send("test", str);
    }
}