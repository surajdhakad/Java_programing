package feb_10;

import java.util.ArrayList;

class FoodCustomer {

	private int customerId;
	private String customerName;
	private String address;
	private String phoneNumber;

	public FoodCustomer(int customerId, String customerName, String address, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

class FoodOrderService {

	private ArrayList<FoodCustomer> customers = new ArrayList<FoodCustomer>();

	public FoodOrderService() {
		// TODO Auto-generated constructor stub
	}

	public void placeOrder(FoodCustomer customer) {
		customers.add(customer);
	}

	public boolean isFirstTimeCustomer(FoodCustomer customer) {
		for (FoodCustomer c : customers) {
			if (c.getPhoneNumber().equals(customer.getPhoneNumber())) {
				System.out.println("No");
				return false;
			}
		}
		placeOrder(customer);
		System.out.println("Yes");
		return true;
	}

	public double calculateBookingCost(FoodCustomer customer, double baseCost) {
		if (isFirstTimeCustomer(customer)) {
			return 0;
		}
		return baseCost;
	}

	public String printBookingDetails(FoodCustomer customer, double bookingCost) {
		return "Booking confirmed for " + customer.getCustomerName() + ". Booking cost: " + bookingCost;
	}

}

public class FoodOrderServiceTester {

	public static void main(String[] args) {

		FoodOrderService f = new FoodOrderService();

		FoodCustomer s1 = new FoodCustomer(01, "suraj", "srt12", "7440381220");
		FoodCustomer s2 = new FoodCustomer(02, "saumy", "srt13", "7440381220");
		FoodCustomer s3 = new FoodCustomer(03, "vivek", "srt14", "1233453");

//		System.out.println(f.isFirstTimeCustomer(s1));
//		f.placeOrder(s1);
//		f.placeOrder(s2);
//		f.placeOrder(s3);
//		System.out.println(f.isFirstTimeCustomer(s1));

//		s1.getCustomerName()

		double cost = f.calculateBookingCost(s1, 50);

		System.out.println(f.printBookingDetails(s1, cost));
		
		double cost1 = f.calculateBookingCost(s2, 50);

		System.out.println(f.printBookingDetails(s2, cost1));
		
		double cost2 = f.calculateBookingCost(s3, 50);

		System.out.println(f.printBookingDetails(s3, cost2));
	//	double cost1 = f.calculateBookingCost(s1, 50);
		
		//System.out.println(f.printBookingDetails(s1, cost1));

	}

}
