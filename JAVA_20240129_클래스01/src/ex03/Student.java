package ex03;

public class Student {

	private String name;
	private String studentId;
	private String major;

	Student() {
	}// 디폴트 생성자

	Student(String n, String s, String m) {
		name = n;
		studentId = s;
		major = m;
	}

	void displayInformation() {
		System.out.println("제목 : " +name);
		System.out.println("아이디 : " +studentId);
		System.out.println("전공 : " +major);
	}

}
