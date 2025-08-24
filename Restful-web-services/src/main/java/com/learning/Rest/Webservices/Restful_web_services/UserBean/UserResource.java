package com.learning.Rest.Webservices.Restful_web_services.UserBean;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learning.Rest.Webservices.Restful_web_services.Exceptions.userNotFoundException;

import jakarta.validation.Valid;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;

	@GetMapping("/getAllUsers")
	public List<User> getDetails() {

		return userDaoService.FindAll();
	}

	@PostMapping("/getUserById/{id}")
	public User getDetailsOfUser(@PathVariable int id) {
		User user = userDaoService.FindUser(id);
		if (user == null) {
			throw new userNotFoundException("id" + id);
		}
		return user;
	}

	@PostMapping("/addUser")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {

		User Createduser = userDaoService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(Createduser.getUserId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/Remove/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userDaoService.delete(id);
	}

}
