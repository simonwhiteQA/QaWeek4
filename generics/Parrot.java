package com.qa.community.generics;

public class Parrot extends Animal {
	
	public Parrot() {
		super();
	}

	public Parrot(String name, String colour, int age, String type) {
		super(name, colour, age, type);
	}

	@Override
	public String animalAttack() {
		return "pecks";
	}

	@Override
	public String animalSleep() {
		return "sleeps in cage";
	}

	@Override
	public String animalSpeak() {
		return "tweet twoo";
	}

}
