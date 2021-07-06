package com.qa.community.generics;

public class Cage <T extends Animal> {
	
	private T Animal;
	private String CageSize;
	
	public String getCageAnimal() {
		if (this.Animal != null) {
			return this.Animal.getType() + " " + this.Animal.getName() + " " + this.Animal.getColour();
		} else {
			return "This cage is empty";
		}
		
	}
	
	public Cage() {
		
	}
	
	public Cage(String cageSize) {
		this.CageSize = cageSize;
	}
	
	public Cage(String cageSize, T Animal) {
		this.CageSize = cageSize;
		this.Animal = Animal;
	}
	
	public void add(T Animal) {
		this.Animal = Animal;
	}

	public T getAnimal() {
		return Animal;
	}


	public String getCageSize() {
		return CageSize;
	}


	public void setCageSize(String cageSize) {
		CageSize = cageSize;
	}

}
