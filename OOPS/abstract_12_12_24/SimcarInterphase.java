package abstract_12_12_24;


interface SimcarInterphase {
    String getPhoneNumber();
    String getNetworkProvider();
    void activate();
    void deactivate();
    boolean getIsActive();
    
    
}

 class Jio implements SimcarInterphase{

	
	private String Phonenumber;
  private boolean isActive;
  
  
  
  
  
	public Jio(String Phonenumber){
		this.Phonenumber=Phonenumber;
		 this.isActive = false;
		
	}
	
	
	
	
	@Override
	public String getPhoneNumber() {
		
		return Phonenumber;
	}

	@Override
	public String getNetworkProvider() {
	
		return "jio";
	}

	@Override
	public void activate() {
		isActive = true;
        System.out.println("Jio SIM activated.");
		
	}

	@Override
	public void deactivate() {

		isActive = false;
        System.out.println("Jio SIM deactivated.");
		
	}
	public boolean getIsActive() {
		return isActive;
	}
	
	
}
 
 
 
 class Airtel implements SimcarInterphase{

	 private String Phonenumber;
	  private boolean isActive;
	 
	  public Airtel(String Phonenumber) {
		  this.Phonenumber=Phonenumber;
		  this.isActive=false;
	  }
	  
	  
	@Override
	public String getPhoneNumber() {
		
		return Phonenumber;
	}

	@Override
	public String getNetworkProvider() {
		
		return "Airtel";
	}

	@Override
	public void activate() {
		isActive = true;
        System.out.println("Airtel SIM activated.");
		
	}

	@Override
	public void deactivate() {

		isActive = false;
        System.out.println("Airtel SIM deactivated.");
		
	}
	public boolean getIsActive() {
		return isActive;
	}

 }
 
 class BSNL implements SimcarInterphase{

	 private String Phonenumber;
	  private boolean isActive;
	 
	  public BSNL(String Phonenumber) {
		  this.Phonenumber=Phonenumber;
		  this.isActive=false;
	  }
	  
	  
	@Override
	public String getPhoneNumber() {
		
		return Phonenumber;
	}

	@Override
	public String getNetworkProvider() {
		
		return "BSNL";
	}

	@Override
	public void activate() {
		isActive = true;
        System.out.println("BSNL SIM activated.");
		
	}

	@Override
	public void deactivate() {

		isActive = false;
        System.out.println("BSNL SIM deactivated.");
		
	}
	public boolean getIsActive() {
		return isActive;
	}

	 
 }
 
 
  interface MobilePhoneInterface {
	    void insertSIM(SimcarInterphase simCard);
	    void removeSIM();
	    void makeCall(String number);
	    void sendText(String message);
	}
  
  class MobilePhone implements MobilePhoneInterface {
	    private SimcarInterphase simCard;

		@Override
		public void insertSIM(SimcarInterphase simCard) {
			
			 this.simCard = simCard;
		        simCard.activate();
		        System.out.println("Inserted " + simCard.getNetworkProvider() + " SIM with number: " + simCard.getPhoneNumber());
		}

		@Override
		public void removeSIM() {
			if (simCard != null) {
	           simCard.deactivate();
	            System.out.println("Removed " + simCard.getNetworkProvider() + " SIM.");
	            simCard = null;
	        } else {
	            System.out.println("No SIM card to remove.");
	        }
			
		}

		@Override
		public void makeCall(String number) {
			if (simCard != null&&simCard.getIsActive()!=false) {
	            System.out.println("Making a call to " + number + " using " + simCard.getNetworkProvider() + " SIM.");
	        } else {
	            System.out.println("No SIM card inserted or it is deactivate. Cannot make a call.");
	        }
			
		}

		@Override
		public void sendText(String message) {
			 if (simCard != null) {
		            System.out.println("Sending text: \"" + message + "\" using " + simCard.getNetworkProvider() + " SIM.");
		        } else {
		            System.out.println("No SIM card inserted. Cannot send a text.");
		        }
			
		}
  }
 
 