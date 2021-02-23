package controls;

public class ForExample2 {

	public static void main(String[] args) {


		for (int num = 1; num <= 9; num ++) {
			showResult(num);
		}
		//		for (int num = 1; num <= 9; num ++) {
		//		for (int i = 1; i <= 9; i ++) {
		//			System.out.println(num + " * " + i + " = " + (num * i));	
		//		}
		//		}
		//		System.out.println(num + " * " + 1 + " = " + (num * 1));
		//		System.out.println(num + " * " + 2 + " = " + (num * 1));
		//		System.out.println(num + " * " + 3 + " = " + (num * 1));
		//		System.out.println(num + " * " + 4 + " = " + (num * 1));
		//		System.out.println(num + " * " + 5 + " = " + (num * 1));
		//		System.out.println(num + " * " + 6 + " = " + (num * 1));
		//		System.out.println(num + " * " + 7 + " = " + (num * 1));
		//		System.out.println(num + " * " + 8 + " = " + (num * 1));
		//		System.out.println(num + " * " + 9 + " = " + (num * 1));
	} // * END MAIN
	public static void showResult(int num) {
		for (int i = 1; i <= 9; i ++) {
			System.out.println(num + " * " + i + " = " + (num * i));	
		}
	} // * END SHOWRESULT
}