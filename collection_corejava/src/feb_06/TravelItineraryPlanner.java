package feb_06;

import java.util.ArrayList;



class Activity{
	
	
	 private String name;
	    private String schedule;
		private ArrayList<Activity> activities;

	    public Activity(String name, String schedule) {
	        this.name = name;
	        this.schedule = schedule;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSchedule() {
	        return schedule;
	    }

		@Override
		public String toString() {
			return "Activity [name=" + name + ", schedule=" + schedule + "]";
		}
	    
	    
	 
	
}


class Destination{
	
	 private String name;
	    ArrayList<Activity> activities;

	    public Destination(String name) {
	        this.name = name;
	        this.activities = new ArrayList<Activity>();
	    }

	    public void addActivity(Activity activity) {
	        this.activities.add(activity);
	    }

	    public void display() {
	        for (Activity activity : activities) {
	            System.out.println(activity);
	        }
	    }
//
//		@Override
//		public String toString() {
//			
//			return super.toString();
//			
//			
//		}
	    
	    
	    
	    
	    
    @Override
    public String toString() {
        String result = "Destination: " + name + "\n";
	        for (int i = 0; i < activities.size(); i++) {
	            result += "  " + activities.get(i) + "\n";
	        }
	        return result;
	    }5
	
	    
	
}

class ItineraryPlanner{
	
	ArrayList<Destination> destinationos;

	public ItineraryPlanner() {
		this.destinationos=new ArrayList<Destination>();
	}
	   public void addDestination(Destination destination) {
	        this.destinationos.add(destination);
	    }
//	@Override
//	public String toString() {
//		
//		return super.toString();
//	}
	   
	   
//	 @Override
//	    public String toString() {
//	        String result = "";
//		        for (int i = 0; i < destinationos.size(); i++) {
//		            result += "  " + destinationos.get(i) + "\n";
//		        }
//		        return result;
//		    }
//		
//	   

	   @Override
	    public String toString() {
	        String result = "";
	        for (int i = 0; i < destinationos.size(); i++) {
	            result += destinationos.get(i) + "\n";
	        }
	        return result;
	    }
	

	
}


public class TravelItineraryPlanner {


	public static void main(String[] args) {
		ItineraryPlanner itinerary = new ItineraryPlanner();

        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        
       
        london.display();
        paris.display();

      // System.out.println(itinerary);
		
		System.out.println();
	}

}
