package com.trader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trader> list=new ArrayList<Trader>();
		
		list.add(new Trader("Akshay", "Gubbi"));
		list.add(new Trader("Kumar", "Tumkur"));
		list.add(new Trader("Shreyas", "Gokarna"));
		list.add(new Trader("Prabhu", "Goa"));
		list.add(new Trader("Pawan", "Pune"));
		list.add(new Trader("Akil", "Tumkur"));
		list.add(new Trader("Rohith", "Indore"));
		
		
		
		List<String> unique=list.stream()
				.map(Trader::getCity).distinct()
				.collect(Collectors.toList());
		unique.forEach(System.out::println);
				


	}

}
