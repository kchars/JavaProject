package references;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAray = new int[10];
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < intAray.length; i++) {
			intAray[i] = (int) (Math.random() * 100 + 1);
			System.out.println(intAray[i]);
			sum = sum + intAray[i];
		}
		avg = sum / intAray.length;
		
		System.out.println("--sum-");
		System.out.println(sum);
		System.out.println("--avg-");
		System.out.println(avg);

	}

}
