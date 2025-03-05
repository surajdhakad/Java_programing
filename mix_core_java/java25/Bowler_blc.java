package java25;

public class Bowler_blc {
	private String name;
	private int wicket;
	private int matches;
	private int ball_bowled;
	private int run_conceded;
	
	
	
	
	public void bowlerDetails(String name,
			int wicket,int matches,int ball_bowled,int run_conceded ) {
		
		
		this.name=name;
		this.wicket=wicket;
		this.matches=matches;
		this.ball_bowled=ball_bowled;
		this.run_conceded=run_conceded;
		
	}
	
	public void computeBowlingAverage() {
		if(run_conceded<0||ball_bowled<0||matches<0||wicket<0) {
			System.out.println("error ");
		}
		else {
		System.out.println("name ="+name);
		System.out.println("bowling avg ="+((double)run_conceded/ball_bowled));
		}
		
	}
	public void computingStrikerate() {
		
		if(run_conceded<0||ball_bowled<0||matches<0||wicket<0) {
			System.out.println("error ");
		}
		else {
			//System.out.println("name ="+name);
			System.out.println("wicket ="+wicket);
			System.out.println("Strike rate "+((double)run_conceded/wicket));
			}
		
		
	}
	public void showStatic() {
		if(run_conceded<0||ball_bowled<0||matches<0||wicket<0) {
			System.out.println("error ");
		}
		
		else {
			System.out.println("name ="+name);
			System.out.println("wicket ="+wicket);
			System.out.println("matches ="+matches);
			System.out.println("ball boweled ="+ball_bowled);
			System.out.println("run_conceded ="+run_conceded);
		}
		
	}
}
