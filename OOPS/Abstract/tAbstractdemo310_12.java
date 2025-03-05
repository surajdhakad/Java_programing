package Abstract;

abstract  class car {
	
	
	  String brand;
	  String model;
	  int milage;
	  int top_speed;
	  int yearOfManufacturing;
	  
	  
	  
	  
	public car() {
		super();
	}

	
	
	public   String carBrand(String brand) {
		this.brand=brand;
		return brand;
	}
	  
	public String carModel(String model) {
		this.model=model;
		return model;
		
	}
	
	public int carMileage( int milage) {
		this.milage=milage;
		return milage;
	}
	  
public int carTopSpeed(int top_speed) {
	this.top_speed=top_speed;
	return top_speed;
}

public int carYear(int yearOfManufacturing) {
	this.yearOfManufacturing=yearOfManufacturing;
	return yearOfManufacturing;
}

 abstract public void display();
	
	

	
	
	
	
}


class test extends car {
	
	@Override
	public void display() {
		System.out.println("brand is :"+brand);
		System.out.println("model is :"+model);
		System.out.println("milage is "+milage);
		System.out.println("top_speed :"+ top_speed);
		System.out.println("yearOfManufacturing :"+yearOfManufacturing);
	
}
}

public class  tAbstractdemo310_12 {
	
	
	

	public static void main(String[] args) {
		test c=new test();
		c.carBrand("bmw");
		c.carModel("2024");
		c.carMileage(15);
		c.carTopSpeed(150);
		c.carYear(2022);
		
		c.display();
	


		
		
	}

	
	
	


}













