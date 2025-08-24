package com.learning.Rest.Webservices.Restful_web_services.Api_Filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DyanamicFilteringController {

	@GetMapping("/api/DynamicFiltering")
	public MappingJacksonValue filtering() {

		DyanmicFilterPmpBean empBean = new DyanmicFilterPmpBean("value1", "value2", "value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(empBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("EmpBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
	
	
	@GetMapping("/api/DynamicFilteringWithList")
	public MappingJacksonValue filteringList() {
		
		List<DyanmicFilterPmpBean> List = Arrays.asList(new DyanmicFilterPmpBean("value1", "value2", "value3"), 
				new DyanmicFilterPmpBean("value1", "value2", "value3"));
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(List);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("EmpBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}

}
