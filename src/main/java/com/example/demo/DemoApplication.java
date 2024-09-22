package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {
	private static final String VERSION;

	static {
		VERSION = DemoApplication.class.getPackage().getImplementationVersion();
	}

	public static void main(String[] args) {
		log.info("Running version: {}", VERSION);
		SpringApplication.run(DemoApplication.class, args);
	}

}
