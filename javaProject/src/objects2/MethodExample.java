package objects2;

import objects.Student;

public class MethodExample {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("매개값[" + i + "]:" + args[i]);
		}
		
		double result = Calculator.getRect(4.523241, 2); // static
		System.out.println(result);
		
		
		Calculator cal = new Calculator();
		result = cal.getArea(3.5);
		System.out.println(result);
		
		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student();
		s1.run();
		s1.study();
	}

}
