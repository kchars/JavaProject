package references;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("___________________________________________________");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("___________________________________________________");
			System.out.println("Choose>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = studentNum + scanner.nextInt();
				scores = new int[studentNum];
				System.out.println("학생수 : " + studentNum);
			} else if (selectNo == 2) {
				System.out.println("scores[0]>");
				scores[0] = scores[0] + scanner.nextInt();
				System.out.println("scores[1]>");
				scores[1] = scores[1] + scanner.nextInt();
				System.out.println("scores[2]>");
				scores[2] = scores[2] + scanner.nextInt();
			} else if (selectNo == 3) {
				System.out.println("scores[0] = " + scores[0]);
				System.out.println("scores[1] = " + scores[1]);
				System.out.println("scores[2] = " + scores[2]);

			} else if (selectNo == 4) {
				int maxValue = 0;
				double avg = 0.0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				System.out.println("최대 : " + maxValue);
//				avg = 
//				int max = 0, sum = 0;
//				double avg = 0.0;
//				for(int i=0; i < scores.length; i++) {
//					if(max < scores[i]); max = scores[i];
//					sum += scores[i];
//				}
//				avg = (double)sum / studentNum;
//				System.out.println("최고 점수: " + max);
//				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("End program");
	}

}
