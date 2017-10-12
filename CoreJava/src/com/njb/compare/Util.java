package com.njb.compare;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<Product> getProductList(){
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Ball Pen", 10.2));
		list.add(new Product(2,"Ink Pen", 12.2));
		list.add(new Product(3,"Jel Pen", 12));
		list.add(new Product(4,"Glitter Pen", 70.81));
		list.add(new Product(5,"Pen Pencil", 11));
		
		return list;
	}
	
	public static void printProductList(String msg, List<Product> list){
		
		System.out.println(msg);
		
		for(Product p : list){
			System.out.println(p.toString());
		}
	}

}
