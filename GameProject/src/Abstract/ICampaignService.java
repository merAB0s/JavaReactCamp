package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface ICampaignService {
	
	public void add(Campaign campaign);
	public void update(Campaign campaign);
	public void delete(Campaign campaign);
	public void sale(Campaign campaign, Game game);

}
