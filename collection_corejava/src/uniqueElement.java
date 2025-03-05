import java.util.ArrayList;

public class uniqueElement {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> names=new ArrayList<>();
		
		    names.add("John");
	        names.add("Alice");
	        names.add("John");
	        names.add("Bob");
	        names.add("Alice");
	        names.add("Charlie");
	        
	        
	        
	        
	        System.out.println(names);
	        uniqueElement(names);
	        
	        

	}
	
	private static void uniqueElement(ArrayList<String> names) {
		 ArrayList<String> uniqueNames = new ArrayList<>();

	        for (String name : names) {
	           
	            if (!uniqueNames.contains(name)) {
	                uniqueNames.add(name);
	            }
	        }
	        
	        System.out.println(uniqueNames);
		}
	}
		
	
