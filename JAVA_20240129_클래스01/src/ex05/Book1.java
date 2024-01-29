package ex05;

/*도서 클래스 만들기
 * 클래스 이름 : Book
 * 속성 : title, author, publisher, price
 * 기능 : displayBookInfo() : 도서의 모든 정보를 출력하는 메소드
 */
public class Book1 {

	String title;
	String author;
	String publisher;
	int price;

	Book1() {
		title = "제목없음";
		author = "저자없음";
		publisher = "출판사없음";
		price = 0;
	}

	Book1(String t, String a, int p) {
		title = t;
		author = a;
		publisher = "한빛미디어";
		price = p;
	}

	Book1(String t, String a, String b, int p) {
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
