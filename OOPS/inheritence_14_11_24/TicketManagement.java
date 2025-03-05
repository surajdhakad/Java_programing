package inheritence_14_11_24;




 class Ticket{
	 private String eventName;
	 private int SeatNumber;
	 private double price;
	 
	public Ticket(String eventName, int seatNumber, double price) {
		super();
		this.eventName = eventName;
		this.SeatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		
		System.out.println("eventName :"+eventName);
		System.out.println("SeatNumber :"+SeatNumber);
		System.out.println("pricee :"+price);
		
	}
	
	 
	 
	 
 }
 
 class VipTicket extends Ticket{
	 
	 private String speciaAccess;

	public VipTicket(String eventName, int seatNumber, double price, String speciaAccess) {
		super(eventName, seatNumber, price);
		this.speciaAccess = speciaAccess;
	}

	public String getSpeciaAccess() {
		return speciaAccess;
	}

	public void setSpeciaAccess(String speciaAccess) {
		this.speciaAccess = speciaAccess;
	}
	 
	 void display() {
		 
		 super.display();
		 
		 System.out.println("specia Access:"+speciaAccess);
	 }
	 
 }
 
 
 class StudentTicket extends Ticket{
	 
	 private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	 
	
	void display() {
		
	super.display();
		if(studentDiscount==true)
		System.out.println("student Discount:yes");
		else
			System.out.println("student Discount:NO");
			
		
		
	}
	 
	 
	 
 }
 
 




public class TicketManagement {

	public static void main(String[] args) {
		
		
		Ticket t=new Ticket("concert",101,50.0);
		System.out.println("regular Ticket:");
		t.display();
		
		System.out.println("=======================================");
		VipTicket v=new VipTicket("vip concert",201,100.0,"Backstage Access");
		System.out.println("VIP Ticket:");
        v.display();
        System.out.println("==============================================");
		StudentTicket s=new StudentTicket("Student event",301,30.0,true);
		System.out.println("Student Ticket:");
		s.display();
		
		
	}

}
