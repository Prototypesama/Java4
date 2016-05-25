package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class Sky implements IArea {

	private Dimension dimension;

	private Image image;
	private static String IMAGE = "Sky.png";

	public Sky(Dimension dimension) {
		// TODO Auto-generated constructor stub
		this.dimension = dimension;
		try {

			this.image = ImageIO.read((ImageInputStream) new File("images/" + IMAGE));

		} catch (final IOException e) {

			e.printStackTrace();

		}
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
