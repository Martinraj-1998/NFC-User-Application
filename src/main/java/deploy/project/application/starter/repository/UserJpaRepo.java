package deploy.project.application.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import deploy.project.application.starter.model.User;

/**
 * Custom Jpa repository that extends the default Spring Data Jpa Repository to
 * run a custom select query.
 * 
 * @author Martinraj Nadar
 */
public interface UserJpaRepo extends JpaRepository<User, Integer> {

	/**
	 * Method to get the user associated with the passed user name from the database
	 * 
	 * @param userName - user name associated with the user
	 * @return user - User corresponding to the passed user name in the database
	 */
	@Query("Select u from User u where u.userName =?1")
	User findUser(String userName);

}
