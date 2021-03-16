package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {

	public static void main(String[] args) {
		IntStream is  = IntStream.range(10,20);
		is = IntStream.rangeClosed(10,20);
		is.forEach(v -> System.out.println(v));

		is = IntStream.rangeClosed(from, to);
		
		
	}

}
