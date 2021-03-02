package objects;

public class Student1 {

	private String name;
	private int eng;
	private int math;

	Student1() {
	}

	Student1(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void introduce() {
		System.out.println("이름은 " + name + ", 영어 " + eng + ", 수학 " + math + "\n합계 : " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}
	public String getName() {
		return this.name;
	}
}
