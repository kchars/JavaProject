package operators;

public class Exercise07 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5)); // true
		System.out.println((x % 3 == 2) || (y % 2 != 1)); // false
		// 오브젝트 호출
		Object nonli = getRectnonli(10, 5);
		System.out.println(nonli);
		boolean z = (x++ % 2 == 0) || (y++ % 3 == 0);
		if (z) {
			System.out.println("ture : " + x + ", y : " + y);
		}else {
			System.out.println("false : " + x + ", y : " + y);
		}
	}

	private static Object getRectnonli(int i, int j) {
		boolean non = ((i > 7) && (j <= 5));
		return non;
	}

	public static boolean nonli(int x, int y) {
		boolean non = ((x > 7) && (y <= 5));
		return non;

	}
}