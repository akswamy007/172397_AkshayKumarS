package com.trader;

public class Transactions {
	Trader trader;
	private int year; 
	private int value;
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public Integer getValue() {
		return value;
	}
	public Transactions(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transactions [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
}
