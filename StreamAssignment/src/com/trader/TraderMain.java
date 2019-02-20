package com.trader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TraderMain {
	
	public static void main(String[] args) {
		
		Trader t1=new Trader("Akshay", "Gubbi");
		Trader t2=new Trader("Kumar", "Tumkur");
		Trader t3=new Trader("Shreyas", "Gokarna");
		Trader t4=new Trader("Prabhu", "Goa");
		Trader t5=new Trader("Pawan", "Pune");
		Trader t6=new Trader("Akil", "Tumkur");
		Trader t7=new Trader("Rohith", "Indore");

		
		
		List<Transactions> list=new ArrayList<Transactions>();
		list.add(new Transactions(t1,2012, 100000));
		list.add(new Transactions(t2,2011, 200000));
		list.add(new Transactions(t3,2011, 150000));
		list.add(new Transactions(t4,2013, 103500));
		
		System.out.println("-----------------------------------------------");
		
		
		List<Transactions> list1=list.stream().filter(i->i.getYear()==2011)
		.sorted((x,y)->x.getValue().compareTo(y.getValue()))
	    .collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		
		
		
	

	}

}
