package ex03;

public class Magazine extends Book {

	public Magazine(String title, String author, int publicationYear) {
		super(title, author, publicationYear);
	}

	@Override
	String getDetails() {
		return super.getDetails() + "발행주기";
	}
}
