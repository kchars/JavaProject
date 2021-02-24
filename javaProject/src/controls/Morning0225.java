package controls;

public class Morning0225 {

	public static void main(String[] args) {
		int sum = 0;
		int n1 = 11; // 11부터
		int n2 = 30; // 30까지
//		for (int i = n1; i <= n2; i++) {
//			System.out.println(sum + "\t" + i);
//			sum = sum + i;
//		}
//		System.out.println(sum);

		
		sum = getSum(n1,n2);
		
		System.out.println(sum);
	} //*MAIN END
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum = sum + i;
		}
		return sum;
	} //* GETSUM END
}
