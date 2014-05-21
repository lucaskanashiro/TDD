import static org.junit.Assert.*;

import java.util.ArrayList;

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
		
		//String[][][] tournament = {game1, game2};
		
		ArrayList<String[][]>tournament = new ArrayList<String[][]>();
		
		tournament.add(game1);
		tournament.add(game2);
		
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
		
		String[] player5 = {"Allen", "S"};
		String[] player6= {"Omer", "P"};
		
		String[][] game3 = {player5, player6};
		
		String[] player7 = {"David R.", "R"};
		String[] player8 = {"Richard X.", "P"};
		
		String[][] game4 = {player7, player8};
		
		//String[][][] tournament = {game1, game2};
		
		ArrayList<String[][]>tournament = new ArrayList<String[][]>();
		
		tournament.add(game1);
		tournament.add(game2);
		tournament.add(game3);
		tournament.add(game4);
		
		String[] winner = game.tournament_winner(tournament);
		
		assertEquals("Richard", winner[0]);
		assertEquals("R", winner[1]);
		
		
	}
}
