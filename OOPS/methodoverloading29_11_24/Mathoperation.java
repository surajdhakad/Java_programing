package methodoverloading29_11_24;

public class Mathoperation {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		//c.add(10.5, 20.3);
		System.out.println(c.add(10.5, 20.3));
		System.out.println(c.multiply(10, 20));
		
		System.out.println(c.add(-10, 20));
		
	}

}
