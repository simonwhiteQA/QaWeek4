package com.qa.community.solid.liskov;

public class Runner {
	
	public static void main(String[] args) {
		
		FlightlessBird p = new Penguin("Paul", 8);
		FlyingBird e = new Eagle("Jack", 5);
		
		System.out.println(p.getName() + " " + e.makeNoise());
		System.out.println(e.getName() + " " + e.makeNoise());
		System.out.println(e.getName() + " " + e.fly());
		
	}

}
