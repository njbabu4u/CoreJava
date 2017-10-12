package com.njb.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import jdk.nashorn.internal.ir.Block;

public class LambdaTest {
	public static void main(String[] args){
		test1();
		test2();
	}

	private static void test2() {
		// TODO Auto-generated method stub
		
	}

	private static void test1() {
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
