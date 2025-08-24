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
	
	private static int count = 0;

	static {
		users.add(new User(++count, "aditya", LocalDate.now().minusYears(30)));
		users.add(new User(++count, "sourabh", LocalDate.now().minusYears(28)));
		users.add(new User(++count, "bharat", LocalDate.now().minusYears(25)));
		users.add(new User(++count, "Hari", LocalDate.now().minusYears(25)));
	}
	
	
	public List<User> FindAll() {

		return users;

	}
	
	public User FindUser(int id) {

		Predicate<? super User> Predicate = user -> user.getUserId().equals(id);
		return users.stream().filter(Predicate).findFirst().orElse(null);

	}
	
	public void delete(int id) {

		Predicate<? super User> Predicate = user -> user.getUserId().equals(id);
		users.removeIf(Predicate);

	}
	
	public User saveUser(User user) {
		user.setUserId(++count);
		users.add(user);
		
		return user;
		
	}

}
