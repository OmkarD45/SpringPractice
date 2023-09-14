package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certi c;
	public Person(String name, int personId, Certi c) {
		this.name=name;
		this.personId=personId;
		this.c=c;
	}

	@Override
	public String toString() {
		return this.name+" "+this.personId+" "+this.c;
	}
	
}
