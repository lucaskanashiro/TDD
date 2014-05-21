import java.util.HashMap;


public class RockPaperScissor {

	private String[] validStrategy = {"P", "S", "R"};
	private HashMap<String, String>possibleWins = new HashMap<String,String>();
	
	public RockPaperScissor(){
		this.possibleWins.put("P", "S");
		this.possibleWins.put("R", "P");
		this.possibleWins.put("S", "R");
	}
	
	private boolean playersStrategyValid(String strategyPlayer1, String strategyPlayer2){
		boolean okPlayer1=false, okPlayer2 = false;
		
		for(int i=0; i<this.validStrategy.length; i++){
			if(strategyPlayer1 == this.validStrategy[i]) 
				okPlayer1=true;
			if(strategyPlayer2 == this.validStrategy[i])
				okPlayer2=true;
		}
		
		return okPlayer1 && okPlayer2;
	}
	
	public GameObject winner(GameObject game1, GameObject game2) throws NoSuchStrategyError {
		if(!this.playersStrategyValid(game1.getPlayer()[1], game2.getPlayer()[1]))
			throw new NoSuchStrategyError();
		
		if(game1.getPlayer()[1] == this.possibleWins.get(game2.getPlayer()[1]))
			return game1;
		else if(game1.getPlayer()[1] == game2.getPlayer()[1])
			return game1;
		else
			return game2;
	}

	public GameObject tournament_winner(GameObject tournament1, GameObject tournament2) throws NoSuchStrategyError {	
		
		if(tournament1.getPlayer() != null)
			return this.winner(tournament1, tournament2);
		
		return this.tournament_winner(this.tournament_winner(tournament1.getGame1(), tournament1.getGame2()), 
				this.tournament_winner(tournament2.getGame1(), tournament2.getGame2()));
	}

}
