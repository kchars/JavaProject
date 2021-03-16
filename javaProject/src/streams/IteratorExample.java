package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");
		
		list = Arrays.asList("Hong","Kim","Park");
		
		for(String str : list) {
			System.out.println(str);
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		Stream<String> stream= list.stream();
		stream.forEach((String t) -> {
			System.out.println(t);
		});
		
		stream = list.stream();
		int sum = stream.mapToInt(s  -> s.length()).sum();
		
		List<Integer> intList = Arrays.asList(10, 20);
	
	
	}

}
