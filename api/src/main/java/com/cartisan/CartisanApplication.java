package com.cartisan;

import com.github.vanroy.springboot.autoconfigure.data.jest.ElasticsearchJestAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;

@SpringBootApplication(exclude = {ElasticsearchAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class,ElasticsearchJestAutoConfiguration.class})
public class CartisanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartisanApplication.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }
}