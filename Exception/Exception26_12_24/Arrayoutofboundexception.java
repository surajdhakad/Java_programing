package Exception26_12_24;



public class Arrayoutofboundexception {

	public static void main(String[] args) {
		 int a[]=new int[2];
     try {
    	 
    	
    	 System.out.println(a[3]);
    	 
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Index 3 out of bounds for length 2");
    	 System.out.println("message"+e.getMessage());
    	 
    	 System.out.println("String representation:"+e.toString());
    	 System.out.println("Stack trace:");
    	 e.printStackTrace();
    	 System.out.println("main method end");
     }
     
     
	}

}
