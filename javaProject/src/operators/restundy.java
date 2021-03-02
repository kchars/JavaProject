package operators;

import java.util.Scanner;

public class restundy {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0; // 학생수
		int number = 0;

		while (true) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				if (studentNum != 0) {
					System.out.println("이미 입력했습니다.");
				} else {
					System.out.print("학생수> ");
					studentNum = scn.nextInt();
					students = new int[studentNum][3]; // 행,열 설정
				}
			} else if (menu == 2) {
				for (int i = 0; i < studentNum; i++) {
					if (students[i][0] != 0 | students[i][1] != 0 | students[i][2] != 0) {
						System.out.println("이미 입력했습니다.");
						break;
					} else {
						for (i = 0; i < studentNum; i++) {
							System.out.print("학생번호>> ");
							students[i][0] = scn.nextInt();
							System.out.print("영어점수> ");
							students[i][1] = scn.nextInt();
							System.out.print("수학점수> ");
							students[i][2] = scn.nextInt();
						}
					}
				}
			} else if (menu == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println(
							"학생정보 - 번호:" + students[i][0] + ", 영어:" + students[i][1] + ", 수학:" + students[i][2]);
				}
			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력> ");
				number = scn.nextInt(); // 학생번호
				for (int i = 0; i < studentNum; i++) {
					if (number == students[i][0]) {
						System.out.println(
								"학생정보 - 번호:" + students[i][0] + ", 영어:" + students[i][1] + ", 수학:" + students[i][2]);
					}
				}
			} else if (menu == 5) {
				int engMax = 0; // 영어최고점
				for (int i = 0; i < studentNum; i++) {
					if (engMax < students[i][1]) {
						number = students[i][0]; // 최고점 학생의 번호
						engMax = students[i][1]; // 최고점수
					}
				}
				System.out.println("영어최고점: 학생번호 - " + number + " - 영어: " + engMax);
			} else if (menu == 6) {
				int sum = 0; // 합계
				double avg = 0.0; // 평균
				for (int i = 0; i < studentNum; i++) {
					if (sum < students[i][1] + students[i][2]) {
						number = students[i][0]; // 최고점 학생의 번호
						sum = students[i][1] + students[i][2];
					}
					avg = sum / 2.0;
				}
				System.out.println("학생번호 - " + number + " 평균점수: " + avg);
			} else if (menu == 7) {
				int sum = 0; // 합계
				int avg = 0; // 평균
				for (int i = 0; i < studentNum; i++) {
					sum += students[i][2];
				}
				avg = (int) (0.05 + (double)(sum / studentNum * 10 / 10.0)); // 평균점수 소수첫째점까지 반올림
				System.out.println("평균점수: " + avg);
				for (int i = 0; i < studentNum; i++) {
					if (avg < students[i][2]) {
						System.out.println("학생번호 - " + students[i][0] + " 수학점수: " + students[i][2]);
					}
				}
			} else if (menu == 9) {
				break;
			}
		}
		scn.close();
		System.out.println("프로그램 종료");
	}
}