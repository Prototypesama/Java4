package jpu2016.dogfight.model;

public class Position {

	private int x;
	private int y;
	private int maxX;
	private int maxY;
	
	public Position(int x, int y, int maxX, int maxY){
		this.x = x;
		this.y = y;
	}
	
	public Position(Position position){
		this.x = position.getX();
		this.y = position.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	
	
	
}
