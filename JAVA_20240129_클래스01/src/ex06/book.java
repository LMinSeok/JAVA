package ex06;

/*도서 클래스 만들기
 * 클래스 이름 : Book
 * 속성 : title, author, publisher, price
 * 기능 : displayBookInfo() : 도서의 모든 정보를 출력하는 메소드
 */
public class book {

	String title;
	String author;
	String publisher;
	int price;

	book() {
		this("제목없음", "저자없음", "출판사없음", 0);
	}

	book(String t, String a, int p) {
		this(t, a, "출판사없음", p);
	}

	book(String t, String a, String b, int p) {
		title = t;
		author = a;
		publisher = b;
		price = p;
	}

	void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}

}
