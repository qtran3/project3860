package dragons_keep;

public class GameMonster extends GameCharacter {

	private String description;

	private String terminator;

	private String attackDescription;

	private boolean isDefeated;

	private GameCharacter gameCharacter;

	private GameRoom gameRoom;

	public GameMonster(String name, String health, String strength, String description, String terminator, String attackDescription) {

	}

	public boolean getIsDefeated() {
		return false;
	}

	public void setIsDefeated(String isDefeated) {

	}

	public String getDescription() {
		return null;
	}

	public String getTerminator() {
		return null;
	}

	public String getAttackDescription() {
		return null;
	}

	public void simulateBattle(GamePlayer player) {

	}

	public String toString() {
		return null;
	}

}
