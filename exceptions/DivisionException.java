package com.qa.community.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
	
	public static void main(String[] args) throws IOException {

			division();
		
	}
	
	private static void division() throws IOException {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Input a number: ");
			double num1 = input.nextDouble();
			System.out.println("Input another number: ");
			double num2 = input.nextDouble();
			double result = num1/num2;
			System.out.println("Answer: " + result);
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception message: " + ae.getMessage());
		} catch(InputMismatchException im) {
			im.printStackTrace();
		} finally {
			input.close();
		}
		
		input.close();
	}
		//exception 3 IOException is thrown in the method declaration 
	
		
	
		
	}
		




