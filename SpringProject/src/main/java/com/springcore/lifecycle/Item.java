package com.springcore.lifecycle;

public class Item {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}

	public void init() {
		System.out.println("Welcome, inside init method");
	}

	public void destroy() {
		System.out.println("Word done, inside destror method|");
	}

}
