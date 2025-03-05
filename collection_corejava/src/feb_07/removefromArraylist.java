package feb_07;

import java.util.ArrayList;
import java.util.List;

public class removefromArraylist {

	public static void main(String[] args) {

		
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		System.out.println(l);
		l.remove(3);         // this is removing from index wise 
		System.out.println(l);
		
		l.remove(Integer.valueOf(2));   // this is removing from values 
		System.out.println(l);
		
		

	}

}
