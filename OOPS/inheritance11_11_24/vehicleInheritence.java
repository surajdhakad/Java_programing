package inheritance11_11_24;



class vehicle12{
	String make;
	String model;
	int year;
	public vehicle12(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displaydetailsv() {
		
		
		if(year<=0) {
			System.err.println("error invalid input");
		}
		else
		{
			System.out.println("make is :"+make);
			
			System.out.println("model is :"+model);
		    System.out.println("year is :"+year);
		}
		
	}
	
}
class car extends vehicle12{
	int numberofDoor;

	public car(String make, String model, int year, int numberofDoor) {
		super(make, model, year);
		this.numberofDoor = numberofDoor;
	}
	public void displayDeatailsc() {
	
		if( numberofDoor<=0) {
			System.err.println("error invalid input");
		}
		else {
			displaydetailsv();
		System.out.println("numberof door:"+numberofDoor);
	
		
		}
		
		
	}
	
}
class bike extends vehicle12{
	String type;

	public bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
	
	public void displaydetails() {
		
		displaydetailsv();
		System.out.println("type is "+type);
		
	}
	
}


public class vehicleInheritence {

	public static void main(String[] args) {
		car c=new car("honda_car","e2023",32,0);
		c.displayDeatailsc();
		
		System.out.println("                               ");
		bike b=new bike("hero_bike","b123",2023,"sport");
		
		
	
		b.displaydetails();
	}

}
