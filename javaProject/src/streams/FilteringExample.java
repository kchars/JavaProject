package streams;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동"//
				, "신용권"//
				, "감자바"//
				, "신용권"//
				, "신민철"//
		);

		List<Member> members = Arrays.asList(//
				new Member("Hong", Member.MALE, 30)//
				, new Member("Kim", Member.FEMALE, 28)//
				, new Member("Shin", Member.MALE, 46)//
				, new Member("Hong", Member.MALE, 30)//
				, new Member("Park", Member.MALE, 27)//

		);
		
		members.stream()//
		.distinct()//
		.forEach(System.out::println);
		System.out.println();

//		names.stream()//
//				.distinct()//
//				.forEach(n -> System.out.println(n));
//		System.out.println();
//
//		names.stream()//
//				.filter(n -> n.startsWith("신"))//
//				.forEach(n -> System.out.println(n));
//		System.out.println();
//
//		names.stream()//
//				.distinct()//
//				.filter(n -> n.startsWith("신"))//
//				.forEach(n -> System.out.println(n));
	}

}
