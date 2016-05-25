package jpu2016.dogfight.model;

import java.io.IOException;

public class Missile extends Mobile {

	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private int player;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	int distance_Traveled = 0;
	
	public Missile(Direction direction, Position position) throws IOException{
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}
	
	public static int getWidthWithADirection(Direction direction){
		
		return WIDTH;
		
	}
	
	public static int getHeightWithADirection(Direction direction){
		
		return HEIGHT;
		
	}
	
	public void move(){
		distance_Traveled += SPEED;
	}
	
	public boolean isWeapon() {
		if(this.distance_Traveled <= MAX_DISTANCE_TRAVELED){
			return true;
		}else{
			return false;
		}
	}
	
}
