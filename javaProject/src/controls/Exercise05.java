package controls;

public class Exercise05 {

	public static void main(String[] args) {
		// 임의 값 2개의 수 35, 60
		// 35 ~ 60 까지 합
		// int i = 0;
		// for (i = 35; i <= 60; i++) {
		// System.out.println("i는 = " + i);
		// System.out.println("i + i는 = " + (i + i));
		// }
		// 44,67
		int sNum = 67;
		int eNum = 44;
		int sum = getSumValue3(sNum, eNum);
		System.out.println(sNum + "과 " + eNum + " 합: " + sum);
		// getSumValue(44, 67);
	} // *END MAIN

	public static int getSumValue3(int x, int y) {
		int sum = 0;
		if (x < y) {
			for (; x <= y; x++) {
				sum = sum + y;
			}
		} else {
			for (; y <= x; y++) {
				sum = sum + y;

			}
		}
		return sum;
	}

	public static int getSumValue2(int x, int y) {
		int sum = 0;
		if (x > y) {
			for (int i = x; i >= y; i--) {
				sum = sum + i;
			}
		} else {
			for (int i = x; i >= y; i++) {
				sum = sum + i;
			}

		}
		return sum;
	}

	public static int getSumValue1(int x, int y) {
		int startNo = (x > y) ? y : x;
		int endNo = (x > y) ? x : y;
		int sum = 0;
		for (int i = startNo; i <= endNo; i++) {
			sum = sum + i;
		}

		return sum;
	}

	public static void exercise06() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // *END exercise06

	public static void exercise05() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
			}
			System.out.println();
		}
	} // *END exercise05
}

// int x = 10;
// int y = 10;
// int sun = 0;
// int sum = 4 * x + 5 * y;
// if(sum % 60 == 0) {
// for (x = 0; x <= 10; x++ ) {
//
// for (y = 0; y <= 10; y++ ) {
//
// }
// System.out.println(x + " \t " + y);
// }
// }
// sum = 4 * x + 5 * y;
// System.out.println(x + " \t " + y);
// }
