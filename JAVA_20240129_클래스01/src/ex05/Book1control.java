package ex05;

public class Book1control {
	public static void main(String[] args) {

		Book1 book1 = new Book1("JAVA 기본", "송미영", 30000);
		book1.displayBookInfo();

		System.out.println("-----------");
		Book book2 = new Book();
		book2.displayBookInfo();

	}

}
