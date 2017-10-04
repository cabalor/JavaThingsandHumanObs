package pl.cbl.tests;

public class Book {

	private String title;
	private String author;
	private String decription;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	public Book(String newTitle, String newAuthor, String newDscription) {
		title = newTitle;
		author = newAuthor;
		decription = newDscription;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", decription=" + decription + "]";
	}
	
	
}
