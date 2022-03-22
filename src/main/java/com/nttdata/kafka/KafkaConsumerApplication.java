package com.nttdata.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.nttdata.kafka.model.Product;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@KafkaListener(topics = "topic-demo", groupId = "group-id")
	public void consume(Product msg) {
		System.out.println(String.format("mensajes -> %s", msg));
	}
}
