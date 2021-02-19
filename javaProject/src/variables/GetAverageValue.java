package variables;

public class GetAverageValue {

	public static void main(String[] args) {
		int a1 = 17;
		int a2 = 18;
		
//		int sum = a1 + a2;      //1.
//		double avg = sum/2.0;
		
		double avg = (double) (a1 + a2)/2;  //2.
		
		System.out.println("두 수의 평균은 : " + avg + " 입니다.");
	}

}
