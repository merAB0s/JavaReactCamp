package Abstract;

import Entities.Campaign;
import Entities.User;
import Entities.Game;

public interface IGameService {
	
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
	
	public void saleCampaign(Game game,User user,Campaign campaign);
	
	
	public void sell(Game game,User user);


}


