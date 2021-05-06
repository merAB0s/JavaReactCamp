package eCommerceSimulation.business.concretes;

import java.util.List;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entites.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void verifyUser(int id) {
		User tempUser = userDao.getById(id);
		System.out.println("\nSuccess: " + tempUser.getEmail() + "is verified!");
		tempUser.setVerified(true);
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public User getLoginInfos(String email, String password) {
		return userDao.getLoginInfos(email, password);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();

	}

}
