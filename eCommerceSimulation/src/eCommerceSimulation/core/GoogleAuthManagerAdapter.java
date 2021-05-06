package eCommerceSimulation.core;

import eCommerceSimulation.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
		
	}

	@Override
	public void login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
		
	}

}
