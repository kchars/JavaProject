package generics;

public class CompareMethodExample {
	public static void main(String[] args) {
	    Pair<Integer, String> p1 = new Pair<Integer, String>(3000, "김남준");
	    Pair<Integer, String> p2 = new Pair<Integer, String>(3000, "김남준");
	    
	    boolean result = Util.compare(p1, p2);
	    System.out.println(result);
	    
	    Pair<String, String> p3 = new Pair<>("김남준", "김남준");
	    Pair<String, String> p4 = new Pair<>("김남준", "준남김");
	    
	    result = Util.compare(p3, p4);
	    System.out.println(result);
	  }
}
