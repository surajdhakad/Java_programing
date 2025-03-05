package feb_07;

import java.util.LinkedList;
import java.util.Vector;

public class mergeCollection {
public static void main(String[] args) {
	
	
	
	Vector<String> v1=new Vector<>();
	
	v1.add("mango");
	v1.add("apple");
	v1.add("banana");
	v1.add("grapes");
	
	
	
	LinkedList<String> l1 = new LinkedList<String>();
	
	

    l1.add("red");
    l1.add("black");
    l1.add("yellow");
    
    l1.addAll(1,v1);
    System.out.println(l1);
    
	
}

}
