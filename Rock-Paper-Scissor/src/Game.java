
public class Game {

	private String[] player1, player2;
	private Game game1, game2;
	
	public Game(String[] player1, String[] player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.game1 = null;
		this.game2 = null;
	}

	public Game(Game game1, Game game2) {
		this.game1 = game1;
		this.game2 = game2;
		this.player1 = null;
		this.player2 = null;
	}

	public String[] getPlayer1() {
		return this.player1;
	}

	public String[] getPlayer2() {
		return this.player2;
	}

	public Game getGame1() {
		return this.game1;
	}

	public Game getGame2() {
		return this.game2;
	}

}
