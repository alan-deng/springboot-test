package com.example.demo;

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

	@GetMapping("/ddd") // link here is equivalent of app.get("linkName") in express
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) { //@requestParam is parameters in link
		return String.format("Hello %s!", name);
	}
}