package ex03;

public class Textbook extends Book {

	public Textbook(String title, String author, int publicationYear) {
		super(title, author, publicationYear);
	}

	@Override
	String getDetails() {
		return super.getDetails() + "학문분야";
	}
}
