package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player;
	private Order order;// PAS CERTAIN

	public UserOrder(int player, Order order) {
		this.order = order; // PAS CERTAIN
	}

	public Order getOrder() {
		return order;// PAS CERTAIN

	}

	public int getPlayer() {
		return player;

	}
}
