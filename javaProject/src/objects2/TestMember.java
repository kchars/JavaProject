package objects2;

public class TestMember {
	private String name;
	private String id;
	private String password;
	private String age;
	
	public TestMember(String name, String id, String password, String age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
