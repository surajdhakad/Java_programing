package interfacE;

 class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int s) {
		
		if(s<=0) {
			
			System.out.println("nagative number not entered");
			System.exit(0);
		}
		int sum=0;
		
		
			
			for(int i=1;i<=s;i++)
			{
				if(s%i==0) {
					sum=sum+i;
					
				
				}
			}
	return sum;
	}
	
	
	 
 }

