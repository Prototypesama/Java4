package jpu2016.dogfight.model;
import jpu2016.dogfight.model.Dimension;

public class Plane extends Mobile{

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image){
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
	}
	
	public boolean isPlayer(int player){
		
		return false;
		
	}
	
	public boolean hit(){
		
		return false;
		
	}
	
}
