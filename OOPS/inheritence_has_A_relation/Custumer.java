package inheritence_has_A_relation;

public class Custumer {
	
	private String name;
	private String email;
	private order   order;
	
	
	public Custumer(String name, String email, inheritence_has_A_relation.order order) {
		super();
		this.name = name;
		this.email = email;
		this.order = order;
	}


	@Override
	public String toString() {
		return "Custumer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	
	
	

}
