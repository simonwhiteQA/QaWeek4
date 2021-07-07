package com.qa.community.solid.singleResponsibility;

public class Runner {
	
	public static void main(String[] args) {
		
		Car c = new Car("Black", "i20", 50000);
		Car c2 = new Car("White", "Fiesta", 19000);
		Mechanic simon = new Mechanic("Simon", 8.60);
		Mechanic niall = new Mechanic("Niall", 9.50);
		Driver d = new Driver();
		
		System.out.println("---What are the mechanics doing---");
		simon.addSpoiler(c, simon, 6);
		niall.fixWheel(c2, niall);
		
		System.out.println("\n---Driver methods---");
		d.accelerate(50, 90);
		d.decelerate(50, 30);
		d.drive(304, c);
		
		
		
	}

}
