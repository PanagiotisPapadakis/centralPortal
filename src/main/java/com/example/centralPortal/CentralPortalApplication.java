package com.example.centralPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CentralPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralPortalApplication.class, args);
	}

}
