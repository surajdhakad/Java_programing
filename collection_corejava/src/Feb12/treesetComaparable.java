package Feb12;

import java.util.Iterator;
import java.util.TreeSet;

record Book(String name , String author) implements Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		
		
		 return this.name.compareTo(o.name);

	
		 
		 
	
}

	
	
	
}

public class treesetComaparable {
	
	public static void main(String[] args) {
		
		
		
		
		TreeSet<Book> b=new TreeSet<>();
		
		b.add(new Book("horozon","arvi"));
		b.add(new Book("sorozon","srvi"));
		b.add(new Book("corozon","grvi"));
		
		
		
		//b.forEach(System.out::println);
		Iterator<Book> itr2 = b.descendingIterator(); 
		itr2.forEachRemaining(System.out::println);
		
		
	}
}
	
	
	
