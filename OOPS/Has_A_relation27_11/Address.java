package Has_A_relation27_11;

public class Address {
	private String Street;
	private String city;
	
	public Address(String street, String city) {
		super();
		Street = street;
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + "]";
	}

	
	
	
	

}
