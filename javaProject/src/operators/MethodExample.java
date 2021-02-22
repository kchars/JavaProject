package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		// result = 30,20의 차이를 계산하는 minus()
		int result1 = minus(30, 20);
		// result = 15,13의 차이를 계산하는 multi()
		int result2 = multi(15, 13);
		// result = 30,12의 차이를 계산하는 divide()
		double result3 = divide(30, 12);

		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result1);
		System.out.println("결과 : " + result2);
		System.out.println("결과 : " + result3);
		System.out.println(""+ 10 + 20 );

	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static double divide(double a, double b) {
		double result = a / b;
		return result;
	}

}
