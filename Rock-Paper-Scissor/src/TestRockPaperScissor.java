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
}
