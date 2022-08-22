package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {
	
	@GetMapping("/welcome")
	  String welcomeMessage() {
	    return "Welcome!!!!";
	  }
	
	@GetMapping("/welcome/{name}")
	  public String welcomeMessage(@PathVariable String name) {
	    return "Hello There! Welcome "+name;
	  }
	
	
}
