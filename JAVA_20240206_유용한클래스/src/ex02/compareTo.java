package ex02;

public class compareTo {

	public static void main(String[] args) {
		System.out.println(CompareEx("kor", "eng"));
		System.out.println(CompareEx("kor", "math"));
		System.out.println(CompareEx("kor", "kor"));
	}

	static int CompareEx(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
