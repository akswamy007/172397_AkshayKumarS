package com.Main.Account.Customer;

public class Customer
{
	private int Id;
	private  String name;
	private char gender;

	public Customer( int Id,  String name,char gender) {
		this.Id = Id;
		this.name = name;
		this.gender = gender;
		
		
	}

	public int getId() {
		return Id;
	}

	public   String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer Details [Id=" + Id + ", Name=" + name + "]";
	}

}
