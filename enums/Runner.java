package com.qa.community.enums;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println("---Loop through enums with motion value---");
		for(Directions d : Directions.values()) {
			System.out.println(d.getMotion());
		}
		
		System.out.println("\n---Method for direction/motion---");
		for(Directions d : Directions.values()) {
			System.out.println(d.directonMotion());
		}
		
	}

}
