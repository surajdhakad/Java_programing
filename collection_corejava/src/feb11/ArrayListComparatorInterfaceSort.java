package feb11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparatorInterfaceSort {

	public static void main(String[] args) {
		
		
		
		ArrayList<Customer> c1=new ArrayList<>();
		
		c1.add(new Customer(1,"saumy",70.0));
		c1.add(new Customer(2,"vivek",50.0));
		c1.add(new Customer(3,"Alex",40.0));
		
		c1.sort((c2,c3)->c3.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		
		c1.forEach(System.out::println);
		
		
		
		
		
		

	}

}
