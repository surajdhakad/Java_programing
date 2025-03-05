package inheritance11_11_24;

class vehicle{
	String brand;
	int year;
	public vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}
	
	
	
	
}
class motarcycle extends vehicle{
	int enginecapacity;

	public motarcycle(String brand, int year, int enginecapacity) {
		super(brand, year);
		this.enginecapacity = enginecapacity;
	}
	public void startingine() {
		
		System.out.println("enginecapcity ="+enginecapacity);
		System.out.println("engine is starting");
	}

	
	
	
}
class sportmotorcycle extends motarcycle{
	
	boolean racemode;

	public sportmotorcycle(String brand, int year, int enginecapacity, boolean racemode) {
		super(brand, year, enginecapacity);
		this.racemode = racemode;
	}
	
	public void Activeteracemode() {
		this.racemode=true;
	//	System.out.println("race mode"+racemode);
		System.out.println("Activate the race mode.");
		
	}

	@Override
	public String toString() {
		return "sportmotorcycle [racemode=" + racemode + ", enginecapacity=" + enginecapacity + ", brand=" + brand
				+ ", year=" + year + "]";
	}

	
	

	

	

	

	
	

	
	
	
}



public class motarcyscle {

	public static void main(String[] args) {
		
		sportmotorcycle m=new sportmotorcycle("ducati",2023,1200,true);
		System.out.println(m.toString());
	m.racemode=false;
		m.startingine();
		
		m.Activeteracemode();
		
	//	m.toString();
		
		
		

	}

}
