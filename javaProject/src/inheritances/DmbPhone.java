package inheritances;

public class DmbPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + " 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + " 로 변경합니다..");
	}
	void turnOffDmb() {
		System.out.println("방송을 종료합니다.");
	}
	@Override
	void powerOn() {
		System.out.println("DbmpOhone 전원을 켭니다.");
	}
	@Override
	void powerOff() {
		System.out.println("DbmpOhone 전원을 끕니다.");
	}
	@Override
	void bell() {
		System.out.println("DbmpOhone 벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + " / color : " + color + " / Channel " + channel;
	}
	
	
	
	
}
