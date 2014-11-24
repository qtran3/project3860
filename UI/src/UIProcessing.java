import javax.swing.JFrame;


public abstract class UIProcessing extends JFrame{
	private UIProcessing parrentUI;
	public abstract void initialize();
	public UIProcessing( UIProcessing parrent) {
		super();
		initialize();
		parrentUI = parrent;
	}
	public abstract void resumeUI(UIProcessing aubUI, Object resultFromSubUI);
}
