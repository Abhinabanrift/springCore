package com.springcore.ci;

public class Addition {
	private int a, b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int one called");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double one called");
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String one called");
	}
}
