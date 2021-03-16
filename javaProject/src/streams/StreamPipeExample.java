package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class StreamPipeExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("Hong", Member.MALE, 30),
				new Member("Hong", Member.FEMALE, 20),
				new Member("Hong", Member.MALE, 46),
				new Member("Hong", Member.FEMALE, 27)
				);
	
		IntStream mapToInt = list.stream() // Stream<Member>
		.filter(new Predicate<Member>() {

			@Override
			public boolean test(Member t) {
				return t.getSex() == Member.MALE;
			}
			
		})// Stream<Member>
		.mapToInt(new ToIntFunction<Member>())
		;
	
	
	}

}
