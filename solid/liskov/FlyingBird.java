package com.qa.community.solid.liskov;

public class FlyingBird extends Animal implements Flying, Noise {

	@Override
	public String makeNoise() {
		return "This bird can make a noise";
	}

	@Override
	public String fly() {
		return "This bird can fly";
	}

}
