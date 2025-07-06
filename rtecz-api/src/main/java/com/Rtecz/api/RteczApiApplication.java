package com.Rtecz.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.Rtecz.domain.model")
public class RteczApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RteczApiApplication.class, args);
	}

}
