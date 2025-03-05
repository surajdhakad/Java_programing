package assignment4_12_24;

class shape {
	
	public static shape randshape() {
		switch((int) (Math.random()*3)) {
		case 0: return new  Circle();
		case 1:return new Tringle();
		case 2:return new Square();
		default: System.out.println("finaly return an object for shape class");
		}
		return new shape();
	}
	
	
		public shape() {
		super();
	}

		public void draw() {
			System.out.println("shape draw");
			
		}
		
		public void  erase() {
			System.out.println("Shape erase");
		}
		
	
	
	
	
	

}


  class Circle extends  shape{
	  
	  
	 
	  public Circle() {
		super();
	}
	@Override
	 public void draw() {
			System.out.println("circle draw");
			
		}
	  @Override
		public void  erase() {
			System.out.println("circle erase");
		}
		
		
		
		
	 
	 
 }
  
  
  
  class Tringle extends shape{
	  
	  
	  
	  public Tringle() {
		super();
	}
	@Override
	  public void draw() {
			System.out.println("Tringle draw");
			
		}
	  @Override
		public void  erase() {
			System.out.println("Tringle erase");
		}
	  
  }
  
  class Square extends shape{
	  @Override
	  public void draw() {
			System.out.println(" Square draw");
			
		}
	  @Override
		public void  erase() {
			System.out.println(" Square erase");
		}
	  
  }
  
  
