package Loosely_Coupled_Architecture_Abstract_12_12_24;

public class banks {

	public static void main(String[] args) {
		SBI s =new SBI(1000);
		HDFC h=new HDFC (2000);
		ICICI i=new ICICI(3000);
		
		
		Customer c=new Customer("suraj",0.0);
		c.checkBalance(s);
		c.checkBalance(h);
		c.checkBalance(i);
		c.deposit(i, 5000);
		c.checkBalance(i);
		c.withdraw(i, 500000);
		c.deposit(s, 50000);
		
		
		
	
	     
	        
	       
	}

}
