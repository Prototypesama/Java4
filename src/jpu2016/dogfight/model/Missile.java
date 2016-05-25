package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private int player;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	int distance_Traveled = 0;
	
	public Missile(Direction direction, Position position){
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}
	
	public static int getWidthWithDirection(Direction direction){
		
		return WIDTH;
		
	}
	
	public static int getHeightWithADirection(Direction direction){
		
		return HEIGHT;
		
	}
	
	public void move(){
		
	}
	
	public boolean isWeapon() {
		return false;
	}
	
}
