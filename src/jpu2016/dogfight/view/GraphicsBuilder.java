package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.*;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {

	private BufferedImage emptySky;
	private IDogfightModel dogfightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {

		this.emptySky = new BufferedImage(0,0,BufferedImage.TYPE_INT_RGB);
		this.dogfightModel = dogfightModel;

	}

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
