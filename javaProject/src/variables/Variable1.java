package variables;

public class Variable1 {

	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = 10000;
		int  i1 = 25600;
		long l1 = 3456700;
		
		byte result1 = (byte) (b1+10); //casting
		short result2 = (short) (s1 + 100);
		
		int result3 = i1 + 10000;
		long result4 = l1 + 250000;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
