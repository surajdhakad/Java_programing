package feb_07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateTreverse {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();

        list.add("mango");
        list.add("banana");
        list.add("apple");
        
        ListIterator itr=list.listIterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
       
System.out.println("-----------------------");
        
        while(itr.hasPrevious()) {
        	System.out.println(itr.previous());
        }
       
	}

}
