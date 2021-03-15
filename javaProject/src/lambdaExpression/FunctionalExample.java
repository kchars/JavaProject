package lambdaExpression;

interface MyFuntionalInterface {
	void run();
}

class MyFunctionClass implements MyFuntionalInterface {

	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}

}

public class FunctionalExample {

	public static void main(String[] args) {
		MyFuntionalInterface mif = new MyFuntionalInterface() {
			@Override
			public void run() {
				System.out.println("run()을 실행합니다.");
			}

		};
		mif.run();
		
		mif = () -> System.out.println("run() 메소드를 실행합니다.");
		mif.run();
	}
}