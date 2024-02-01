package ex02;

public class MediaPlayerControl {

	public static void main(String[] args) {
		MediaPlayer player = new MP3Player();
		player.play();
		
		player = new FLACPlayer();
		player.play();
		
		player = new WAVPlayer();
		player.play();
	}

}
