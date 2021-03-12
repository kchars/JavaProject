package generics;

import java.util.HashMap;

class User {

}

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello23".hashCode());

		User user1 = new User();
		User user2 = new User();

		System.out.println(user1 == user2);

		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user2, "박길동");

		String r1 = hashMap.get(user1);
		String r2 = hashMap.get(user2);
		System.out.println(r1 + ", " + r2);

	}
}
