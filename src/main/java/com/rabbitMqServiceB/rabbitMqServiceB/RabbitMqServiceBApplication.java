package com.rabbitMqServiceB.rabbitMqServiceB;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class RabbitMqServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqServiceBApplication.class, args);
	}

}
