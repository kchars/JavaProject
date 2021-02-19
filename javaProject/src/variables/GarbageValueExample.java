package variables;

public class GarbageValueExample {
	public static void main (String[] args) {
		int var1 = 125;
		int var2 = 125;
		for(int a = 0; a<5; a++) {
			var1 = var1 + 1;
			var2++;
			System.out.println("var1: " + var1 + '\n' + "var2: " + var2);
		}
	}
}
