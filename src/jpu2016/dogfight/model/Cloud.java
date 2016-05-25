package jpu2016.dogfight.model;

import java.io.IOException;

public class Cloud extends Mobile{

	static int SPEED = 1;
	static int WIDTH = 300;
	static int HEIGHT = 150;
	static String IMAGE = "cloud";
	
	public Cloud(Direction direction, Position position) throws IOException{
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}
	
}
