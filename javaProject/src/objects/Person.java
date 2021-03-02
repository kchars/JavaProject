package objects;

public class Person {

	String name;
	int age;
	double height;
	double weight;
	
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	void introduce() {
		System.out.println("이름은 " + this.name + " 나이는 " + this.age + "입니다.");
	}
	
}
