package Has_A_relation27_11;

public class Car {
	
	private String brand;
	private String model;
	private int year;
	private Driver driver;
	
	public Car(String brand, String model, int year, Driver driver) {
		super();
		
		if(year<=0) {
			System.out.println("invalid");
			System.exit(0);
		}
		
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
		
	}
	
	
	public Car(Car c1) {
		this.brand=c1.brand;
		this.model=c1.model;
		this.year=c1.year;
		this.driver=c1.driver;
		
		
		
		
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void changeDriver(Driver newDriver) {
		this.driver=newDriver;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}
	
	
	
	
	

}
