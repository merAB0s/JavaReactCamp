package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entites.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	


	@Override
	public void add(User user) {
		System.out.println("\nUser is added successfully!\nAdded User: " + user.getId() + " | " + user.getFirstName() + " " + user.getLastName());
		System.out.println("-----------------------------------------------------------------");
		users.add(user);

		
	}

	@Override
	public void update(User user) {
		System.out.println("\nUser is updated successfully!\nUpdated User: " + user.getId() + " | " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("\nUser is deleted successfully!\nDeleted User: " + user.getId() + " | " + user.getFirstName() +  " " + user.getLastName());
		users.removeIf(usr -> usr.getId() == user.getId());
		
	}

	@Override
	public User getById(int id) {
		for(User user : users) {
			if (user.getId() == id)
			{
					return user;
			}
		}
	

		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if (user.getEmail() == email) {
				return user;
			}
			
		}
		return null;
	}

	@Override
	public User getLoginInfos(String email, String password) {
		for(User user : users) {
			if (user.getPassword() == password && user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("\n\n######### All Users in Database #########\n--------------------------------------------------");

		for (User user : users) {
			System.out.println("Id: " + user.getId() + "\nUser: " + user.getFirstName() + " " + user.getLastName() + "\nE-Mail: " + user.getEmail() + "\nUser Verification Status: " + user.isVerified() + "\n------------------------------------------");
		}
		return null;
	}


}
