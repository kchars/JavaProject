package controls;

public class Exercise03 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
