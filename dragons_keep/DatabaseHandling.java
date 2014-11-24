package dragons_keep;

public class DatabaseHandling {

	private static final String PLAYER_QUERY;

	private static String ROOM_QUERY;

	private static String ROOM_PUZZLE_QUERY;

	private static String ROOM_MONSTER_QUERY;

	private static String ROOM_GAME_ITEM_QUERY;

	private static String COMMANDS_QUERY;

	private static String GAME_FILES_QUERY;

	private Connection connection;

	private ResultSet resultSet;

	private Statement statement;

	private GameController gameController;

	public DatabaseHandling() {

	}

	public Connection getConnection() {
		return null;
	}

	public void setResultSet(ResultSet resultSet) {

	}

	public ResultSet getResultSet() {
		return null;
	}

	public void setStatement(Statement statement) {

	}

	public Statement getStatement() {
		return null;
	}

	public void initializeDatabase() {

	}

	public GameRoom[][] readInRooms() {
		return null;
	}

	public GamePlayer readInPlayer() {
		return null;
	}

	public GameFileHandling readInGameFiles(String user) {
		return null;
	}

	public String toString() {
		return null;
	}

}
