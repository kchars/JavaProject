package controls;

public class ForExample {
	public static void main(String[] args) {
		// 1 ~ 10까지 합계
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
//			System.out.println("i = " + i + "\t");
//			sum = sum + i;
//			System.out.println("sum = " + sum);
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1 ~ 10 합 : " + sum);
	}
}
