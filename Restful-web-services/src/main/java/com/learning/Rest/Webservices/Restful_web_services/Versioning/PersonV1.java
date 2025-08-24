package com.learning.Rest.Webservices.Restful_web_services.Versioning;

public class PersonV1 {

	String name;

	public PersonV1(String Name) {
		this.name = Name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}

	
	
}
