package com.njb.compare;

import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args){
		
		List<Product> list  = Util.getProductList();
		Util.printProductList("---------- BEFORE Sorting with ComparaBLE ----------" , list);		
		testComparable(list);
		Util.printProductList("---------- AFTER Sorting with ComparaBLE ----------" , list);
		
		testComparatorByName(list);
		Util.printProductList("---------- AFTER Sorting with comparaTOR by Name----------" , list);
		
		testComparatorById(list);
		Util.printProductList("---------- AFTER Sorting with comparaTOR by ID----------" , list);
		
	}

	private static void testComparatorById(List<Product> list) {
		Collections.sort(list, new ProductIdComparator());
	}

	private static void testComparatorByName(List<Product> list) {
		Collections.sort(list, new ProductNameComparator());
	}

	private static void testComparable(List<Product> list) {
		Collections.sort(list);
	}

}
