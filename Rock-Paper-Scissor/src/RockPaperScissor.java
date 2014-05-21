import java.util.ArrayList;
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

	public String[] tournament_winner(ArrayList<String[][]> tournament) throws NoSuchStrategyError {	
		ArrayList<String[]> partialWinner1 = new ArrayList<String[]>();
		ArrayList<String[]> partialWinner2 = new ArrayList<String[]>();
		
		if(tournament.size() == 2){
			
			for(String[][] game : tournament)
				partialWinner1.add(this.winner(game[0], game[1]));
			
			return this.winner(partialWinner1.get(0), partialWinner1.get(1));
			
		}else{
			
			for(String[][] game : tournament)
				partialWinner1.add(this.winner(game[0], game[1]));
			
			for (int i = 0; i < partialWinner1.size()-2; i++)
			    partialWinner2.add(this.winner(partialWinner1.get(i), partialWinner1.get(i+1)));
			
			return this.winner(partialWinner2.get(0), partialWinner2.get(1));
		}
		
	}

}
