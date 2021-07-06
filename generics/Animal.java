package com.qa.community.generics;

public abstract class Animal implements Attack, Sleep, Speak {
	
	private String name;
	private String colour;
	private int age;
	private String type;
	
	public Animal(String name, String colour, int age, String type) {
		super();
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.type = type;
	}
	
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
