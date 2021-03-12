package generics;

public class BoxingMethodExample {
	Box<Integer> box1 = Util.<Integer>boxing(100);
	int intValue = box1.getBox();
	
	Box<String> box2 = Util.boxing("홍길동");
	String strValue = box2.getBox();
	
}
