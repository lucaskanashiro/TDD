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
	
	public String[] winner(String[] player1, String[] player2) throws NoSuchStrategyError {
		if(!this.playersStrategyValid(player1[1], player2[1]))
			throw new NoSuchStrategyError();
		
		if(player1[1] == this.possibleWins.get(player2[1]))
			return player1;
		else
			return player2;
	}

}
