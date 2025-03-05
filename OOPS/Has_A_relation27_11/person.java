package Has_A_relation27_11;

public class person {
	
	private String name;
	private Address address;
	
	
	public person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}


	
	
	
	

}
