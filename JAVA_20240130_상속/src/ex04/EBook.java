package ex04;

public class EBook extends Book {

	private double fileSize;
	private String format;

	public EBook() {
	}

	public EBook(String title, String author, int publicationYear, double fileSize, String format) {
		super(title, author, publicationYear);
		this.fileSize = fileSize;
		this.format = format;

	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("File Size: [" + fileSize + "] MB, Format: [" + format + "]");
	}

}
