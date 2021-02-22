package operators;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1= 10;
		int v2= ~v1;
		int v3= ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();

		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");		
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");		
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");		

		int a1 = 20;
		byte a2 = 30;
		System.out.println(sum(a1,a2));		
		a1 = 10;
		a2 = 10;
		System.out.println(sum(a1,a2));
	}

	public static String toBinaryString(int aaa) {
		String str = Integer.toBinaryString(aaa);
		while(str.length() <16) {
			str = "0" + str;
		}
		return str;
	}
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
