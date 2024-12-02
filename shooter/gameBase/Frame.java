package gameBase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Frame {
	BufferedImage img;
	int duration;
	
	public Frame(String imageName, int duration) {
		this.duration = duration;
		loadImage(imageName);
	}
	
	public void loadImage(String imageName) {
		File imageFile = new File("images/asteroids/medium/" + imageName);
		try {
			this.img = ImageIO.read(imageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
