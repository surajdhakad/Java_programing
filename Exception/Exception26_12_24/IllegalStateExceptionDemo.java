package Exception26_12_24;

import has_a_realtion_28_11_24.Mainclass;

public class IllegalStateExceptionDemo {
	public static void main(String[] args) {
		System.out.println("calling throwItlligel from main method");
		throwIllegalException();
		
	}
		 static void throwIllegalException() { 
			 try {
				 throw new IllegalStateException("MyException");
			
			 }
			 catch(IllegalStateException e) {
				 System.out.println("cougth:"+e);
				

 	
		 }

}
	}


