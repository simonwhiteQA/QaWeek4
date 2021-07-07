package com.qa.community.generics;

public class CatBuilder {
	
	private String name;
	private String colour;
	private int age;
	private String type;
	
	public CatBuilder() {
		
	}
	
	public Cat build() {
		return new Cat(name, colour, age, type);
	}
	
	public CatBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public CatBuilder colour(String colour) {
		this.colour = colour;
		return this;
	}
	
	public CatBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public CatBuilder type(String type) {
		this.type = type;
		return this;
	}

}
