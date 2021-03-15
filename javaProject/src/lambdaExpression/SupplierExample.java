package lambdaExpression;

import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

class Member {
	String name;
	int score;

	Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Member> sup = new Supplier<Member>() {
			Scanner scn = new Scanner(System.in);
			
			@Override
			public Member get() {
				int cnt = 0, maxScore = 0;
				String maxName = null;
				while(true) {
					System.out.println("이름입력: ");
					String name = scn.nextLine();
					System.out.println("점수입력: ");
					int score = scn.nextInt();scn.nextLine();
					if(maxScore < score) {
						maxScore = score;
						maxName = name;
					}
						if(cnt++ == 2) {
							
						}
				}
				return null;
			}
		};
		
		DoubleSupplier ds=()->{
			EmoDAO dao = new EmoDAO();
		}
		
	}
}
