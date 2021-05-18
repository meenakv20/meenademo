package com.meena.service;

import java.util.Comparator;

import com.meena.models.Product;

public class DateComparator implements Comparator<Product> {

	
	        public int compare(Product a, Product b) {
	        	if(a.getLaunchDate() != null && b.getLaunchDate() != null ) {
	        		 return b.getLaunchDate().compareTo(a.getLaunchDate());
	        	}
	        	else {
	        		return 0;
	        	}
	        }
	    }

