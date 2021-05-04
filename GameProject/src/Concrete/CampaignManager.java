package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscountRate() + " indirimle oranýyla " + campaign.getName() + " adlý kampanya oluþturuldu." );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya silindi.");
		
	}

	@Override
	public void sale(Campaign campaign, Game game) {
		System.out.println("Kullanýlan Kampanya: " + campaign.getName() + '\n' +
							"Oyun Ýsmi: " + game.getName() + '\n' +
					"Kampanya Oraný: " + campaign.getDiscountRate() + "%" + '\n' +
					"Kampanya Öncesi Oyun Fiyatý: " + game.getPrice() + "$" + '\n' + 
					"Kampanya Sonrasý Oyun Fiyatý: " + (game.getPrice() / campaign.getDiscountRate()) + "$" + '\n' 
					
					
						 );
		
	}

	

}
