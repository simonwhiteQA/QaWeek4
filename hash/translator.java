package com.qa.community.hash;

import java.util.HashMap;

public class translator {
	
	public static void main(String[] args) {
		
		morse(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");
		morse(".... . .-.. .-.. --- / -- -.-- / -. .- -- . / .. ... / ... .. -- --- -.");
	}
	
	public static void morse(String morse) {
		
		HashMap<String, String> translator = new HashMap<>();
		
		translator.put(".-", "A");
		translator.put("-...", "B");
		translator.put("-.-.", "C");
		translator.put("-..", "D");
		translator.put(".", "E");
		translator.put("..-.", "F");
		translator.put("--.", "G");
		translator.put("....", "H");
		translator.put("..", "I");
		translator.put(".---", "J");
		translator.put("-.-", "K");
		translator.put(".-..", "L");
		translator.put("--", "M");
		translator.put("-.", "N");
		translator.put("---", "O");
		translator.put(".--.", "P");
		translator.put("--.-", "Q");
		translator.put(".-.", "R");
		translator.put("...", "S");
		translator.put("-", "T");
		translator.put("..-", "U");
		translator.put("...-", "V");
		translator.put(".--", "W");
		translator.put("-..-", "X");
		translator.put("-.--", "Y");
		translator.put("--..", "Z");
		translator.put("/", " ");

		String message = " ";
		String[] splitted = morse.split(" ");
		for (String i : splitted) {
			translator.get(i);
			message = message + translator.get(i);
		}
		
		System.out.println(message);

	}

}

