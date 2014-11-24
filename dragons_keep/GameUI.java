package dragons_keep;

public class GameUI extends javafx.application.Application {

	private Scene scene;

	private BorderPane borderPane;

	private GridPane gridPane;

	private Image image;

	private Label textDisplay;

	private Button roomButton;

	private Label commandHelpMenu;

	private TextField commandEntry;

	private VBox helpCommandViewArea;

	private VBox textCommandViewArea;

	private CommandListener listener;

	private GameMap map;

	private GameFileHandling files;

	private TextCommandHandler commandHandler;

	private GamePlayer player;

	private String PLAYER_IMAGE;

	private GameController gameController;

	private GameFileHandling gameFileHandling;

	public GameUI(GameMap gameMap, GameFileHandling gameFiles, TextCommandHandler textHandler, GamePlayer gamePlayer) {

	}

	public void start(Stage stage) {

	}

	public void displayHeroPosition() {

	}

	public GameMap getMap() {
		return null;
	}

	public GameFileHandling getFiles() {
		return null;
	}

	public TextCommandHandler getCommandHandler() {
		return null;
	}

	public GamePlayer getPlayer() {
		return null;
	}

	public String getPLAYER_IMAGE() {
		return null;
	}

	public TextField getCommandEntry() {
		return null;
	}

	public class CommandListener {

		private javafx.event.EventHandler_ActionEvent_ javafx.event.EventHandler_ActionEvent_;

		@Override
		public void handle() {

		}

	}

}
