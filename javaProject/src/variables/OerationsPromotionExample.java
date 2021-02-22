package variables;

public class OerationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //연산은 int type으로 수행
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; //연산은 int type으로 수행
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		
		
		int intValue5 = 11;
//		int intValue6 = 10/ 4.0; // 소수점이라 double type 수행필요
		double doubleValue = intValue5 / 3.0;
		System.out.println(doubleValue);
		
	}

}
