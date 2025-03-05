package multithread;


class Course{
	
	int courseId;
	String courseName;
	double corseFee;
	
	public Course(int courseId, String courseName, double corseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.corseFee = corseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	
	public String getCourseName() {
		return courseName;
	}

	
	public double getCorseFee() {
		return corseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corseFee=" + corseFee + "]";
	}

	
	
	
	
}

class Offer{
	
	String offerText;

	public Offer(String offerText) {
		super();
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}


}

class EducationInstitute{
	
	Course [] courses;
	Offer  []  offers;
	
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}


	public Course[] getCourses() {
		return courses;
	}


	public Offer[] getOffers() {
		return offers;
	}


	
	
	public void enrollStudentInCourse(int courseId ,String studentName) {
		
		System.out.println("course id is:"+courseId);
		System.out.println( studentName  +" has enrolled in the course :");
		for (Course course : courses) {
			if(course.getCourseId()==courseId){
				System.out.println(course.getCourseName());
			}
		}
		
		
	}
	

	
}
class Student {
	String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	
	public void viewCoursesAndFees(){
		
		for(Course c:institute.getCourses()) {
			System.out.println("Course name is :"+c.courseName);
			System.out.println("Course fee name is :"+c.corseFee);
		}
		
	}
	
	public void  viewOffers() {
		for(Offer o1:institute.getOffers())
		{
			System.out.println(
					 ""+o1.getOfferText());
		}
			
	}
	
	
	public void enrollInCourse(int courseId) {
		
		
		institute.enrollStudentInCourse(courseId, this.name);	
	}
	
	
	
}


public class EducationInstituteApp {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Course []c = {new Course(1,"java",1000),new Course(2,".net",2000),new Course(3,"css",3000)};
		Offer []o1= {new Offer("on java 20% off"),new Offer("on.net 10% off"),new Offer("on css 5% off")};
		EducationInstitute e=new EducationInstitute(c,o1);
		Student virat=new Student("virat",e);
		Student Dhoni=new Student("Dhoni",e);
		
		
		Thread t1=new Thread() {
			
			
			public void run() {
				 
				virat.viewCoursesAndFees();
				virat.viewOffers();
				virat.enrollInCourse(3);
			}
		};t1.start();
		t1.join();
		
    System.out.println("----------------------------");
		Thread t2=new Thread() {
			
			
			public void run() {
				 
				Dhoni.viewCoursesAndFees();
				Dhoni.viewOffers();
				Dhoni.enrollInCourse(2);
			}
		};t2.start();
		
		
		
	}
	
	

}
