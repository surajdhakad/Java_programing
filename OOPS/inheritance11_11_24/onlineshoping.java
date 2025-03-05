package inheritance11_11_24;


 class product{
	 protected String name;
	 protected double price;
	 
	public product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	 

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}



	public double calculateTotalCost(int quantity) {
	return  quantity*price;
	
		
		
	}
	 
	 
	
}
 class electronics extends product{
	 
	 private String brand;

	public electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "electronics [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

	

	


	
	
	
	 
	 
 }
 class Clothing extends product{
	 private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Clothing [size=" + size + ", name=" + name + ", price=" + price + "]";
	}

	


	
	
	 
	
	 
 }
 




public class onlineshoping {

	public static void main(String[] args) {
		electronics e=new electronics("laptop",70000,"asus");
		Clothing s=new Clothing("t-shirt",5000,"m");
		System.out.println(e.toString());
		System.out.println(s.toString());
		System.out.println("total cost= "+(e.calculateTotalCost(1)+s.calculateTotalCost(4)));
		//e.calculateTotalCost(2);
		//s.calculateTotalCost(4);
		
		
		
	}

}
