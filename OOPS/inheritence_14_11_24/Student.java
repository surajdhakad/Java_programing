package inheritence_14_11_24;

 class Student {
	 
	 int stdudentId;
	 String name;
	 double examFee;
	 
public void displaydetails(String name) {
	
}
public void  Payfee(double examFee) {
	
	
}
public Student(int stdudentId, String name, double examFee) {
	super();
	this.stdudentId = stdudentId;
	this.name = name;
	this.examFee = examFee;
}
@Override
public String toString() {
	return "Student [stdudentId=" + stdudentId + ", name=" + name + ", examFee=" + examFee + "]";
}




	 
	 
}
 
 class hostelar extends Student{
	 double hostelfee;

	public hostelar(int stdudentId, String name, double examFee, double hostelfee) {
		super(stdudentId, name, examFee);
		this.hostelfee = hostelfee;
		
	}
	
	void display() {
		
		
		
	}
	
	void payfee(double a) {
		double x=examFee+hostelfee;
		x=x-a;
		if(x<=0) {
			System.out.println("All clear ");
		}
		else {
			System.out.println("Remaining :"+x);
			
		}
		
		
		
	}

	@Override
	public String toString() {
		return "hostelar [stdudentId=" + stdudentId + ", name=" + name + ", examFee=" + examFee + ", hostelfee="
				+ hostelfee + "]";
	}

	
	
	 
 }
 
 
 class Daysholar extends Student {
	 
	 double transportfee;

	public Daysholar(int stdudentId, String name, double examFee, double transportfee) {
		super(stdudentId, name, examFee);
		this.transportfee = transportfee;
	}
	 
	 
	void payfee(double a) {
		double x=examFee+transportfee;
		x=x-a;
		if(x<=0) {
			System.out.println("All clear");
		}
		else {
			System.out.println("Remaining :"+x);
			
		}
		
		
		
	}


	@Override
	public String toString() {
		return "Daysholar [stdudentId=" + stdudentId + ", name=" + name + ", examFee=" + examFee + ", transportfee="
				+ transportfee + "]";
	}
	
	 
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
