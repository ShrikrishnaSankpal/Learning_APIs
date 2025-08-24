package com.learning.Rest.Webservices.Restful_web_services.Api_Filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringController {
	
	@GetMapping("/api/StaticFiltering")
	public empBean filtering() {
		return new empBean("value1","value2","value3");
	}

}
