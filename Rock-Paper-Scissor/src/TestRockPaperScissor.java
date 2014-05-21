import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestRockPaperScissor {
	
	private RockPaperScissor game;
	
	@Before
	public void setUp(){
		this.game = new RockPaperScissor();
	}

	@Test(expected=NoSuchStrategyError.class)
	public void testWinnerWithWrongStrategy() throws NoSuchStrategyError {
		String[] player1 = {"Armando", "p"};
		String[] player2 = {"Dave", "b"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		this.game.winner(gameOne, gameTwo);
	}

	@Test
	public void testWinnerOfOneGame() throws NoSuchStrategyError{
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		GameObject winner = this.game.winner(gameOne, gameTwo);
		
		assertEquals("Dave", winner.getPlayer()[0]);
		assertEquals("S", winner.getPlayer()[1]);
	}
	
	@Test
	public void testWinnerOfOneGameWithSameStrategy() throws NoSuchStrategyError{	
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "P"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		GameObject winner = this.game.winner(gameOne, gameTwo);
		
		assertEquals("Armando", winner.getPlayer()[0]);
		assertEquals("P", winner.getPlayer()[1]);
	}
	
	@Test
	public void testSimpleTournament() throws NoSuchStrategyError{
		GameObject gameWith4players = this.createTournamentWith8Players()[0];
		
		GameObject winner = this.game.tournament_winner(gameWith4players.getGame1(), gameWith4players.getGame2());
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
	
	@Test
	public void testTournamentWith8players() throws NoSuchStrategyError{
		GameObject semiFinal1 = this.createTournamentWith8Players()[0];
		GameObject semiFinal2 = this.createTournamentWith8Players()[1];
		
		GameObject winner = this.game.tournament_winner(semiFinal1, semiFinal2);
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
	
	@Test
	public void testTournamentWith16players() throws NoSuchStrategyError{
		GameObject quarterFinal1 = this.createTournamentWith8Players()[0];
		GameObject quarterFinal2 = this.createTournamentWith8Players()[1];
		GameObject quarterFinal3 = this.createTournamentWith8Players()[0];
		GameObject quarterFinal4 = this.createTournamentWith8Players()[1];
		
		GameObject semiFinal1 = new GameObject(quarterFinal1, quarterFinal2);
		GameObject semiFinal2 = new GameObject(quarterFinal3, quarterFinal4);
		
		GameObject winner = this.game.tournament_winner(semiFinal1, semiFinal2);
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
	
	private GameObject[] createTournamentWith8Players(){
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		GameObject game1 = new GameObject(gameOne, gameTwo);
		
		String[] player3 = {"Richard", "R"};
		String[] player4 = {"Michael", "S"};
		
		GameObject gameThree = new GameObject(player3);
		GameObject gameFour = new GameObject(player4);
		
		GameObject game2 = new GameObject(gameThree, gameFour);
			
		String[] player5 = {"Allen", "S"};
		String[] player6= {"Omer", "P"};
		
		GameObject gameFive = new GameObject(player5);
		GameObject gameSix = new GameObject(player6);
		
		GameObject game3 = new GameObject(gameFive, gameSix);
		
		String[] player7 = {"David R.", "R"};
		String[] player8 = {"Richard X.", "P"};
		
		GameObject gameSeven = new GameObject(player7);
		GameObject gameEight = new GameObject(player8);
		
		GameObject game4 = new GameObject(gameSeven, gameEight);
		
		GameObject semiFinal1 = new GameObject(game1, game2);
		GameObject semiFinal2 = new GameObject(game3, game4); 
		
		GameObject[] result = {semiFinal1, semiFinal2};
		
		return result;
	}
}
