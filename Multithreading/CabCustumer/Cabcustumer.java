package CabCustumer;

public class Cabcustumer {
	
	private int custId ;
	private String custName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;
	
	
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public String getPhone() {
		return phone;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Cabcustumer() {
		super();
	}
	public Cabcustumer(int custId, String custName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	
	
	
	
	

}
