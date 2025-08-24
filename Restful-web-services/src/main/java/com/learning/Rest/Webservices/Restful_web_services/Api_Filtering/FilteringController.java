package com.learning.Rest.Webservices.Restful_web_services.Api_Filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/api/Filtering")
	public empBean filtering() {
		return new empBean("value1","value2","value3");
	}

}
