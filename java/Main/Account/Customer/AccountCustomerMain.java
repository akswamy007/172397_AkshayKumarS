package com.Main.Account.Customer;

public class AccountCustomerMain 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer(102,"Shubhangi",'f');
		Account a3 = new Account(102,c,66669);
		System.out.println("Details of customer :");
		System.out.println(a3);
		a3.deposit(756778.67);
		a3.withdraw(566665.87);
		a3.withdraw(563465.87);
	}
}
