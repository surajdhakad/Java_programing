

import java.util.ArrayList;

class CabCustomer {
    private int custId;
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

	public CabCustomer() {
        super();
    }

    public CabCustomer(int custId, String custName, String pickupLocation, String dropLocation, int distance, String phone) {
        super();
        this.custId = custId;
        this.custName = custName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }
}

class CabCustomerService {
    private ArrayList<CabCustomer> cabCustomer = new ArrayList<>();

    public void addCabCustomer(CabCustomer customer) {
        if (!isFirstCustomer(customer)) {
            System.out.println("Customer already added");
            return;
        }
        this.cabCustomer.add(customer);
        System.out.println("Customer added: " + customer.getCustName());
    }

    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer cabCustomer : cabCustomer) {
            if (cabCustomer.getPhone().equals(customer.getPhone())) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0.0;
        } else {
            int distance = customer.getDistance();
            if (distance <= 4) {
                return 80;
            } else {
                return 80 + 6 * distance;
            }
        }
    }

    public void printBill(CabCustomer customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.getCustName() + ", please pay your bill: Rs " + bill);
    }
}

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomer c1 = new CabCustomer(1, "Suraj", "Goa", "Hyd", 9, "1234");
        CabCustomer c2 = new CabCustomer(2, "Vivek", "Goa", "Hyd", 2, "234");
        CabCustomer c3 = new CabCustomer(3, "Saumy", "Goa", "Hyd", 20, "34");
        CabCustomer c4 = new CabCustomer(4, "Sudeep", "Goa", "Hyd", 20, "4");

        CabCustomerService s1 = new CabCustomerService();
        s1.addCabCustomer(c1);
        s1.addCabCustomer(c2);
        s1.addCabCustomer(c3);
        s1.addCabCustomer(c4);

        s1.printBill(c1);
        s1.printBill(c2);
    }
}