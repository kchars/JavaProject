package controls;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("________________________");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("________________________");
			System.out.println("선택> ");
			
			//작성위치
			int menu = scn.nextInt(); //숫자만 읽기
			if(menu == 1) {
				System.out.println("입금액 입력");
				balance = balance + scn.nextInt();//사용자 입력값
				System.out.println("잔액 = " + balance);
			} else if(menu == 2){
				System.out.println("출금액 입력");
				balance = balance - scn.nextInt();
				System.out.println("잔액 = " + balance);
			} else if(menu == 3){
				System.out.println("잔액 = " + balance);
				
			} else if(menu == 4){
				run = false;
			} 
		}
		System.out.println("End Program");
	}

}
