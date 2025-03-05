package feb_07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinklistTOArraylsit {


	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		

	     l1.add("mango");
         l1.add("banana");
         l1.add("apple");
         
        
         ArrayList<String> a= new ArrayList<>(l1);
         
        
         
         System.out.println(a);
		
		
	}

}
