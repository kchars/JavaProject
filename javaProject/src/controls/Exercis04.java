package controls;

public class Exercis04 {

	public static void main(String[] args) {
		int v1 = 0;
		int v2 = 0;
		int set = 0;
		System.out.println(v1 + "\t" + v2);
		while(set != 5) {
			v1 = (int)(Math.random() *6) + 1;
			v2 = (int)(Math.random() *6) + 1;
			set = (int)(v1 + v2);
			System.out.println(v1 + "\t" + v2);
			System.out.println(set);
		}
		System.out.println(set);
	}

}
