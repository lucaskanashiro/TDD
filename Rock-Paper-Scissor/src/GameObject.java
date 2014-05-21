
public class GameObject {

	private String[] player;
	private GameObject game1, game2;
	
	public GameObject(String[] player) {
		this.player = player;
		this.game1 = null;
		this.game2 = null;
	}

	public GameObject(GameObject game1, GameObject game2) {
		this.game1 = game1;
		this.game2 = game2;
		this.player = null;
	}

	public String[] getPlayer() {
		return this.player;
	}

	public GameObject getGame1() {
		return this.game1;
	}

	public GameObject getGame2() {
		return this.game2;
	}

}
