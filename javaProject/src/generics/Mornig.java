package generics;

public class Mornig {
	public static void main(String[] args) {
		checkGender("0112233456678");
		checkGender("011223-3456678");
		
	}
	
	public static String checkGender(String j) {
		String[] rep = {"/","-","*","="};
		
		String r = j
		
		for(String str : rep ) {
			r = r.replace(str,"");
		}
		if(r.charAt(6)=='1'||r.charAt(6)=='3') {
			return "남자";
		} else if (r.charAt(6)=='2'||r.charAt(6)=='4'){
			return "여자";
		}
		
		
		return "";
	}
	
}
