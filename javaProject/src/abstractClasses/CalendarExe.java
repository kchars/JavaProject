package abstractClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExe {
	public static void main(String[] args) {
		// 달력만들기
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println("----------------");
		cal.set(2021, 4, 1); // cal 변수 값 => 2021년 5월 1일
		System.out.printf("%3d", "2");
		System.out.printf("%3s", "10");
		System.out.printf("%5s", "sun");
		System.out.printf("%5s", "mon");
		cal.set(2021, 03, 01);
		
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");
		}
		for(int i = 1; i < lastDate; i++) {
			System.out.printf("%3d", i);
			if((i+firstDay -1) % 7==0) {
				System.out.println();
			}
		}
		
//		long systemTime = System.currentTimeMillis();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
//
//		String dTime = formatter.format(systemTime);
//		System.out.println("Today is " + dTime);

	}
}
