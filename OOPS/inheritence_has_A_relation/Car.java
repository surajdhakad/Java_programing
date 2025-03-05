package inheritence_has_A_relation;

public class Car {
	private String make;
	private String model;
	private Engnine engnine;
	
	
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
		this.engnine = new Engnine("m121");
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engnine=" + engnine + "]";
	}
	



	
	
	

}
