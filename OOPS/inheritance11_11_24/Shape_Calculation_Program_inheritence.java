package inheritance11_11_24;

class Circle{
	double radius;
 Circle(){
	 this.radius=1;
 }
	public Circle(double r) {
		super();
		this.radius = r;
	}
	
	public double getArea() {
		if(radius<0) {
		
		}
		return 3.14*radius*radius;
		
	}
	
	
}

class Cylinder extends Circle{
	double height;
	Cylinder(){
		super();
		this.height=1;
		
		
	}
 Cylinder(double r, double h) {
		super(r);
		if(r<=0||h<=0) {
			System.err.println("error");
			System.exit(0);
		}
		this.height = h;
	}
public double getVolume() {
	if(height<0) {
		return -1;
	}
	return 3.14*radius*radius*height;
}
	
}


public class Shape_Calculation_Program_inheritence {
	public static void main(String[] args) {
		Cylinder c=new Cylinder(5,5);
		System.out.println("Volume:"+c.getVolume());
		System.out.println("Aria :"+c.getArea());
		
	}
	

}
