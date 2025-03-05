package exception30_12_24;

public class ClassCastExcep {
	
	public static void handleClassCastException() {
		Object  obj []= {"suraj","hello",123};
		
		for(Object o:obj) {
			try {
				String s=(String) o;
				
				System.out.println(s);
						
			
		}
			catch (ClassCastException e){
				System.out.println("ClassCastException");
				 e.printStackTrace();
				
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		handleClassCastException();
	}

}
