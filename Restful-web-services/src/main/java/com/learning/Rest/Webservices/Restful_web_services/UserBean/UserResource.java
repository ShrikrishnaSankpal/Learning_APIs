package com.learning.Rest.Webservices.Restful_web_services.UserBean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;
	
	@RequestMapping("/users")
	public List<User> getDetails(){
		
		return 	userDaoService.FindAll();
	}
	
	
	@RequestMapping("/users/{id}")
	public User getDetailsOfUser(@PathVariable int id){
		
		return 	userDaoService.FindUser(id);
	}
}
