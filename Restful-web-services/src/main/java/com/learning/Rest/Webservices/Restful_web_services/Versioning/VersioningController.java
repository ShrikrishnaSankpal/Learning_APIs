package com.learning.Rest.Webservices.Restful_web_services.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	
	@GetMapping("/v1/GetName")
	public PersonV1 getPersonName() {
		
		return new PersonV1("Bob charlie");
	}
	
	@GetMapping("/v2/GetName")
	public PersonV2 getPersonV2Name() {
		
		return new PersonV2("Bob charlie the name");
	}
	
	
	@GetMapping(path = "/getName/withHeader", headers ="X_API_VERSION=1")
	public PersonV2 getPersonV2NameWithHeader() {
		
		return new PersonV2("Bob charlie the name");
	}
	
	@GetMapping(path = "/getName/withHeader", headers ="X_API_VERSION=2")
	public PersonV1 getPersonV1NameWithHeader() {
		
		return new PersonV1("Bob charlie");
	}
	
	@GetMapping(path = "/getName/Accept", produces ="application/vnd.company.app-v1+json")
	public PersonV1 getPersonV1NameWithAcceptHeader() {
		
		return new PersonV1("Bob charlie");
	}
	
}
