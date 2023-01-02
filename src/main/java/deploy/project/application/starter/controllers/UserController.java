package deploy.project.application.starter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import deploy.project.application.starter.model.User;
import deploy.project.application.starter.service.UserService;

/**
 * The controller class that routes GET, POST and Delete requests to the appropriate methods.
 * @author Martinraj Nadar
 */
@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * An intermediary method that invokes a method from the UserService class to get all the 
	 * users.
	 * @return the list of all users  
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	/**
	 * An intermediary method that invokes addUser method from the UserService class by 
	 * passing a new User object.
	 * @param user - object to be added to the database.
	 */
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	/**
	 * An intermediary method that invokes getUserById method from the UserService class by 
	 * passing an ID.
	 * @param id - Integer
	 * @return user - if the user exists for the given ID
	 * 		   null - if the user does not exist.
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	/**
	 * An intermediary method that invokes deleteUser method from the UserService class to delete
	 * an existing user by passing the ID.
	 * @param id - Integer
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

	/**
	 * An intermediary method that invokes verifyCredentials method of the UserService class
	 * @param userName - the user name associated with user
	 * @param password - the user's password stored in the system
	 * @return String - which signifies if the credentials are correct.
	 */
	@RequestMapping(value = "/users/{userName}/{password}", method = RequestMethod.GET)
	public String logInUser(@PathVariable String userName, @PathVariable String password) {
		return userService.verifyCredentials(userName, password);
	}

}
