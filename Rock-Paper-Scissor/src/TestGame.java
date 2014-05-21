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
		assertNull(game.getGame1());
		assertNull(game.getGame2());
	}
	
	@Test
	public void testCreateAndGetGameWithAnothersGame(){
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		Game game1 = new Game(player1, player2);
		
		String[] player3 = {"Richard", "R"};
		String[] player4 = {"Michael", "S"};
		
		Game game2 = new Game(player3, player4);
		
		Game finalGame = new Game(game1, game2);
		
		assertEquals(game1, finalGame.getGame1());
		assertEquals(game2, finalGame.getGame2());
		assertNull(finalGame.getPlayer1());
		assertNull(finalGame.getPlayer2());
	}

}
