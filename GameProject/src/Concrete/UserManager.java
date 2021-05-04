package Concrete;



import Abstract.IUserCheckService;
import Abstract.IUserService;
import Entities.User;

public class UserManager implements IUserService{

	private IUserCheckService userCheckService;
	
	public UserManager(IUserCheckService gamerCheckService) {
		this.userCheckService = gamerCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println("Valid person");	
			System.out.println(user.getFirstName() + " kayýt edildi.");
		}else {
			System.out.println("Invalid person");
			System.out.println(user.getFirstName() + " did not register.");
		}	
	}
	
	
	
	
	

	@Override
	public void update(User user) {
			System.out.println(user.getLastName() + " isimli oyuncu güncellendi.");
		
	}

	@Override
	public void delete(User user) {
			System.out.println(user.getFirstName() + " isimli oyuncu silindi.");
		
	}



}
