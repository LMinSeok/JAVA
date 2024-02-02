package ex01;

public class person {

	private /*static*/ String name; //static 메소드에서는 static 메소드만 사용가능

	public person(String val) {
		name = val;
	}

	public static String get() {//static 제거
		return name;
	}

	public void print() {
		System.out.println(name);
	}
}

public class Soojebe {
	public static void main(String[] args) {
		person obj = new person("Kim");
		obj.print();
	}
}
