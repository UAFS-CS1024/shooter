package gameBase;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends GameObject implements KeyListener{
	int keyCode;
	int speed;
	
	public Player(int x, int y, int width, int height, Color color, int speed) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
		this.speed=speed;
	}

	@Override
	public void update() {
		if(this.keyCode == 37) {
			this.x = this.x - this.speed;
		}
		if(this.keyCode == 39) {
			this.x = this.x + this.speed;
		}
		this.keyCode=0;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		this.keyCode = e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
