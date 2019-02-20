package lambdaAssignment5;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("venky");
		list.add("venkat");
		list.add("venkatesh");
		list.add("surya");
		System.out.println("String is :\n"+list);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = list.stream().map(i->Character.toString(i.charAt(0))).reduce(" ", (a, b) -> a +"\n"+ b);
		System.out.println(stringresult);
	
	}

}
