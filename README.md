# NFC-User-Application


Complete Project Report- [SE Final Project Report.pdf](https://github.com/Martinraj-1998/NFC-User-Application/files/10334254/SE.Final.Project.Report.pdf)


This is a backend Spring Boot Application developed to support a NFC Business Card Service. The service allowed new users to first get registered and create a profile 
consisting of their account links like Instagram, Facebook, linkedIn to name a few. The registered user's profile was then accessed using an NFC card that had a URL 
to the user's profile.

The application was deployed on AWS Elastic Beanstalk by packaging it into a JAR file using Maven. The user details were stored in relational database by Azure. 
REST-ful APIs that form the controller class of the application along with their usage is mentioned below-


API 1- GET request to get a user passing the {id} in the URL 
URL- http://restapibackend-env.eba-bnqkb2zz.us-east-2.elasticbeanstalk.com/users/{user ID}
Returns- The user object if the user exists else returns null


API 2- POST request to add a new user into the DB 
URL- http://restapibackend-env.eba-bnqkb2zz.us-east-2.elasticbeanstalk.com/users

Request body contains all the details to be entered into the DB in following format-
JSON
eg-
{
    "id": 7,
    "password": "Test@999",
    "firstName": "Test",
    "lastName": "Test",
    "emailId": "Test@test.com",
    "userName": "Test",
    "linkedIn": "Test",
    "faceBook": "Test",
    "instagram": "Test",
    "twitter": "Test"
}


API 3- GET request to verify the user credentials
URL- http://restapibackend-env.eba-bnqkb2zz.us-east-2.elasticbeanstalk.com/users/{username}/{Password}

Returns a string value for the following cases
Case 1-
username is not correct
response string : "username doesn't exist"

Case 2- 
password is incorrect
response string : "Invalid password"

Case 3-
username and password both are correct
response string : "credentials verified"
		
				
API 4- DELETE request to delete an existing user by passing the ID
URL- http://restapibackend-env.eba-bnqkb2zz.us-east-2.elasticbeanstalk.com/users/{user id}

Deletes the user from the database


API 5- GET request to get the list of all the users in the system
URL- http://restapibackend-env.eba-bnqkb2zz.us-east-2.elasticbeanstalk.com/users
