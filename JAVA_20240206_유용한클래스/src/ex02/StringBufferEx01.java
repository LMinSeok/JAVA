package ex02;

public class StringBufferEx01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append(123);
		sb.append(456);

		System.out.println(sb);
	}

}
