package com.example.srikanthClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SrikanthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrikanthClientApplication.class, args);
	}

}
