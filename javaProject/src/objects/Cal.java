package objects;

public class Cal {
	public static void main(String[] args) {
		showInfo("일길동", 24, 1.1);
		showInfo("이길동", 34, 2.2);

		Student2 std = new Student2();
		std.setName("사길동");
		std.setEng(23);
		std.setMath(34);
		showInfo(std);

		Student2[] stds = new Student2[3];
		stds[0] = new Student2("오길동", 77, 88);
		stds[0] = new Student2("육길동", 79, 89);
		stds[0] = new Student2("칠길동", 90, 100);
		showInfo(stds);

	}

	public static void showInfo(Student2[] students) {
		for (Student2 std : students) {
			if (std != null) {
				showInfo(std);
			}
		}
	}

	public static void showInfo(Student2 student) {
		System.out.println(student.getName() + ", 안녕하세요.");
		System.out.println("영어점수는 " + student.getEng());
		System.out.println("수학점수는 " + student.getMath());
		System.out.println("점수합계는 " + (student.getEng() + student.getMath()));
	}

	public static void showInfo(String name, int ho, double ho2) {
		System.out.println(name + ", 안녕하세요." + ho + ho2);
	}

}
