package com.dpb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingWithRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagingWithRabbitApplication.class, args).close();
    }
}
