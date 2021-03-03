package objects2;
// 책제목, 저자, 출판사, 금액

public class Book {
	private String bookTitle; // 책제목
	private String bookAuthor; // 저자
	private String bookPress; // 출판사
	private int bookPrice; // 금액

	public Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

}
