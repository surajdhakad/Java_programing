package Abstract;


abstract class Food{
	
	double proteins;
	double fats;
	double carbs;
	double tastyscore;
	
	
abstract void getMacroNutrients();

	
	
	
}

class Egg extends Food{
	
	
	int  tastyscore=7;
	String type="non vegiterian";
	public Egg(double proteins, double fats, double carbs) {
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
		
	}
	@Override
	void getMacroNutrients() {
		System.out.println("An egg has"+this.proteins +"gms of protein,"+this.fats+"gms of fats and"+this.carbs+"gms of carbohydrates");
		System.out.println("taste :"+ tastyscore);
	}
	
	
	
	
	
	
	
	
	
	
}


class Bread extends Food{
	
	
	int tastyscore=8;
	String type="vegetarian";
	public Bread(double proteins, double fats, double carbs) {
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
	
	}
	@Override
	void getMacroNutrients() {
		
		System.out.println("A slice of bread has"+this.proteins +"gms of protein,"+this.fats+"gms of fats and"+this.carbs+"gms of carbohydrates");
		System.out.println("taste :"+ tastyscore);
		
	}
	
	
	
	
}


















public class testing {

	public static void main(String[] args) {
		
		Bread b=new Bread(12,23.5,8);
		b.getMacroNutrients();
		
		
		System.out.println("====================================");
		
		Egg e=new Egg(13,2,4);
		e.getMacroNutrients();
		

	}

}
