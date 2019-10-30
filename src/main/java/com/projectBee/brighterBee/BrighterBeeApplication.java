package com.projectBee.brighterBee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.projectBee")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.projectBee.model"})  // scan JPA entities
public class BrighterBeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrighterBeeApplication.class, args);
	}

}
