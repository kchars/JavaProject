package references;

import java.util.Calendar;

enum Kind{
	MALE, FEMALE;
}
enum Choose {
	YES,NO;
}

public class EnumExample {

	public static void main(String[] args) {
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println(" 월 : " + cal.get(Calendar.MONTH));
		System.out.println(" 일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));

		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("놀러");
		} else {
			System.out.println("공부");
		}
		System.out.println(today);
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남자");
		} else if (manOfWoman == Kind.FEMALE) {
			System.out.println("여자");
			
		}
		
	}
}
