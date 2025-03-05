package Exception_5_1_25;





@SuppressWarnings("serial")
class SeatUnavailableException extends Exception{

	public SeatUnavailableException(String message) {
		super(message);
	}
	
}

@SuppressWarnings("serial")
class InvalidReservationException extends RuntimeException{

	public InvalidReservationException(String message) {
		super(message);
	}
}

class ReservationSystem {
	
	
	private  int  availableSeats;

	public ReservationSystem(int availableSeats) {
		super();
		this.availableSeats = availableSeats;
	}
	
	
	 void reserveSeat(int  numberOfSeats) throws SeatUnavailableException {
		 
		 if (numberOfSeats <= 0) {
	            throw new IllegalArgumentException("Number of seats must be greater than zero.");
	        }
		 
		 if (numberOfSeats > availableSeats) {
	            throw new SeatUnavailableException("Not enough seats available. Requested: " + numberOfSeats + ", Available: " + availableSeats);
	        }
		 
		    availableSeats = availableSeats-numberOfSeats;
	        System.out.println(numberOfSeats + " seats reserved successfully. Available seats: " + availableSeats);
		
	}
	 
	 void reserveSeatUnchecked(int numberOfSeats)  throws InvalidReservationException{
		 
		 if( numberOfSeats <=0) {
			throw new IllegalArgumentException("Number of seats must be greater than zero.");
			
		 }
		 if(availableSeats<=0) {
			 throw new InvalidReservationException("number of seats not abibale");
		 }
		 try {
			 reserveSeat(numberOfSeats);
		 }
		 catch (SeatUnavailableException e) {
	           
	            System.out.println("Error: " + e.getMessage());
		 
		 
	 }
	
	
	
}
}


public class ReservationSystemScenario {

	public static void main(String[] args) {
	
		 ReservationSystem  r1=new  ReservationSystem (100);
		 try {
	            
			
			    r1.reserveSeat(10); 
	            
	            r1.reserveSeatUnchecked(90); 
	           // r1.reserveSeatUnchecked(90); 

		 }
		 catch ( SeatUnavailableException e)
		 {
	            System.out.println("Invalid reservation: " + e.getMessage());
	        }
		 catch(  InvalidReservationException e)
		 {
			 System.out.println("Invalid reservation: "+e.getMessage());
		 }
		
		
	}

}

