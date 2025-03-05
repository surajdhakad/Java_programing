package has_a_realtion_28_11_24;

public class Zemato {

	public static void main(String[] args) {
	 
		order o=new order(01,"pizza",199.50);
		Custumer c=new Custumer(201,"suraj","hyd",o);
		System.out.println(c);
		
	}

}
