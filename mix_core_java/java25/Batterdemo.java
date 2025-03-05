package java25;

public class Batterdemo {

	public static void main(String[] args) {
		Batter_blc b=new Batter_blc();
		b.betterDetails("sachin", 18000, 463);
		b.computingBattingAverage();
		System.out.println("====player deatils====");
		b.getStatistics();

	}

}
