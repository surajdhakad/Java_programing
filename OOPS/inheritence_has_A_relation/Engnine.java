package inheritence_has_A_relation;

public class Engnine {
	private String  model;

	
	public Engnine(String model) {
		super();
		this.model = model;
	}


	public String getModel() {
		return model;
	}





	@Override
	public String toString() {
		return "Engnine [model=" + model + "]";
	}
	
	
	

}
