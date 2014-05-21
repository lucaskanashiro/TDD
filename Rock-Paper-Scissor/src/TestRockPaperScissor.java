import static org.junit.Assert.*;

import org.junit.Test;


public class TestRockPaperScissor {

	@Test(expected=NoSuchStrategyError.class)
	public void testWinnerWithWrongStrategy() throws NoSuchStrategyError {
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "p"};
		String[] player2 = {"Dave", "b"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		game.winner(gameOne, gameTwo);
	}

	@Test
	public void testWinnerOfOneGame() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		GameObject winner = game.winner(gameOne, gameTwo);
		
		assertEquals("Dave", winner.getPlayer()[0]);
		assertEquals("S", winner.getPlayer()[1]);
	}
	
	@Test
	public void testWinnerOfOneGameWithSameStrategy() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "P"};
		
		GameObject gameOne = new GameObject(player1);
		GameObject gameTwo = new GameObject(player2);
		
		GameObject winner = game.winner(gameOne, gameTwo);
		
		assertEquals("Armando", winner.getPlayer()[0]);
		assertEquals("P", winner.getPlayer()[1]);
	}
	
	@Test
	public void testSimpleTournament() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
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
		
		GameObject winner = game.tournament_winner(game1, game2);
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
	
	@Test
	public void testTournamentWith8players() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
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
		
		GameObject winner = game.tournament_winner(semiFinal1, semiFinal2);
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
	
	@Test
	public void testTournamentWith16players() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
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
		
		String[] player9 = {"Lua", "S"};
		String[] player10 = {"Dani", "P"};
		
		GameObject gameNine = new GameObject(player9);
		GameObject gameTen = new GameObject(player10);
		
		GameObject game5 = new GameObject(gameNine, gameTen);
		
		String[] player11 = {"Sol", "S"};
		String[] player12 = {"Sergio", "R"};
		
		GameObject gameEleven = new GameObject(player11);
		GameObject gameTwelve = new GameObject(player12);
		
		GameObject game6 = new GameObject(gameEleven, gameTwelve);
		
		String[] player13 = {"Alice", "P"};
		String[] player14 = {"Homer", "S"};
		
		GameObject gameThirteen = new GameObject(player13);
		GameObject gameFourteen = new GameObject(player14);
		
		GameObject game7 = new GameObject(gameThirteen, gameFourteen);
		
		String[] player15 = {"Ronaldo", "P"};
		String[] player16 = {"Ricardo", "S"};
		
		GameObject gameFifteen = new GameObject(player15);
		GameObject gameSixteen = new GameObject(player16);
		
		GameObject game8 = new GameObject(gameFifteen, gameSixteen);
		
		GameObject quarterFinal1 = new GameObject(game1, game2);
		GameObject quarterFinal2 = new GameObject(game3, game4);
		GameObject quarterFinal3 = new GameObject(game5, game6);
		GameObject quarterFinal4 = new GameObject(game7, game8);
		
		GameObject semiFinal1 = new GameObject(quarterFinal1, quarterFinal2);
		GameObject semiFinal2 = new GameObject(quarterFinal3, quarterFinal4);
		
		GameObject winner = game.tournament_winner(semiFinal1, semiFinal2);
		
		assertEquals("Richard", winner.getPlayer()[0]);
		assertEquals("R", winner.getPlayer()[1]);
	}
}
