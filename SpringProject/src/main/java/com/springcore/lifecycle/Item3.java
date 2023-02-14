package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Item3 {
	private int price;

	public Item3(int price) {
		super();
		this.price = price;
	}
	public Item3() {
	}

	@Override
	public String toString() {
		return "Item3 [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@PostConstruct
	public void init() {
		System.out.println("AnnoAAAAAAAAAAAAAAAAAAAAAAAAAAAAA	 init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("anno destryoy");
	}
}
