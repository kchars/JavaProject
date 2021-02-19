package variables;

public class CharExample {
	public static void main(String[] atgs) {
		char c1 = 'A';
		char c2 = '나';
		char c3 = '\u0043';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uad10';

		int uniCode = c1;

		String c7 = "";
		
		System.out.println(c1 + c2);
		System.out.println(c2 + c3);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		System.out.println(c7);
	}
}
