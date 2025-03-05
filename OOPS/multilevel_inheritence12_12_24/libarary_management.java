package multilevel_inheritence12_12_24;



class LibararyItem{
	String title;
	

	public LibararyItem(String title) {
		super();
		this.title = title;
	}


	@Override
	public String toString() {
		return "LibararyItem [title=" + title + "]";
	}


	


	
	
}

 class Book extends LibararyItem{
	 String author;
	 
	 public Book(String title, String author) {
		super(title);
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	
 }
 class Ebook extends Book{
	 String fileformet;
	 
	 public Ebook(String title, String author, String fileformet) {
		super(title, author);
		this.fileformet = fileformet;
	}

	@Override
	public String toString() {
		return "Ebook [author=" + author + ", title=" + title + ", fileformet=" + fileformet + "]";
	}



	
 }


public class libarary_management {
	

	public static void main(String[] args) {
		
		Ebook e=new Ebook("java programing","john doe","pdf");
		System.out.println(e.toString());
		

	}

}
