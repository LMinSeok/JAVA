package ex05;

/*도서 클래스 만들기
 * 클래스 이름 : Book
 * 속성 : title, author, publisher, price
 * 기능 : displayBookInfo() : 도서의 모든 정보를 출력하는 메소드
 */
public class Book {
	private String title;
	private String author;
	private String publisher;
	private String price;

	Book() {
	}

	Book(String t, String a, String p, String pr) {
		title = t;
		author = a;
		publisher = p;
		price = pr;
	}

	void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}

}
