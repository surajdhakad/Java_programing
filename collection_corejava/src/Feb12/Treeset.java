package Feb12;

import java.util.Comparator;
import java.util.TreeSet;

record Product(Integer productId, String productName) {

	

	
	
	
	
	
}

public class Treeset {

	public static void main(String[] args) {
		
//		TreeSet<Product> p1 = new TreeSet<>  ((s1,s2) -> Integer.compare(s2.productId(), s1.productId()));
//		
//		p1.add(new Product(1,"slxex"));
//		p1.add(new Product(2,"a"));
//		p1.add(new Product(3,"zebra"));
//		
//		
//		p1.forEach(System.out::println);
		
		
TreeSet<Product> p1 = new TreeSet<Product>((s1,s2) -> s2.productName().compareTo(s1.productName()));
		
		p1.add(new Product(3,"slxex"));
		p1.add(new Product(1,"a"));
		p1.add(new Product(2,"zebra"));
		
		
		
	
		p1.forEach(System.out::println);
		
		
		
		
	}

}
