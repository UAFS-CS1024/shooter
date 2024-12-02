package gameBase;

import java.awt.Graphics;

public class AsteroidWithAnimation extends GameObject {
	Animation animation;
	
	public AsteroidWithAnimation(int x, int y, int speed, Animation animation) {
		this.x = x;
		this.y = y;
		this.speed =speed;
		this.animation = animation;
	}

	@Override
	public void update() {
		this.x = this.x + this.speed;
		if(this.x>800) {
			this.x = -50;
		}
	}

	@Override
	public void draw(Graphics g) {

		g.drawImage(this.animation.nextImage(),this.x,this.y,null);
		
	}

}
