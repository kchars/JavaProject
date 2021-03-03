package objects2;

// 회원ID, 회원이름, (대여)도서[] rentBooks
public class Member {
	private String memberID; // 회원ID
	private String memberName; // 회원이름
	private Book[] rentBooks = new Book[3]; // 도서대여
	private String Bookinfo;
	
	public Member() {}

	
	public void setBookinfo(String bookinfo) {
		Bookinfo = bookinfo;
	}

	public Member(String memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}


	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
				break;
			}
		}
	}
	public String getBookinfo() {
		String result = "";
		result = memberName;
		System.out.print(result + " - ");
		
		for(int i = 0; i < rentBooks.length; i++) {
			if(rentBooks[i] != null) {
				System.out.print(rentBooks[i].getBookTitle());
			}
		}
		return result;
	}

}
