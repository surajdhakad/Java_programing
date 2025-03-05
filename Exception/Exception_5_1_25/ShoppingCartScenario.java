package Exception_5_1_25;




@SuppressWarnings("serial")
class InvalidItemException extends Exception{

	public InvalidItemException(String message) {
		super(message);
	}
	
}
@SuppressWarnings("serial")
class OutOfStockException extends RuntimeException{
	public OutOfStockException(String message) {
		super(message);
	}
}

class Shopingcart {
	
	private int availableItems;

	public Shopingcart(int availableItems) {
		super();
		this.availableItems = availableItems;
	}
	
	
	
	
	

	void addItem(int quantity) throws InvalidItemException{
		
		if(quantity <=0) {
			 throw new IllegalArgumentException("Number of quantity  must be greater than zero.");
        
			
		}
		else if(quantity > availableItems) {
			throw new InvalidItemException("insufficient stock");
		}
		
		 availableItems-= quantity;
	        System.out.println("Added " + quantity + " items. Remaining stock: " + availableItems);
	}
	public void addItemUnchecked(int quantity) throws OutOfStockException {
		
		
		 if(quantity <=0) {
				throw new IllegalArgumentException("Number of item must be greater than zero.");
				
			 }
			 if(quantity<=0) {
				 throw new OutOfStockException("number of item not abibale");
			 }
			 
			 availableItems-= quantity;
		        System.out.println("Added " + quantity + " items. Remaining stock: " + availableItems);

			 
	}
       
	
	
}


public class ShoppingCartScenario {

	public static void main(String[] args) {
		Shopingcart s1 = new Shopingcart(50);
		try {
			s1.addItem(10);
			s1.addItemUnchecked(10);
		} 
		catch (InvalidItemException e) {
			System.out.println("invald item"+e.getMessage());
			
		}
catch (OutOfStockException e) {
	System.out.println("out of stock"+e.getMessage());
			
		}

	}

}
