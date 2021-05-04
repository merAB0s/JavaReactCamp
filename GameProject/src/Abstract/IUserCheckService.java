package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface IUserCheckService {
	
	public boolean checkIfRealPerson(User user);
	

}
