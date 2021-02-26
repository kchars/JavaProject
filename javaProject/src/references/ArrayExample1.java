package references;

public class ArrayExample1 {

	public static void main(String[] args) {
		// intArys
		// for반복문()
		// Math.random() * 10 + 1
		int[] intAray = new int[5];
		int maxValue = 0;

		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * 10+1);
			intAray[i] = random;
			System.out.println(intAray[i]);
			if (intAray[i] > maxValue){
				maxValue = intAray[i];
			}
		} 
		System.out.println("최대 : " + maxValue);
	}

}
