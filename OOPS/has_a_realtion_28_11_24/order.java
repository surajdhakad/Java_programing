package has_a_realtion_28_11_24;

public class order {
	private int orderId;
	private String itemName;
	private double itemPrice;
	public order(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "order [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
	
	

}
