package com.trader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Indoremain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Trader> list = new ArrayList<Trader>();

		list.add(new Trader("Akshay", "Gubbi"));
		list.add(new Trader("Kumar", "Tumkur"));
		list.add(new Trader("Shreyas", "Gokarna"));
		list.add(new Trader("Prabhu", "Goa"));
		list.add(new Trader("Pawan", "Pune"));
		list.add(new Trader("Akil", "Tumkur"));
		list.add(new Trader("Rohith", "Indore"));
		list.add(new Trader("Shekar", "Pune"));
		list.add(new Trader("Kushal", "Pune"));
		
		
		List<String> list1=list.stream()
				.filter(i->i.getCity().equals("Indore"))
				.map(Trader::getName)
				.collect(Collectors.toList());
		System.out.println("Traders from Indore are");
		list1.forEach(System.out::println);
				
		
	}

}
