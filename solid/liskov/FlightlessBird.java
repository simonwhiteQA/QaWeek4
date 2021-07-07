package com.qa.community.solid.liskov;

public class FlightlessBird extends Animal implements Noise {

	@Override
	public String makeNoise() {
		return "This bird can make noise";
	}

}
