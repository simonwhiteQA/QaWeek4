package com.qa.community.generics;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}

	public Cat(String name, String colour, int age, String type) {
		super(name, colour, age, type);
	}
	
	@Override
	public String animalAttack() {
		return "claws";
	}

	@Override
	public String animalSleep() {
		return "sleeps in basket";
	}

	@Override
	public String animalSpeak() {
		return "meow";
	}

}
