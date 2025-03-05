package exception31_12_24;



class Parentclass{

	public void loadingClass(String clLoad) throws ClassNotFoundException 
	{
		Class c1;
		
		c1=Class.forName(clLoad);
		
		System.out.println("load success");
	
		
	}
	
}

class childClass extends Parentclass{

	@Override
	public void loadingClass(String clLoad) throws ClassNotFoundException {
		try {
			if(clLoad==null||clLoad.isEmpty()) {
				throw new IllegalArgumentException("class name can not empty");
			}
			
		
		super.loadingClass(clLoad);
	}
		catch(ClassNotFoundException e) {
			System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
			throw new RuntimeException("Exception caught: Unchecked Exception: RuntimeException from ChildClass");
		}
	}
}
	

public class tester {

	public static void main(String[] args) throws ClassNotFoundException {
		
		childClass s=new childClass();
		try {
			s.loadingClass("");
			
		}
		catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
			
		}
		
		
	
	}

}
