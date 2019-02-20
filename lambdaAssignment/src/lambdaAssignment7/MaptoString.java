package lambdaAssignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaptoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("Akshay"," India, ");
		map.put("Marley"," Cuba, ");
		map.put("Khalifa", " Bombay, ");
		map.put("Akon"," Africa, ");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
		

	}

	}


