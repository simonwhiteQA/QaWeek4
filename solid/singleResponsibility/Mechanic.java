package com.qa.community.solid.singleResponsibility;

import java.text.DecimalFormat;

public class Mechanic {
	
	private String name;
	private double hourlyRate;
	
	public Mechanic(String name, double hourlyRate) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
	}

	public void fixWheel(Car c, Mechanic m) {
		System.out.println(m.name + " is fixing a " + c.getModel());
	}

	public void addSpoiler(Car c, Mechanic m, double timeForFix) {
		System.out.println(m.name + " is adding a spoiler to " + c.getModel());
		System.out.println(m.name + " has an hourly rate of " + m.getHourlyRate());
		System.out.println("The cost of this work is: " + costOfWork(m.getHourlyRate(), timeForFix) + "\n");
	}
	
	public String costOfWork(double hourlyRate, double timeForFix) {
		DecimalFormat rounded = new DecimalFormat("###.00");
		return (rounded.format(hourlyRate*timeForFix));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

}
