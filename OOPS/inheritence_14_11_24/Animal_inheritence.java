package inheritence_14_11_24;




class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Display() {
		System.out.println("name is :"+name);
	}
	
	
	
	
}

class Mammal extends Animal{
	
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	
	public void Display() {
	super.Display();
	if(hasFur==true) {
		System.out.println("has fur: yes");
		
	}
	else {
		
			System.out.println("has fur: No");
		
	}
		
		
	}
	
}

class Dog extends Mammal{
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void Display() {
		super.Display();
		System.out.println("dog breed is: "+breed);
	}
	
}




public class Animal_inheritence {

	public static void main(String[] args) {
		
		Dog d=new Dog("Buddy",false,"golden retrever");
		d.Display();
		
	}

}
