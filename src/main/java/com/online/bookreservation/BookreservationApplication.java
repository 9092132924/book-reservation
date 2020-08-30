package com.online.bookreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookreservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookreservationApplication.class, args);
	}

}
