package feb11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistCamparableInterface {
	
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList <Product> p1 =new ArrayList<>();
		
		p1.add(new Product(1,"laptop",5555));
		p1.add(new Product(2,"mobile",5000));
		p1.add(new Product(3,"charger",500));
		
		
		Collections.sort(p1);
		
		
		p1.forEach(System.out::println);
		
		
		
		
		
	}

	
	
	

}
