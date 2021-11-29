package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
// make calculation function that will take in parameters
	@GetMapping("/ddd") // link here is equivalent of app.get("linkName") in express
	public JSONObject hello(@RequestParam(value = "name", defaultValue = "World") String name) { //@requestParam is parameters in line
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("key1","val1");
		return jsonObject;
	}
}