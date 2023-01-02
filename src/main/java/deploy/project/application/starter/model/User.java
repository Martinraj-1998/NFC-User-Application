package deploy.project.application.starter.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Data model class to store user information
 * 
 * @author Martinraj Nadar
 *
 */
@Entity
@Table(name = "Employee") // Named the table employee as User is a key word in the DB environment the
							// application connects to.
public class User {
	/**
	 * Primary key
	 */
	@Id
	private Integer id;
	/**
	 * user's password
	 */
	private String password;
	/**
	 * user's first name
	 */
	private String firstName;
	/**
	 * user's last name
	 */
	private String lastName;
	/**
	 * user's email ID
	 */
	private String emailId;
	/**
	 * user's preferred user name
	 */
	private String userName;
	/**
	 * user's LinkedIn account link
	 */
	private String linkedIn;
	/**
	 * user's Facebook account link
	 */
	private String faceBook;
	/**
	 * user's Instagram account link
	 */
	private String instagram;
	/**
	 * user's Twitter account link
	 */
	private String twitter;

	/**
	 * default no-arg constructor
	 */
	public User() {
		super();
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param id
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 * @param userName
	 * @param linkedIn
	 * @param faceBook
	 * @param instagram
	 * @param twitter
	 */
	public User(Integer id, String password, String firstName, String lastName, String emailId, String userName,
			String linkedIn, String faceBook, String instagram, String twitter) {
		super();
		this.id = id;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.userName = userName;
		this.linkedIn = linkedIn;
		this.faceBook = faceBook;
		this.instagram = instagram;
		this.twitter = twitter;
	}

	// Getters and Setters for all the instance members
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getFaceBook() {
		return faceBook;
	}

	public void setFaceBook(String faceBook) {
		this.faceBook = faceBook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

}
