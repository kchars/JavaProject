package objects;

public class PersonExample {

	public static void main(String[] args) {
		// 문자열 : 이름, 정수 : 나이 int[], String[]
		// Person[] : String, int
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 14, 175.5, 71.5);
		persons[1] = new Person("김길동", 24, 275.5, 72.5);
		persons[2] = new Person("이길동", 34, 375.5, 73.5);
		persons[3] = new Person("박길동", 44, 475.5, 74.5);
		persons[4] = new Person("최길동", 54, 575.5, 75.5);
		for(Person person : persons) {
			if(person.age > 20 && person.height > 180.0) {
				person.introduce();
			} 
		}
	}
}
