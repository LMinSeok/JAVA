package ex06;

import ex06.bookcontroll;

public class bookcontroll {
	public static void main(String[] args) {

		book book1 = new book("JAVA 기본", "송미영", 30000);
		book1.displayBookInfo();

		System.out.println("-----------");
		book book2 = new book();
		book2.displayBookInfo();

	}

}
