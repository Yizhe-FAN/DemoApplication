package com.yfa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@GetMapping("/index")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/addition")
	public String addition(@RequestParam(value = "valueA", defaultValue = "1") String valueA, @RequestParam(value = "valueB", defaultValue = "1") String valueB) {
		int locRes = Integer.parseInt(valueA) + Integer.parseInt(valueB);
		return locRes + "";
	}
}
