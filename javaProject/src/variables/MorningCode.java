package variables;

public class MorningCode {

	public static void main(String[] args) {
		int DefaltAGE = 30;
		int UserAGE = 2020;
		
		if(DefaltAGE < UserAGE) {
			System.out.println("나이가 좀 들었습니다.");
		} else if(DefaltAGE == UserAGE) { 
			System.out.println("적정한 나이입니다.");
		} else {
			System.out.println("한창이네요.");
		}
	}

}
