import java.rmi.RemoteException;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args){
		
		Game game = new Game(5,"The Sims 4",240,"Paradox INC","Unreal Engine",2007,"Epic Games");
		
		User user = new User(5,"Abdullah","Aksoy","3333333333",2007,"Türkiye");
		System.out.println(user.toString());
		System.out.println("**********************************************");

		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		
		
		
		
		
		
		Campaign campaign = new Campaign(5,"Ramazan Kampanyasý",5);	
		System.out.println("Kampanya Oraný: " + campaign.getDiscountRate() + "%");
		System.out.println("Kampanya Ýsmi: " + campaign.getName());
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.saleCampaign(game, user, campaign);
		
		
		CampaignManager campaignManager = new CampaignManager();
		System.out.println("**********************************************");
		campaignManager.sale(campaign, game);
			
		
		MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
		mernisServiceAdapter.checkIfRealPerson(user);
		
		
		
		

	}


}
