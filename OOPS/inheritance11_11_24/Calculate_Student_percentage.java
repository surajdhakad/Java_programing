package inheritance11_11_24;


 class Student{
	protected String name;
	protected int rollNumber;
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		if(rollNumber<=0) {
			System.err.println("invalid input");
			
		}
		else {
		
		this.rollNumber = rollNumber;
		}
	}
	public void displaydetails() {
		System.out.println("name is :"+name);
		System.out.println("rollNumber is :"+rollNumber);
		
	}
	public double claclulatePercentage() {
		
		return 0;
		
	}
	}
		
	
 
 class SceinceStudent extends Student{
	 
	 private int phymark;
	 private int cheMark;
	 private int mathmark;
	 
	public SceinceStudent(String name, int rollNumber, int phymark, int cheMark, int mathmark) {
		
		
		super(name, rollNumber);
		if (phymark<=0||cheMark<=0||mathmark<=0) {
			System.err.println("invalid input");
			System.exit(0);
		}
		else {
		this.phymark = phymark;
		this.cheMark = cheMark;
		this.mathmark = mathmark;
		}
	}
	 
	 public void displayDetails() {
		 
		 displaydetails();
		 System.out.println("phymark :"+phymark);
		 System.out.println("cheMark :"+cheMark);
		 System.out.println("mathmark :"+mathmark);
		 
	 }
	 
	 public double claclulatePercentage() {
		double  v=((phymark+cheMark+mathmark)*100)/300;
		return v;
	 }
	 
	 
 }
 
 class Artstudent extends Student{
	 private int geomark;
	 private int histomark;
	 private int englishmark;
	public Artstudent(String name, int rollNumber, int geomark, int histomark, int englishmark) {
		super(name, rollNumber);
		if(geomark<=0||histomark<=0||englishmark<=0) {
			System.err.println("ivalid input");
			System.exit(0);
		}
		else {
		this.geomark = geomark;
		this.histomark = histomark;
		this.englishmark = englishmark;
		}
	}
	 
	public void displaydetails() {
		super.displaydetails();
		 System.out.println("geomark :"+geomark);
		 System.out.println("histomark :"+histomark);
		 System.out.println("englishmark :"+englishmark);
		
	}
	
	public double claclulatePercentage() {
		double d=((geomark+histomark+englishmark)*100)/300;
		return d;
	}
	 
 }
 
 




public class Calculate_Student_percentage {

	public static void main(String[] args) {
		SceinceStudent s=new SceinceStudent("somu",-12342,54,50,55);
		
		s.displayDetails();
		System.out.println("claclulatePercentage :"+s.claclulatePercentage());
		System.out.println("                                              ");
		Artstudent A=new Artstudent("vivek",12345,56,5,23);
		A.displaydetails();
		System.out.println("claclulatePercentage :"+A.claclulatePercentage());
	}

}
