import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertList {

	public static void main(String[] args) {
	
		
		ArrayList<Object> l=new ArrayList<>();
		
		l.add(4);
		l.add(5);
		l.add(2);
		l.add(1);
		l.add(6);
		
		
		System.out.println(l);
		
		
		
		LinkedList<Object>li=new LinkedList<>();
		for(Object num:l) {
			li.add(num);
		}
		System.out.println(li);
		
		
		Vector<Object>v1=new Vector<>();
		
		for(Object num:v1) {
			v1.add(num);
		}
		System.out.println(v1);
		
		
		HashSet<Object>h1=new HashSet<>(li);
		
		
		
		
		System.out.println(li);
		System.out.println(v1);
		System.out.println(h1);
		
		
		
		
		

	}

}
