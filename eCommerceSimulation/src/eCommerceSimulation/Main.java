package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.AuthManager;
import eCommerceSimulation.business.concretes.EmailManager;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.business.concretes.UserValidationManager;
import eCommerceSimulation.core.AuthService;
import eCommerceSimulation.core.GoogleAuthManagerAdapter;
import eCommerceSimulation.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new InMemoryUserDao());
		
		AuthService authService = new AuthManager(userService, new EmailManager(), new UserValidationManager());
		
		System.out.println("\n######### Register Tests #########");
		
		
		authService.register(1, "Abdullah", "Aksoy", "cxg2520@gmail.com", "testtest123"); // Sorun yok.
		authService.register(2, "Abdullah", "Aksoy", "yanlýsemail", "testtest123"); // E-Mail yanlýþ.
		authService.register(3, "Abdullah", "Aksoy", "testmail@gmail.com", "invld");  // Þifre 6 haneden az.
		authService.register(4, "A", "A", "testmail2@gmail.com", "validpassword123");  // Ýsim veya Soyisim 2 karakterden az.
		authService.register(5, "Abdullah", "Aksoy", "cxg2520@gmail.com", "123valid123");  // E-Mail zaten kullanýlmýþ.
		authService.register(6, "", "", "denemeuye@gmail.com", "denemeuye123");  // Ýsim veya Soyisim boþ.
		
		
		System.out.println("\n----------------------------------------------------------------\n");

		
		authService.login("cxg2520@gmail.com", "123test123"); // Bilgiler doðru fakat doðrulama yapýlmamýþ.
		userService.verifyUser(1); // Kullanýcý doðrulandý.
		authService.login("cxg2520@gmail.com", "123test"); // þifre yanlýþ.
		authService.login("cxg25200@gmail.com", "123test123"); // e-mail yanlýþ.
		authService.login("cxg2520@gmail.com", ""); // Þifre boþ.
		authService.login("", "123test123"); // E-Mail boþ.
		authService.login("cxg2520@gmail.com", "123test123"); // Baþarýlý.
		
		userService.getAll(); // Giriþ yapýlan bütün kullanýcýlarý gösterir.
		
		
		System.out.println("\n\n\n######### Google Log in Simulation #########");
		
		AuthService googleLoginService = new GoogleAuthManagerAdapter();
		googleLoginService.register(6, "Google", "Test", "googletest@gmail.com", "googletest123");
		googleLoginService.login("googletest@gmail.com", "googletest123");
		



		
		
		
		
		
		


	}

}
