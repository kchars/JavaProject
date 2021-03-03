package objects2;

import java.util.Scanner;

//1. 도서정보 입력 - 배열 이용 - 제목, 저자, 출판사, 가격
//2. 회원정보 - 배열 5개 - 이름, ID 
//
//3. 도서대여 책제목
//4. 도서반납 책제목
//5. 도서목록 확인
public class LibrarayApp {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.도서정보등록 2.회원정보등록 3.도서대여 4.도서반납 5.도서목록 9.종료");
			System.out.println("---------------------------------------------------------");
		}

		int menu = scn.nextInt();

		if (menu == 1) {
			user.getBookTitle = scn.nextInt();
			System.out.println("도서 제목을 입력하시요.");

		} else if (menu == 2) {

		} else if (menu == 3) {

		} else if (menu == 4) {

		} else if (menu == 5) {

		} else if (menu == 9) {
			break;
		}
	}
}