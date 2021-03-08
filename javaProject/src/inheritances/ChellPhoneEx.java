package inheritances;

public class ChellPhoneEx {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		cp.equals("White");
		cp.getClass();
		cp.toString();
		
		System.out.println("===========================");
		DmbPhone dp = new DmbPhone();
		
		dp.model = "motolora";
		dp.color = "Black";
		dp.channel = 20;
				
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(40);
		dp.turnOffDmb();
		dp.powerOff();
		
		System.out.println("===========================");
		SmartPhone sp = new SmartPhone();
		
		sp.model = "LGPhone";
		sp.color = "Pink";
		
		sp.powerOn();
		sp.bell();
		sp.powerOff();
		sp.commonMethod();
		
		System.out.println("===========================");

		System.out.println(cp.toString());
		System.out.println(dp);
		System.out.println(sp);
		
		
	}

}
