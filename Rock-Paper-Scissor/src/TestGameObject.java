import static org.junit.Assert.*;

import org.junit.Test;


public class TestGameObject {

	@Test
	public void testCreateAndGetGameWithPlayers() {
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		GameObject withPlayer1 = new GameObject(player1);
		GameObject withPlayer2 = new GameObject(player2);
		
		GameObject game = new GameObject(withPlayer1, withPlayer2);
		
		GameObject game1 = game.getGame1();
		String[] p1 = game1.getPlayer();
		
		assertEquals("Armando", p1[0]);
		assertEquals("P", p1[1]);
		assertNull(game1.getGame1());
		assertNull(game1.getGame2());
	}
	
	@Test
	public void testCreateAndGetGameWithAnothersGame(){
		String[] player1 = {"Armando", "P"};
		String[] player2 = {"Dave", "S"};
		
		GameObject withPlayer1 = new GameObject(player1);
		GameObject withPlayer2 = new GameObject(player2);
		
		GameObject game1 = new GameObject(withPlayer1, withPlayer2);
		
		String[] player3 = {"Richard", "R"};
		String[] player4 = {"Michael", "S"};
		
		GameObject withPlayer3 = new GameObject(player3);
		GameObject withPlayer4 = new GameObject(player4);
		
		GameObject game2 = new GameObject(withPlayer3, withPlayer4);
		
		GameObject finalGame = new GameObject(game1, game2);
		
		assertEquals(game1, finalGame.getGame1());
		assertEquals(game2, finalGame.getGame2());
		assertNull(finalGame.getPlayer());
	}

}
