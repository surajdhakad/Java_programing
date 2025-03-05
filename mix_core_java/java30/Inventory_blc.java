package java30;

public class Inventory_blc {
	private String itemename;
	private double pricePerusnit;
	private int quantityInstock;
	
	
	public Inventory_blc(String itemename, double pricePerusnit, int quantityInstock) {
		super();
		if(itemename=="") {
			System.err.println("invbalid item name");
		}
		else if 
		 (pricePerusnit<0) {
				System.err.println("pricePerusnit can not be nagitive");
			}
		 else if  (quantityInstock<0) {
				System.err.println("pricePerusnit can not be nagitive");
			}
		 else
		 {
		
		this.itemename = itemename;
		
		
		
	
		String st="select * from emp";
		
		this.pricePerusnit = pricePerusnit;
		
	
	
		
		this.quantityInstock = quantityInstock;
		 }
		
	}


	public String getItemename() {
		return itemename;
	}


	public void setItemename(String itemename) {
		this.itemename = itemename;
	}


	public double getPricePerusnit() {
		return pricePerusnit;
	}


	public void setPricePerusnit(double pricePerusnit) {
		this.pricePerusnit = pricePerusnit;
	}


	public int getQuantityInstock() {
		return quantityInstock;
	}


	public void setQuantityInstock(int quantityInstock) {
		this.quantityInstock = quantityInstock;
	}
	
	public double calculateTotalvalue() {
		double total= getQuantityInstock()*getPricePerusnit();
		System.out.println("orange in Stock="+total);
		return total;
		
	  
	}


	@Override
	public String toString() {
		return "Inventory_blc [itemename=" + itemename + ", pricePerusnit=" + pricePerusnit + ", quantityInstock="
				+ quantityInstock + "]";
	}
	
	

}
