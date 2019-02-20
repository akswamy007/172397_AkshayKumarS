package com.trader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.fruit.Fruit;

public class Sortnames11 {

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

		String list1 = list.stream().map(Trader::getName).sorted().collect(Collectors.joining(" , "));
		System.out.println(list1);

	}

}
