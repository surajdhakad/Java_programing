package abstract_12_12_24;

public class mobilesimulion {
	
	public static void main(String[] args) {
		
	Jio j=	new Jio("7440381220");
	
 
	
	MobilePhone m=new MobilePhone();
	m.insertSIM(j);
	m.makeCall("9770609308");
	m.sendText("hi");
	m.removeSIM();
	j.deactivate();
	m.makeCall("9936378474");
	m.removeSIM();
	

	
	System.out.println("======================");
	
	   Airtel a=new Airtel("7477255934");
	   
	   MobilePhone m1=new MobilePhone();
	   m1.insertSIM(a);
	   m1.makeCall("9691951989");
	   m1.sendText("hello");
	  
	 
	   
	a.deactivate();
	m1.makeCall("123456778");
	m1.removeSIM();
	
	
	
		
		
		
	}

}
