package com.learning.Rest.Webservices.Restful_web_services.Api_Filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties("field1")
public class empBean {

	String field1;

	@JsonIgnore
	String field2;

	String field3;

	public empBean(String string, String string2, String string3) {
		//super();
		this.field1 = string;
		this.field2 = string2;
		this.field3 = string3;
	}

	/**
	 * @return the field1
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * @return the field2
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * @return the field3
	 */
	public String getField3() {
		return field3;
	}

	
	
}
