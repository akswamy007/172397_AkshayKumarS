package com.trader;

public class Trader {
	 private String name;
	 private String city;
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	

}
