package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea{

	private Dimension dimension;
	
	private Image image;
	
	public Sky(Dimension dimension) {
		// TODO Auto-generated constructor stub
		this.dimension = dimension;
		image = null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
