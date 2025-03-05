package interface13_12_24;

public interface Calculator {
	
	public void calculateSum (int...x);

}


class SimpleCalculator  implements Calculator{

	@Override
	public void calculateSum(int... x) {
		
		int sum=0;
		for(int s:x) {
			
			sum=sum+s;
			
		}
		System.out.println(sum);
		
	}
	
}