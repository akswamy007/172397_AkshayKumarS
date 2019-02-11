package com.Author.Book.Main;

public class AuthorBookMain 
{
	public static void main(String[] args) 
	{
		
			Author author = new Author ("Shubhangi","shubhangichoudhary9211@gmail.com",'f');			
			Book book = new Book("Positive Vibes",author,5699.998,2);
			book.setQuantity(6);
			System.out.println(book);
	}
}
