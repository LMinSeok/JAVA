package ex03;

public class BookControll {

	public static void main(String[] args) {

		details(new Novel("JAVA","홍길동", 2023));
		details(new Textbook("c언어", "놀부",2022));
		details(new Magazine("파이썬", "까치", 2021));

	}

	static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}
}
