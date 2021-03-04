package objects2;

public class MemberService {

	public static void main(String[] args) {
		login("hong", "12345");

		logout("hong");
	}

	public static void login(String id, String password) {

		if (id == "hong" && password == "12345") {
			System.out.println("로그인 성공");
		} else if (id != "hong") {
			System.out.println("로그인 실패");
		} else if (password != "12345") {
			System.out.println("로그인 실패");
		}
	}
	
	public static void logout(String id) {

		if (id == "hong") {
			System.out.println("로그아웃 완료");
		} else if (id != "hong") {
			System.out.println("로그아웃 실패");
		}
	}
}
