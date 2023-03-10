package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaGatherApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaGatherApplication.class, args);
    }

}