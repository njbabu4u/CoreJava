package com.njb.compare;

import java.util.Comparator;

public class ProductIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = ((Product)o1);
		Product p2 = ((Product)o2);
		
		if(p1.getId() == p2.getId()){
			return 0;
		}else if(p1.getId() > p2.getId()){
			return 1;
		}else{
			return -1;
		}
		
	}	
	
}
