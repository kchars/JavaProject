package inheritances;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontRight = new Tire("앞오른쪽", 5);
	Tire BackLeft = new Tire("뒤왼쪽", 3);
	Tire BackRight = new Tire("뒤오른쪽", 7);
	
	public int run() {
		if(frontLeft.roll() == false) {
			// 메세지
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(BackLeft.roll() == false ) {
			stop();
			return 3;
		}
		if(BackRight.roll() == false ) {
			stop();
			return 4;
		}
		return 0;
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
