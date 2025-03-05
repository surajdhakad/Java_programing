package exception31_12_24;

public class ArrayStoreExample {

	
	
	
	public static void storeObjects() {
		
		Object s[]=new String[5];
		
		try {
			s[0]= "hello";
			s[1]="world";
			s[2]=123;
			System.out.println("Objects stored successfully");
		}
		catch(ArrayStoreException e){
			System.out.println("ArrayStoreException caught"+e.getMessage());
			
			
		}
		
	}
	public static void main(String[] args) {
		storeObjects();

	}

}
