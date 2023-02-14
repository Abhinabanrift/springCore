package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SecondItem implements InitializingBean, DisposableBean {
	private int price;

	public SecondItem() {
		super();
	}

	public SecondItem(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SecondItem [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcomee, initialisation done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" destroying bean");
	}
}
