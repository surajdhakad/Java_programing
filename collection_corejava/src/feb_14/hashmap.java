package feb_14;

import java.util.HashMap;

public class hashmap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		 HashMap<String,Integer> hm1 = new HashMap<>();
		 
		 hm1.put("apple", 50);
		 hm1.put("banaba", 20);
		 hm1.put("orange", 10);
		 
		 
		 
		System.out.println( hm1.size());
		System.out.println(hm1);
		System.out.println(hm1.isEmpty());
		hm1.get(20);
		
		boolean hasKey = hm1.containsKey(20);
		System.out.println("haskey is "+ hasKey);
		boolean hasvalue = hm1.containsValue("apple");
		System.out.println(hasvalue);
		
		hm1.forEach((k,v)->System.out.println(k + v));
	}

}
