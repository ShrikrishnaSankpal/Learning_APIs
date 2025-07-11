package com.learning.Rest.Webservices.Restful_web_services.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method= RequestMethod.GET, path ="/Hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	// Another Way of Writing above API 
	
	@GetMapping("/HelloWorld")
	public String hello_World() {
		return "Hello World with GetMapping";
	}
	
	
	//Hello World API with Java Bean
	
	@GetMapping("/HelloWorldBean")
	public HelloWorldBean hello_WorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	
	//Hello World API with path variable
	
	@GetMapping("/HelloWorld/path/{name}")
	public HelloWorldBean WorldBeanpath(@PathVariable String name) {
		return new HelloWorldBean("Hello Good morning   "+ name);
	}
	
	
}
