package deploy.project.application.starter.repository;

import org.springframework.data.repository.CrudRepository;

import deploy.project.application.starter.model.User;

/**
 * Repository class that extends the CRUD Repository provided by Spring Data JPA
 * to Get, Save, and Delete users from the database
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
