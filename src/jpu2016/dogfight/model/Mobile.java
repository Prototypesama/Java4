package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jpu2016.dogfight.model.Direction;

public class Mobile implements IMobile {

	private Dimension dimension;
	private Position position;
	private int speed;
	private Direction direction;
	private Image[] images;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) throws IOException {
		this.dimension = dimension;
		this.position = position;
		this.speed = speed;
		this.direction = direction;
		buildAllimages(image);
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		Point point = null;
		point.setLocation(position.getX(), position.getY());
		return point;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return dimension.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return dimension.getHeight();
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	public void moveUp() {
		
		this.setDirection(Direction.UP);
		
	}

	public void moveRight() {
		
		this.setDirection(Direction.RIGHT);

	}

	public void moveDown() {
		
		this.setDirection(Direction.DOWN);

	}

	public void moveLeft() {
		
		this.setDirection(Direction.LEFT);

	}

	public Color getColor() {

		return null;

	}

	public IDogfightModel getDogfightModel() {

		return null;

	}

	private void buildAllimages(final String imageName) throws IOException {

		this.images = new Image[4];

		this.images[Direction.UP.ordinal()] = ImageIO.read(new File("images/" + imageName + "_UP.png"));

		this.images[Direction.RIGHT.ordinal()] = ImageIO.read(new File("images/" + imageName + "_RIGHT.png"));

		this.images[Direction.DOWN.ordinal()] = ImageIO.read(new File("images/" + imageName + "_DOWN.png"));

		this.images[Direction.LEFT.ordinal()] = ImageIO.read(new File("images/" + imageName + "_LEFT.png"));

	}

	@Override

	public Image getImage() {

		return this.images[this.direction.ordinal()];

	}

}
