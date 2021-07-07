package com.qa.community.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {
	
	public static void main(String[] args) {
		
		List<String> sport = List.of("Football", "Rugby", "Golf", "Tennis");
		
		System.out.println("---Print list using lambda---");
		//list to print
		sport.forEach(x -> System.out.println(x));
		
		System.out.println("\n---Contains ball---");
		//boolean list to print with condition
		sport.forEach(x -> System.out.println(x + " = " + x.contains("ball")));
		
		System.out.println("\n---Contains ball print sport---");
		//boolean list to print with condition from stream
		Stream<String> sportStream = Stream.of("Football", "Rugby", "Golf", "Tennis");
		sportStream.filter(x -> x.contains("ball")).forEach(x -> System.out.println(x));
		
		System.out.println("\n---Print all sports to upper case using new stream---");
		//boolean list to print with condition from stream
		Stream<String> newStream = Stream.of("Darts", "Lacrose", "Ping Pong", "Badminton");
		newStream.map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
		
		System.out.println("\n---Print all using collectors on one line---");
		//Collectors for using lambda - Collectors.joining = one line
		//Collectors.toList = to a string on different lines
		Stream<String> clubs = Stream.of("DriVer", "iRon", "PutTer", "WeDGE");
		String joining = clubs.map(x -> x.toLowerCase()).collect(Collectors.joining());
		System.out.println(joining);
		
		
	}

}
