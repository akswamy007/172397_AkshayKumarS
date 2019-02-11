package com.Customer.Discount.Main;
import java.util.Date;
public class DiscountMain 
{
	public static void main(String[] args) {
		Customer c1=new Customer("Shubhangi");
		c1.setMember(true);
		c1.setMemberType("Silver");
		
		Visit v=new Visit(c1,new Date());
		v.setProductExpence(3000);
		v.setServiceExpence(3000);
		
		System.out.println(v.totalExpense());	
	}
}
