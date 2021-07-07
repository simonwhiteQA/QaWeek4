package com.qa.community.singleton;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		Scanner s = Singleton.openScanner();
		System.out.println("Input a sentence: ");
		String myString = s.nextLine();

		System.out.println("\nYour sentence: " + myString);
		
		Singleton.closeScanner();
		
	}

}
