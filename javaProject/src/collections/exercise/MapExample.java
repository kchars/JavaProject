package collections.exercise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		Collection values = map.values();
		
		it = values.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			totalScore += i.intValue();
		}
		
		System.out.println("평균점수: " + (float)totalScore/map.size());
		
		System.out.println("최고점수: " + Collections.max(map.values()));
		
		System.out.println("최고점수를 받은 아이디: " + Collections.max(map.values()));
		
		String str;
		System.out.println("b".compareTo("a"));
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("a");
		tSet.add("b");
		tSet.add("c");
		tSet.first();
		tSet.last();
	}

}
