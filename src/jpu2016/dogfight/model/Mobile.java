package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import jpu2016.dogfight.model.Direction;

public class Mobile implements IMobile{
	
	private Dimension dimension;
	private Position position;
	private int speed;
	private Direction direction; 
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.dimension = dimension;
		this.position = position;
		this.speed = speed;
		this.direction = direction;
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
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
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
	
	public void moveUp(){
		
	}

	public void moveRight(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void moveLeft(){
		
	}
	
	public Color getColor(){
		
		return null;
		
	}
	
	public IDogfightModel getDogfightModel(){
		
		return null;
		
	}
	
	
	
	
	
	
	
	
}
