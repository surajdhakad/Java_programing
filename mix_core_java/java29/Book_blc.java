package java29;

public class Book_blc {
	
	public String title;
	public String author;
	public double price;
	
	
	public Book_blc(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("title="+title);
		System.out.println("author="+author);
		System.out.println("price="+price);
		
	
	}
	public void applyDiscount(double discountpercentage) {
		if(discountpercentage<0) {
			System.err.println("discount can not be negative");
		}
		
		
		
	}
	
	
	

}
