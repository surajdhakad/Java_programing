package exception30_12_24;

public class ClassNotFoundExpDemo {

	public  ClassNotFoundExpDemo(String a) {
		Class<?> cls;
		try
		{
			cls = Class.forName(a);
			System.out.println(cls.getSimpleName());
		}
		catch (Exception e) {
			System.out.println("NonExistentClass");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	new ClassNotFoundExpDemo("exception30_12_24.AreaCalculat");
		
		
	}
	
	

}
