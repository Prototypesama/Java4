package jpu2016.gameframe;

import java.awt.image.ImageObserver;
import java.awt.Graphics;

public interface IGraphicsBuilder {
	
	void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	int getGlobalWidth();
	int getGlobalHeight();
	
}
