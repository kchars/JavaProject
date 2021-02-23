package controls;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 92;

		if (score >= 90) {
			if (score == 100) {
				grade = "Perpect";
			} else
			//			grade = "A";
			if (score >= 95) {
				if (score >= 90)
				grade = "A+";
			} else {
				grade = "a";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C+";
			if (score >= 75) {
			}
			grade = "C";
		} else {
			grade = "D";
		}

		System.out.println(score + "는 " + grade + "입니다.");
		System.out.println("시험 종료");

	}

}
