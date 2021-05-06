package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String message, String email) {
		System.out.println("\nMessage sent: " + message + "\nTo: " + email );
	}


}
