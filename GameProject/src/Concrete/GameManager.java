package Concrete;

import Abstract.IGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli " + game.getEngine() + " moturlu " + game.getDeveloper() + " yapımcılı " + game.getPlatform() + " platformunda " + game.getReleaseDate() + " yılında piyasıya sürülen oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + "adlı oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + "adlı oyun silindi.");
		
	}

	@Override
	public void sell(Game game, User user) {
		System.out.println(game.getName() + " isimli oyun silindi.");
		
	}


	@Override
	public void saleCampaign(Game game, User user, Campaign campaign) {
		System.out.println(game.getName() + " isimli oyun " + user.getFirstName() + " tarafından " + campaign.getName() + " isimli kampanya ile " + campaign.getDiscountRate() + "% indirimle " + (game.getPrice() / campaign.getDiscountRate()) + "$'ye satıldı.");
		
	}
	
	

}
