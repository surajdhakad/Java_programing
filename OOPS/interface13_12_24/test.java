package interface13_12_24;

public class test {

	public static void main(String[] args) {
		MusicPlayer m=new MusicPlayer("life");
	
		
		m.play();
		m.stop();
		m.pause();

		
		System.out.println("==================");
		
		
		VideoPlayer v =new VideoPlayer("volum1");
		v.play();
		v.stop();
		v.pause();
		
		
		
	}

}
