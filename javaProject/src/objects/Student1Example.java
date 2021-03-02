package objects;

public class Student1Example {

	public static void main(String[] args) {
		Student1[] students = new Student1[3];
		students[0] = new Student1("홍길동", 90, 85);
		students[1] = new Student1("김길동", 88, 85);
		students[2] = new Student1("이길동", 76, 90);
		
		for(Student1 dgdg : students) {
			dgdg.introduce();
		}
		
		
		Student1 s1 = new Student1("박길동", 90, 85);
		Student1 s2 = new Student1("최길동", 70, 85);
		Student1 s3 = new Student1("창길동", 60, 85);
		Student1 s4 = new Student1();
//		s4.name = "포길동";
		s4.setName("포길동");
//		s4.eng = 70;
		s4.setEng(-50);
//		s4.math = 80;
		s4.setMath(52);
		System.out.println(s4.getMath());
		
		Student1[] students1 = new Student1[4];
		students1[0] = s1;
		students1[1] = s2;
		students1[2] = s3;
		students1[3] = s4;
		
		
		for(Student1 gege : students1) {
			gege.introduce();
		}

		
	}

}
