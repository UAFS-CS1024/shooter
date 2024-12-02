package gameBase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	Dimension dim;
	GameObject[] gameObjects;
	Player player;
	Timer gameLoop;
		
	
	public GamePanel(Dimension dim) {
		super();
		this.dim = dim;
		this.setPreferredSize(dim);
		this.setBackground(Color.black);
		gameObjects = new GameObject[4];
		gameObjects[0] = new Asteroid(10,10,5);
		gameObjects[1] = new Asteroid(100,100,8,"b40000.png");
		gameObjects[2] = new Asteroid(300,300,3,"c10000.png");
		
		Animation animation = new Animation();
		animation.add(new Frame("b40000.png",5));
		animation.add(new Frame("b40001.png",5));
		animation.add(new Frame("b40002.png",5));
		animation.add(new Frame("b40003.png",5));
		animation.add(new Frame("b40004.png",5));
		animation.add(new Frame("b40005.png",5));
		animation.add(new Frame("b40006.png",5));
		animation.add(new Frame("b40007.png",5));
		animation.add(new Frame("b40008.png",5));
		animation.add(new Frame("b40009.png",5));
		animation.add(new Frame("b40010.png",5));
		animation.add(new Frame("b40011.png",5));
		animation.add(new Frame("b40012.png",5));
		gameObjects[3] = new AsteroidWithAnimation(200,200,4,animation);
		player = new Player(400,500,75,50,Color.blue,10);
		this.addKeyListener(player);
		this.setFocusable(true);
		
		gameLoop = new Timer(30,this);
		gameLoop.start();
	}
	
	public void update() {
		int index;
		
		for(index=0;index<this.gameObjects.length;index++) {
			this.gameObjects[index].update();
		}
		player.update();
	}
	
	public void draw(Graphics g) {
		int index;
		
		for(index=0;index<this.gameObjects.length;index++) {
			this.gameObjects[index].draw(g);
		}
		player.draw(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.draw(g);
		
		Toolkit.getDefaultToolkit().sync();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
		this.repaint();
	}

}
