package hierarchical_inheritance.src;


class Animal{
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	void makeSound() {
    	
    }
	
	public void displayDetails() {
		System.out.println("name is :"+name);
		System.out.println("age is :"+ age);
		
	}
	
	
	
}
class lion extends  Animal{
	
	private int meneLength;

	public lion(String name, int age, int meneLength) {
		super(name, age);
		this.meneLength = meneLength;
	}
	
	
	
	public int getMeneLength() {
		return meneLength;
	}



	public void setMeneLength(int meneLength) {
		this.meneLength = meneLength;
	}



	void makeSound() {
		System.out.println("The lion roars loudly ");
	}
	
	public void displayDetails() {
		super.displayDetails();
		this.makeSound();
		System.out.println("mene Length is :"+meneLength);
	}
	
	
}
class Elephant extends Animal{
	
	private float tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		this.tuskLength = tuskLength;
	}

	public float getTuskLength() {
		return tuskLength;
	}

	public void setTuskLength(float tuskLength) {
		this.tuskLength = tuskLength;
	}
	
	
	public void makeSound() {
		System.out.println("The elephant trumpets.");
	}
	
	public void displayDetails()  {
		
		super.displayDetails();
		this.makeSound();
		System.out.println("tusk Length is :"+tuskLength);
		 
		
	}
	
   
}


public class Zoo_mangement_sytem {

	public static void main(String[] args) {
		
		

		lion L=new lion("Simba",5,20);
		
	L.displayDetails();
	
	System.out.println();
	
	Elephant e=new Elephant("jumbo",10,2.5f);
	
	e.displayDetails();
		
		

	}

}
