import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainMenu{
	private static JFrame menuFrame;
	private static JButton newPlayerButton, loginButton,exitButton;
	public static void main(String args[]){
		menuFrame=new JFrame("MAIN MENU");
		menuFrame.setLayout(null);
		menuFrame.setDefaultCloseOperation(menuFrame.EXIT_ON_CLOSE);
		menuFrame.setLocation(500, 300);
		menuFrame.setSize(300, 300);
		menuFrame.setResizable(false);
		
		
		newPlayerButton= new JButton("NEW PLAYER");
		newPlayerButton.setSize(150, 30);
		newPlayerButton.setLocation(30, 30);
		menuFrame.add(newPlayerButton);
		
		loginButton= new JButton("LOG IN");
		loginButton.setSize(150, 30);
		loginButton.setLocation(30, 80);
		menuFrame.add(loginButton);

		exitButton= new JButton("QUIT GAME");
		exitButton.setSize(150, 30);
		exitButton.setLocation(30, 150);
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuFrame.add(exitButton);

		
		menuFrame.setVisible(true);
	}
}