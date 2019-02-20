package lambdaAssignment1;

public class mainclass {

	public static void main(String[] args) {
		Arthmaticoperation a1=(n,m)-> {return (n+m);};
		System.out.println("addition of 2 numbers is :"+a1.operation(2,3));
		Arthmaticoperation a2=(n,m)->(n-m);
		System.out.println("subtraction of 2numbers is:"+a2.operation(23, 10));
		Arthmaticoperation a3=(n,m)->(n*m);
		System.out.println("multiplication of 2numbers is:"+a3.operation(3, 4));
		Arthmaticoperation a4=(n,m)->(n/m);
		System.out.println("division of 2numbers is:"+a4.operation(10, 2));
		
	 };
		
}

