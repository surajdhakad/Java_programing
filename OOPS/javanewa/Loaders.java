package javanewa;

public class Loaders {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> forName = Class.forName("javanewa.Loaders");
		System.out.println(forName.getClassLoader().getParent().getParent());

	}

}
