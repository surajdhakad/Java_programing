package CabCustumer;

public class CabCustomerServiceTester {

	public static void main(String [] args) {
		Cabcustumer c1=new Cabcustumer(1,"suraj","goa","hyd",9,"1234");
		Cabcustumer c2=new Cabcustumer(2,"vivek","goa","hyd",2,"234");
		Cabcustumer c3=new Cabcustumer(3,"saumy","goa","hyd",20,"34");
		Cabcustumer c4=new Cabcustumer(4,"sudeep","goa","hyd",20,"4");
		
		CabCustomerService s1=new CabCustomerService();
		s1.addCabCustomer(c1);
		s1.addCabCustomer(c2);
		s1.addCabCustomer(c3);
		s1.addCabCustomer(c4);
		
		
		s1.printBill(c1);
		s1.printBill(c2);
		
		
	}

}
