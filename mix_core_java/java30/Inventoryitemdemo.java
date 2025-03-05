package java30;

public class Inventoryitemdemo {

	public static void main(String[] args) {
		Inventory_blc i=new Inventory_blc("orange",10,15);
	
		
		System.out.println(i.toString());
		i.calculateTotalvalue();
	}

}
