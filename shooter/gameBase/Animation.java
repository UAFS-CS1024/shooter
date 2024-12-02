package gameBase;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Animation {
	private ArrayList<Frame> frames;
	private int index;
	private int durationCount;
	
	public Animation() {
		this.frames = new ArrayList<Frame>();
		this.index=0;
		this.durationCount=0;
	}
	
	public void add(Frame frame) {
		this.frames.add(frame);
	}
	
	public BufferedImage nextImage() {
		Frame currentFrame = this.frames.get(index);
		if(this.durationCount<currentFrame.duration) {
			this.durationCount++;
		}else {
			this.index++;
			if(index>=this.frames.size()) {
				this.index=0;
			}
			this.durationCount=0;
		}
		return this.frames.get(index).img;
	}
}
