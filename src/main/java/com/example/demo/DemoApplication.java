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
	@GetMapping("/planetCalc") // link here is equivalent of app.get("linkName") in express
	// @RequestParam Type variableName
	// Request to give calculator planet1 planet2 speed speedUnit
	public JSONObject hello(@RequestParam(defaultValue = "earth") String planet1, @RequestParam String planet2, @RequestParam double speed, @RequestParam String speedUnit) { //@requestParam is parameters in line
		JSONObject jsonObject = new JSONObject();

		//Calculator class
		Calculator calc = new Calculator(planet1,planet2,speed,speedUnit);
		calc.convert();
		double convertedTime = calc.calculateTime();
		//


		jsonObject.put("time",convertedTime);

		return jsonObject;
	}
}