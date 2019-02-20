package com.trader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DelhiTransationsMain13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transactions> list1=new ArrayList<Transactions>();
		
		list1.add(new Transactions(new Trader("Akshay", "Gubbi"), 2012, 10000));
		list1.add(new Transactions(new Trader("Shreyas", "Delhi"), 2011, 15500));
		list1.add(new Transactions(new Trader("Kumar", "Gubbi"), 2014, 10000));
		list1.add(new Transactions(new Trader("Pawan", "Delhi"), 2013, 20000));
		
		List<Integer> list2=list1.stream()
				.filter(i->i.getTrader().getCity().equals("Delhi"))
				.map(Transactions::getValue)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		
		
		
		
				


		
		

	}

}
