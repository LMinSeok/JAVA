package ex03;

public class MP3Player implements MediaPlayer {
	@Override
	public void play() {
		System.out.println("MP3 파일 재생중");
	}

	public void stop() {
		System.out.println("정지");

	}

	public void pause() {
		System.out.println("일시정지");

	}

	public void loadFile(String file) {
	

	}
}
