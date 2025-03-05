package has_a_realtion_28_11_24;

public class Custumer {

	private int custumerId;
	private String custumerName;
	private String custumerAddress;
	private order order;
	public Custumer(int custumerId, String custumerName, String custumerAddress, has_a_realtion_28_11_24.order order) {
		super();
		this.custumerId = custumerId;
		this.custumerName = custumerName;
		this.custumerAddress = custumerAddress;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Custumer [custumerId=" + custumerId + ", custumerName=" + custumerName + ", custumerAddress="
				+ custumerAddress + ", order=" + order + "]";
	}
	
	
}
