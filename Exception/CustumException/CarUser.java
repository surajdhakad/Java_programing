package CustumException;



class CarStoppedException extends Exception {
	CarStoppedException(){
		
	}
	
 public CarStoppedException(String message) {
     super(message);
 }
}


class CarPunctureException extends Exception {
	
	
	CarPunctureException(){
		
	}
 public CarPunctureException(String message) {
     super(message);
 }
}


class CarHeatException extends Exception {
	CarHeatException(){
		
	}
 public CarHeatException(String message) {
     super(message);
 }
}



class CarTest {

 public static void stop(String action) throws CarStoppedException {
     if ("stop".equalsIgnoreCase(action)) {
         throw new CarStoppedException("Car stopped for some reason.");
     } else {
         System.out.println("Car not stalled.");
     }
 }

 public static void puncture(String action) throws CarPunctureException {
     if ("puncture".equalsIgnoreCase(action)) {
         throw new CarPunctureException("Car is punctured.");
     } else {
         System.out.println("Car not punctured.");
     }
 }

 public static void carHeat(int temperature) throws CarHeatException {
     if (temperature > 50) {
         throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
     } else {
         System.out.println("Car temperature normal.");
     }
 }
}





public class CarUser {

	public static void main(String[] args) throws Exception {
		
		CarTest c=new CarTest();
		//c.carHeat(80);
		//c.puncture("puncture");
		//c.stop("action");
		c.carHeat(60);

	}

}
