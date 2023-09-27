package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sample2 implements InitializingBean,DisposableBean{
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Sample2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sample2 [price=" + price + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
//		Init
		System.out.println("Works as Init Method");	
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
//		destroy
		System.out.println("Works as Destroy Method");
	}
}