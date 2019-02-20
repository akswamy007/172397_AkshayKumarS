package lambdaAssignment3;


import java.util.ArrayList;


public class oddmain {

	public static void main(String[] args) {
		ArrayList<String > list=new ArrayList<String>();
		list.add("akshay");
		list.add("shreyas");
		list.add("marley");
		
		
		System.out.println("List before removing odd elements");
		list.forEach(System.out::println);
		System.out.println();
		
		list.removeIf(e -> (e.length()%2!=0));
		
	list.removeIf(a->(a.length()%2!=0));
		System.out.println("List after removing odd elements");
		list.forEach(System.out::println);
		
		
		 
           

	}

	

}
