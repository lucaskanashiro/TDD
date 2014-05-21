import static org.junit.Assert.*;

import org.junit.Test;


public class TestRockPaperScissor {

	@Test(expected=NoSuchStrategyError.class)
	public void testWinnerWithWrongStrategy() throws NoSuchStrategyError {
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "p"};
		String[] player2 = {"Dave", "b"};
		
		game.winner(player1, player2);
	}

	@Test
	public void testWinnerOfOneGame() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		String[] winner = game.winner(player1, player2);
		
		assertEquals("Dave", winner[0]);
		assertEquals("S", winner[1]);
	}
	
	@Test
	public void testSimpleTournament() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		String[][] game1 = {player1, player2};
		
		String[] player3 = {"Richard", "R"};
		String[] player4 = {"Michael", "S"};
		
		String[][] game2 = {player3, player4};
		
		String[][][] tournament = {game1, game2};
		
		String[] winner = game.tournament_winner(tournament);
		
		assertEquals("Richard", winner[0]);
		assertEquals("R", winner[1]);
	}
	
	@Test
	public void testTournamentWith8players() throws NoSuchStrategyError{
		RockPaperScissor game = new RockPaperScissor();
		
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		String[][] game1 = {player1, player2};
		
		String[] player3 = {"Richard", "R"};
		String[] player4 = {"Michael", "S"};
		
		String[][] game2 = {player3, player4};
		
		String[][][] tournament = {game1, game2};
		
		String[] winner = game.tournament_winner(tournament);
		
		assertEquals("Richard", winner[0]);
		assertEquals("R", winner[1]);
	}
}
