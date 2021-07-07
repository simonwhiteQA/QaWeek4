package com.qa.community.singleton;

import java.util.Scanner;

public class Singleton {
	
	static Scanner myInput = new Scanner(System.in);
	
	public static Scanner openScanner() {
		
	 return myInput;
		
	}
	
	public static void closeScanner() {
	   myInput.close();
	   System.out.println("\nScanner has closed");
	}

}
