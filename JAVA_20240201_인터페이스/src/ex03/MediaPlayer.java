package ex03;

public interface MediaPlayer {
	 void play();

	 void stop();

	 void pause();

	default void loadFile(String file) {
		System.out.println("파일을 로드합니다." + file);
	}

}
