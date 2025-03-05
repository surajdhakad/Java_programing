package java25;

public class Batter_blc {
	private String name;
	private int runs;
	private int matches;
	private float batting_avg;
	

	
	public void betterDetails(String name,
			int runs,int matches) {
		this.name=name;
		this.runs=runs;
		this.matches=matches;
		
		
		
	}
	public void computingBattingAverage() {
		
		if(runs<0||matches<0) {
			System.out.println("error");
		}
		else if (runs>0&&matches<=0) {
			System.out.println("error");
		}
		else
		{
			System.out.println("name="+name);
			
			
			batting_avg=runs/matches;
			System.out.println("batting_avg="+batting_avg);
		}
		
	}
	
	public void getStatistics() {
		if(runs<0||matches<0) {
			System.out.println("error");
		}
		else if (runs>0&&matches<=0) {
			System.out.println("error");
		}
		else {
		System.out.println("name ="+name);
		System.out.println("runs ="+runs);
		System.out.println("matches ="+matches);
		}
		
	}
}
