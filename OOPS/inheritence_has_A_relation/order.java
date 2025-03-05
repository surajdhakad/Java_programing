package inheritence_has_A_relation;

public class order {

	private String orderid;
	private String productname;
	
	
	public order(String orderid,String productname) {
		super();
		if(Integer.parseInt(orderid)<=0) {
			System.out.println("ivalid");
			System.exit(0);
		
		}
		this.orderid=orderid;
		this.productname=productname;
		
	
}
	
	public  String getorderid() {
		return orderid;
	}

	public String getProductname() {
		return productname;
	}

	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", productname=" + productname + "]";
	}

	
	
}
