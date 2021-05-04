package Adapter;

import java.rmi.RemoteException;

import Abstract.IUserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

		try {
			boolean result=mernisCheck.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), 
							user.getFirstName().toUpperCase(), 
							user.getLastName().toUpperCase(), 
							user.getDateOfBirth());
			return result;
		} 
		catch (NumberFormatException exception) {
			exception.printStackTrace();
		} 
		catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
	}

}
