package Abstract;



 abstract class Book {
	 
	 protected String  title;
	 
	 
	 
	 public Book(String title) {
		super();
		this.title = title;
	}
	abstract void  setTitle();
	 abstract void  getTitle();
	 
	 
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	 
	 
		 
	 
	 
	 
}
 
 class mybook extends Book{

	public mybook(String title) {
		super(title);
	}

	@Override
	void setTitle() {
	
		
	}

	@Override
	void getTitle() {
		
		
	}

	
	
	 
 }




public class Tester2 {
	public static void main(String[] args) {
		
		mybook s=new mybook("halfgirl");
		System.out.println(s);
		
	}

}
