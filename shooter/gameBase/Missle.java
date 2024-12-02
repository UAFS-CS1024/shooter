package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public class Missle extends GameObject{
	
	public Missle(int x, int y, int width, int height, Color color) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
	}

	@Override
	public void update() {
	
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x, this.y,this.width,this.height);
		
	}

}
