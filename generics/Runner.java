package com.qa.community.generics;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		//Instances of cages that have Animal generic
		Cage<Animal> largeCage = new Cage<Animal>("Large");
		Cage<Animal> mediumCage = new Cage<Animal>("Medium");
		Cage<Animal> smallCage = new Cage<Animal>("Small");
		Cage<Animal> emptyCage = new Cage<Animal>("Medium");
		
		//Instances of Animal created
		Animal parrot = new Parrot("Polly", "Red", 6, "Parrot");
		Animal cat = new Cat("Whiskers", "Black", 9, "Cat");
		Animal elephant = new Elephant("Tusks", "Grey", 15, "Elephant");
		
		//Add animal to a cage
	    largeCage.add(elephant);
	    mediumCage.add(parrot);
	    smallCage.add(cat);
	    
	    //Add cages to a list
	    List<Cage<Animal>> cageList = new ArrayList<>();
	    cageList.add(largeCage);
	    cageList.add(mediumCage);
	    cageList.add(smallCage);
	    cageList.add(emptyCage);
	    
	    //Print out each cage and the animal inside
	    System.out.println("Large Cage Animal: " + largeCage.getCageAnimal());
	    System.out.println("Medium Cage Animal: " + mediumCage.getCageAnimal());
	    System.out.println("Small Cage Animal: " + smallCage.getCageAnimal());
	    
	    //Iterate through cage list to print out each animal
	    System.out.println("\n---For loop to print cage and animal---");
	    for (Cage<Animal> c : cageList) {
	    	System.out.println(c.getCageSize() + " cage: " + c.getCageAnimal());
	    }
	    
	    //Using design patterns create a cat
	    System.out.println("\n---Add cat via cat builder to empty cage---");
	    Animal catBuilder = new CatBuilder().name("Bowie").age(9).colour("White").type("Cat").build();
	    emptyCage.add(catBuilder); //add cat builder to empty cage
	    System.out.println("Empty Cage Animal: " + emptyCage.getCageAnimal());
	    
	}

}
