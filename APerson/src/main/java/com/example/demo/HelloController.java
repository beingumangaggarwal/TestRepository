package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @RequestMapping("/hi")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }

	 @RequestMapping("/hello")
	    public String indextwo() {
	        return "Greetings from Spring Boot hello!";
	    }

	 

}
