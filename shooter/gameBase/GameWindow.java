package gameBase;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	GamePanel gamePanel;
	Dimension dim;
	
	public GameWindow(String title, int width, int height) {
		super(title);
		dim = new Dimension(width,height);
		this.setPreferredSize(dim);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		gamePanel = new GamePanel(this.dim);
		this.add(gamePanel);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		GameWindow gameWindow = new GameWindow("Game Window",800,600);

	}

}
