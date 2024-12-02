package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends GameObject{
	
	public Square(int x, int y, int width, int height, Color color) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
	}

	@Override
	public void update() {
		if(this.x > 800) {
			this.x = -50;
		}
		this.x = this.x + 5;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y,this.width,this.height);
		
	}

}
