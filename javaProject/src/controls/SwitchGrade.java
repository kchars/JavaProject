package controls;

public class SwitchGrade {

	public static void main(String[] args) {
		String grade = "F";
		int score = 100;

		switch (score / 10) {
		case 10:
			grade = "Perpect";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "die";
			break;
		default:
			grade = "self die";
		}

		System.out.println(score + "는 " + grade + "입니다.");

	}

}
