package controls;

public class Morning0224 {

	public static void main(String[] args) {
		int n1 = 0; // 메서드 값 받기용
		int n2 = 0; // 메서드 값 받기용
		int eng = 100;
		int math = 90;
//		eng = (int) (Math.random() * 100); //영어랜덤점수
//		math = (int) (Math.random() * 100); //수학랜덤점수
		int avg = (eng + math) / 2;
		String grade = "수";

		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		System.out.println("성적은 영어"+ eng + "점 수학" + math + "점의 평균으로 \"" + grade + "\" 입니다.");
		
		getAverage(n1, n2);
	} // *END MAIN

	public static String getAverage(int n1, int n2) {
		int eng = 0;
		int math = 0;
		eng = (int) (Math.random() * 100);
		math = (int) (Math.random() * 100);
		int avg = (eng + math) / 2;
		String grade = "수";

		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		System.out.println("성적은 영어"+ eng + "점 수학" + math + "점의 평균으로 \"" + grade + "\" 입니다.");
		return "hoho";
	} // *GETAVERAGE END
}
