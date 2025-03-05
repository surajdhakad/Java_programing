package java25;

public class BowlerDemo {
	public static void main(String[] args) {
		Bowler_blc b=new Bowler_blc();
		b.bowlerDetails("sachin", 10, 5, 750, 463);
		b.computeBowlingAverage();
		b.computingStrikerate();
		
		System.out.println("=============================");
		b.showStatic();
	}

}
