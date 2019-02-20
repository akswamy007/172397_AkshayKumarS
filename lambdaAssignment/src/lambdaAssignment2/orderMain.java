package lambdaAssignment2;

public class orderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         order o=(p,n)->{
        	 if(p>10000 && (n=="ACCEPTED"||n=="COMPLETED")) {
        		 System.out.println("price is:"+p+" "+ "  status is :"+n);
        	 }};
        	 o.order(100000,"ACCEPTED");
        	 o.order(1000,"ACCEPTED");
        	 o.order(13000,"ACCEPTED");
        	 o.order(10444,"COMPLETED");
        	 o.order(10444,"PENDING");
        	 
        	 
         
         
	}

}
