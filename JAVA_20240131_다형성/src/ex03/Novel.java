package ex03;

public class Novel extends Book {

	public Novel(String title, String author, int publicationYear) {
		super(title, author, publicationYear);
	}

	@Override
	String getDetails() {
		return super.getDetails() + "장르";
	}
}
