package jpu2016.dogfight.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cloud extends Mobile {

	static int SPEED = 1;
	static int WIDTH = 300;
	static int HEIGHT = 150;
	static String IMAGE = "cloud.png";
	private BufferedImage image;

	public Cloud(Direction direction, Position position) throws IOException {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		try {

			this.image = ImageIO.read(new File("images/" + IMAGE));

		} catch (final IOException e) {

			e.printStackTrace();

		}
	}

}
