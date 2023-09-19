package com.springcore.lifecycle;

public class Sample {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property");
		this.price = price;
	}

	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sample [price=" + price + "]";
	}
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
}
