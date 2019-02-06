package com.njb.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import jdk.nashorn.internal.ir.Block;

public class LambdaTest {
	public static void main(String[] args){
		forEachTest();
		streamTest();
	}

	private static void streamTest() {
		
	    List<String> someBingoNumbers = Arrays.asList(
	            "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");
		
        List<String> gNumbers = new ArrayList<>();
        
/*
		someBingoNumbers.forEach(number -> {
			if (number.toUpperCase().startsWith("G")) {
				gNumbers.add(number);
				System.out.println(number);
			}
		});
		
		System.out.println("----------------");
		
		gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
		gNumbers.forEach((String s) -> System.out.println(s));
		System.out.println("----------------");
*/
        
        
/*        
        someBingoNumbers
        .stream()
        .map(String::toUpperCase)
        .filter(s->s.startsWith("G"))
        .sorted()
        .forEach(System.out::println);
        System.out.println("----------------");
*/        
        
        someBingoNumbers
        .stream()
        .map(String::toUpperCase)
        .filter(s->s.startsWith("G"))
        .sorted()
        .forEach(s -> { System.out.println(s); gNumbers.add(s); });
        System.out.println("----------------");
        
        gNumbers.forEach(System.out::println);
        System.out.println("----------------");
        
        gNumbers.forEach(s->printMe(s));
        System.out.println("----------------");
	
	}
	
	private static void printMe(String s) {
		System.out.println(s);
	}

	private static void forEachTest() {
		List<String> myList = Arrays.asList("H","E","L","L","O");
		myList.forEach(s -> System.out.println(s));
		myList.forEach(s -> { System.out.println(s); System.out.println("Jagadeesh-"+s);});
	}

}

interface MyInterface {
   String testMethod(String data);
   String testMethod();
   int testMothod(int x, int y);
}
