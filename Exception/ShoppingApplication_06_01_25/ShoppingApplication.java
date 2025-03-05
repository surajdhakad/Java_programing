package ShoppingApplication_06_01_25;



@SuppressWarnings("serial")
class InsufficientQuantityException extends Exception{

	public InsufficientQuantityException(String message) {
		super(message);
	}
}


@SuppressWarnings("serial")
class InvalidProductException extends RuntimeException{

	public InvalidProductException(String message) {
		super(message);
	}
	
	
}

class Product{
	
	int id;
	String name;
	double price;
	int quantity;
	
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public void decreaseQuantity(int amount) throws InsufficientQuantityException{
		
		if(amount< quantity) {
			throw new InsufficientQuantityException("amount insuficent");
		}
		
		this.quantity-=amount;
	
	}
	
	
	
}


class ShoppingCart{
	
	Product carItems[];
	int itemCount ;
	
	public ShoppingCart(int capacity) {
		carItems=new Product[capacity];
	} 
	
	public void addToCart(Product p,int quantity) throws InsufficientQuantityException,InvalidProductException {
		
		
		
		if(p==null) {
			throw new InvalidProductException("product can not be null");
		}
		else if(p.quantity<=quantity) {
			throw new InsufficientQuantityException("not abaible");
			
		}
		else {
			for(int i=0;i<quantity;i++) {
				if(itemCount<carItems.length) {
				carItems[itemCount]=p;
				itemCount++;
			}
				else
				{
					throw new InsufficientQuantityException("cart is full");
				}
			}
			p.quantity-=quantity;
		}
		
	}
	
	
	public double calculateTotal() {
		double d=0;
		for(int i=0;i<itemCount;i++) {
			Product p=carItems[i];
			d=d+p.price;
		}
		return d;
			
		}
	
	
}









public class ShoppingApplication {

	public static void main(String[] args) {
		
		
		Product p1=new Product(1,"watch",5000,15);
		Product p2=new Product(2,"shirt",5000,15);
		Product p3=new Product(3,"tshirt",5000,15);
		
		ShoppingCart s1=new ShoppingCart(20);
		
		try {
            s1.addToCart(p1, 6);
            s1.addToCart(p2, 6);
            s1.addToCart(p3, 6);
            System.out.println("Total: " + s1.calculateTotal());
        } catch (InsufficientQuantityException e) {
            System.out.println("Not valid: " + e.getMessage());
        } catch (InvalidProductException e) {
            System.out.println("Invalid product: " + e.getMessage());
        }
	}

}
