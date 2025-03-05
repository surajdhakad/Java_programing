package interface13_12_24;

public interface MediaPlayer {
	
	public void play();
	
	public void stop();
	

}


interface AdvancedmediaPlayer extends MediaPlayer{
	
	public void pause();
	
	
	
}

class MusicPlayer implements AdvancedmediaPlayer{
	String music;
	

	public MusicPlayer(String music) {
		if(music==null) {
			System.out.println("error message :Title is not be empty string");
			System.exit(0);
		}
		
		
		this.music = music;
		System.out.println("MusicPlayer [song Title :"+music+"]");
		
	}
	
	

	@Override
	public void play() {
		System.out.println("music is play :"+music);
		
	}

	@Override
	public void stop() {
		System.out.println("music is stop :"+music);
		
	}

	@Override
	public void pause() {
		System.out.println("music is pause :"+ music);
		
		
	}



	@Override
	public String toString() {
		return "MusicPlayer [music=" + music + "]";
	}
	
	
	
	
}


class VideoPlayer implements AdvancedmediaPlayer{

	
	
String music;
	

	public VideoPlayer(String music) {
		if(music==null) {
			System.out.println("error message :Title is not be empty string");
			System.exit(0);
			
		}
		
		
		this.music = music;
		System.out.println("VideoPlayer [song Title :"+music+"]");
		
	}
	@Override
	public void play() {
		System.out.println("video is play");
		
	}

	@Override
	public void stop() {
		System.out.println("video is stop");
		
	}

	@Override
	public void pause() {
		System.out.println("video is pause");
		
	}
	
	
}