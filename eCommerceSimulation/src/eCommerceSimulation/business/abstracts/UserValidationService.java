package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entites.concretes.User;

public interface UserValidationService {
	
	boolean validateUser(User user);

}
