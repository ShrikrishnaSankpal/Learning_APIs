package com.learning.Rest.Webservices.Restful_web_services.UserBean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	/*  We are going to create APIs to create/update/delete user and APIs to see their posts
	 * using Spring data JPA/ hibernate
*/
	
	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "aditya", LocalDate.now().minusYears(30)));
		users.add(new User(2, "sourabh", LocalDate.now().minusYears(28)));
		users.add(new User(3, "bharat", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Hari", LocalDate.now().minusYears(25)));
	}

	public List<User> FindAll() {

		return users;

	}
	
	public User FindUser(int id) {

		Predicate<? super User> Predicate = user -> user.getUserId().equals(id);
		return users.stream().filter(Predicate).findFirst().get();

	}

}
