package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {
	int x, y, width, height;
	Color color;
	int speed;

	public abstract void update();
	public abstract void draw(Graphics g);
}
