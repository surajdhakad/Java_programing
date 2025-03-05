package methodoverloading29_11_24;


class calculate{
	
	public int calculateArea(int side)
{
	 int 	area_of_a_square=(side*side);
	 return area_of_a_square;
}
	
	public int calculateArea(int length,int width)
	{
		if(length<=0||width<=0) {
			System.out.println("Length and width must be non-negative.");
			System.exit(0);
		}
		int 	area_of_a_rectangle=(length*width);
		return area_of_a_rectangle;
		
	}
	public double calculateArea(double radius)
	{
		if(radius<=0) {
			System.out.println("Side length must be non-negative");
			System.exit(0);
		}
	
		double area_of_a_circle=(3.14*radius*radius);
		return area_of_a_circle;
		
	}
}



public class ShapeCalculator {

	public static void main(String[] args) {
		
		calculate s=new calculate();
		System.out.println("area_of_a_square :"+s.calculateArea(4));
		System.out.println("area_of_a_rectangle :"+s.calculateArea(4,3));
		System.out.println("area_of_a_circle :"+s.calculateArea(-4.3));
		
		
	}

}
