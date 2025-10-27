package com.malves.myousic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyousicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyousicApplication.class, args);
		System.out.println("🎵 mYOUsic Quotes API rodando em http://localhost:8080/quotes");
	}

}
