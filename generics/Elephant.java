package com.qa.community.generics;

public class Elephant extends Animal {

	public Elephant() {
		super();
	}

	public Elephant(String name, String colour, int age, String type) {
		super(name, colour, age, type);
	}
	
	@Override
	public String animalAttack() {
		return "stampedes";
	}

	@Override
	public String animalSleep() {
		return "sleeps in jungle";
	}

	@Override
	public String animalSpeak() {
		return "Trunk makes noise";
	}
	
	

}
