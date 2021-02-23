package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 0;
		while (num <= 8) {
			++num;
			showResult(num);
		}
	} // * END MAIN

	public static void showResult(int num) {
		int i = 0;
		while (i <= 8) {
			++i;
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}