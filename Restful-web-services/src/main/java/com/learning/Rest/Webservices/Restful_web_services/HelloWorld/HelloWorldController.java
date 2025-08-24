package com.learning.Rest.Webservices.Restful_web_services.HelloWorld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;

	}
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
	
	
	@RequestMapping(method= RequestMethod.GET, path ="/HelloInterntionalization")
	public String helloWorldIternationalization() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("Good.morning.message", null, "Default message", locale);
		
		
	}
	
}
