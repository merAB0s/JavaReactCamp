package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.EmailService;
import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.abstracts.UserValidationService;
import eCommerceSimulation.core.AuthService;
import eCommerceSimulation.entites.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService;
	private EmailService emailService;
	private UserValidationService validationService;
	
	public AuthManager(UserService userservice,EmailService emailservice,UserValidationService validationservice) {
		this.emailService = emailservice;
		this.userService = userservice;
		this.validationService = validationservice;
	}
	

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
		User tempUser = new User(id,firstName,lastName,email,password,false);
		
		if (!validationService.validateUser(tempUser)) {
			System.out.println("\nRegistration was NOT successful!\nPlease check your infos again! = " + tempUser.getEmail());
			return;
		}
		
		if (!isEmailNotUsed(email)) {
			System.out.println("\nRegistration was NOT Successful: This E-mail is already exist! = " + tempUser.getEmail());
			return;
		}
		
		else {
			System.out.println("\nRegistration was Successful!\nPlease check your E-mail to verify your account!");
			emailService.send("\nTo verify your account use the link below:\nhttps://www.verificationTest.com/verify?id=12345",email);
			userService.add(tempUser);
		}
		
	}

	@Override
	public void login(String email, String password) {
		User tempUser = userService.getLoginInfos(email, password);
		
		if (!isAllFilled(email, password))
		{
			System.out.println("\nLogin was NOT successful!\nPlease check your infos again!");
			return;			
		}
			
		if (tempUser == null)
		{
			System.out.println("\nLogin was NOT successful!\nPlease check your email or password again!");
			return;
		}
		
		if (!isUserVerified(tempUser))
		{
			System.out.println("\nLogin was NOT successful!\nPlease verify your account!");
			return;
		}
		
		else 
		{			
			System.out.println("\nLogin was successful!\nWelcome " + tempUser.getFirstName() + " " + tempUser.getLastName());
		} 
		
	}
	
	
	private boolean isEmailNotUsed(String email) {
		return userService.getByEmail(email) == null;
	}
	
	private boolean isUserVerified(User user) {
		return user.isVerified();
	}


	private boolean isAllFilled(String email,String password) {
		
		if(email.length() > 0 && password.length() > 0) {
			return true;
		}
		return false;
	}
}