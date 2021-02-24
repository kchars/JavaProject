package controls;

import java.util.Scanner;
import java.lang.System;

public class DowhileExample {

	public static void main(String[] args) {
		// System.in.read()
		// Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("qqq");
		String str = scn.nextLine();
//		System.out.println(str);
		
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
		} while (!str.equals("q"));
		System.out.println("End program");
	}

}
