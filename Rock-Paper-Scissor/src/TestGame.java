import static org.junit.Assert.*;

import org.junit.Test;


public class TestGame {

	@Test
	public void testCreateAndGetGameWithPlayers() {
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		Game game = new Game(player1, player2);
		
		String[] p1 = game.getPlayer1();
		String[] p2 = game.getPlayer2();
		
		assertEquals("Armando", p1[0]);
		assertEquals("P", p1[1]);
		assertEquals("Dave", p2[0]);
		assertEquals("S", p2[1]);
	}

}
