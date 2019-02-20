package com.trader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SmallestValue15 {
	
	public static void main(String[] args) {

		
		List<Transactions> list1=new ArrayList<Transactions>();
				
				list1.add(new Transactions(new Trader("Akshay", "Gubbi"), 2012, 10000));
				list1.add(new Transactions(new Trader("Shreyas", "Delhi"), 2011, 15500));
				list1.add(new Transactions(new Trader("Kumar", "Gubbi"), 2014, 10000));
				list1.add(new Transactions(new Trader("Pawan", "Delhi"), 2013, 20000));
				

				int list3=list1.stream()
					     .min(Comparator.comparing(Transactions::getValue))
					     .map(Transactions::getValue)
					     .get();
					     
		System.out.println("Smallest value is  "+list3);			     
				
			}

}
