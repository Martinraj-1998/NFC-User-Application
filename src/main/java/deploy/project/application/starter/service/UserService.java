package deploy.project.application.starter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deploy.project.application.starter.model.User;
import deploy.project.application.starter.repository.UserJpaRepo;
import deploy.project.application.starter.repository.UserRepository;

/**
 * Service class that interacts with the Repository class to fetch details from
 * the database
 * 
 * @author Martinraj Nadar
 */
@Service
public class UserService {

	/**
	 * User Repository instance
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * UserJpaRepo instance
	 */
	@Autowired
	private UserJpaRepo jpaRepo;

	/**
	 * Method to get the list of all the users from the database
	 * 
	 * @return <List> User - List representation of all the users in the system.
	 */
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	/**
	 * Method to add a new user to the system
	 * 
	 * @param user - User object to be saved in the database
	 */
	public void addUser(User user) {
		userRepository.save(user);

	}

	/**
	 * Method to get a specific user from the database
	 * 
	 * @param id - the unique identifier of a user in the database
	 * @return User - if the user exists Null - if the user doesn't exist
	 */
	public Optional<User> getUserById(Integer id) {
		return userRepository.findById(id);
	}

	/**
	 * Method to delete a specific user from the database
	 * 
	 * @param id - the ID of the user to be deleted
	 */
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	/**
	 * Method to check if the user name and password are correct
	 * 
	 * @param userName - the registered user name in the database
	 * @param password - password corresponding to the user name in the database.
	 * @return String - message stating whether the credentials were successfully
	 *         verified or not.
	 */
	public String verifyCredentials(String userName, String password) {
		User user = jpaRepo.findUser(userName);
		if (user == null) {
			return "username doesn't exist";
		}
		if (user.getPassword().equals(password)) {
			return "credentials verified";
		}
		return "Invalid password";
	}
}
