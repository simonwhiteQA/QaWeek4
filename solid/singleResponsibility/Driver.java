package com.qa.community.solid.singleResponsibility;

public class Driver  {
	
	private int mileage;

    // functionality
    public void drive(int milesDriven, Car c){
        c.setMileage(c.getMileage() + milesDriven);
        System.out.println(c.getModel() + " has now got " + c.getMileage() + " miles");
    }
    
    public void accelerate(int originalMPH, int newMPH) {
		System.out.println("The driver has increased speed by " + (newMPH - originalMPH) + "mph");
    }
    
    public void decelerate(int originalMPH, int newMPH) {
		System.out.println("The driver has decreased speed by " + (originalMPH - newMPH) + "mph");
    }

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
    
}