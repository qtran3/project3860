import javax.swing.JFrame;


public abstract class subUIProcessing {
	private JFrame myFrame, parentFrame;
	private boolean isDone;
	public subUIProcessing(JFrame parentFrame){
		this.parentFrame=parentFrame;
		
	}
	public abstract void initialize();// kind of myFrame=new JFrame();
	public abstract void process();
	public void doSubProcess(){
		isDone=false;
		parentFrame.show(false);
		

	}
}