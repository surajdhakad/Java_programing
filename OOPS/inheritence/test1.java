package inheritence;

 class Animal{
	 String name="lion";
	public void eat(){
		System.out.println("this animal eat food");
		
	}
 }
	class dog extends Animal{
		
		public void bark() {
			System.out.println("dog is barking");
		}
	}
 
 
public class test1 {
	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.eat();
	}

	
	

	
}
