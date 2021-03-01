package references;

public class Morning0226 {

	public static void main(String[] args) {
		String[] names = {"임성원", "정준영", "도왕락"};
		int[] scores = {88, 89, 90};
//		String[],int[] all = { {"임성원", "정준영", "도왕락"}, {88, 89, 90} };
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + " 점수 => " + scores[i]);
		}
		
		//향상된 for문
		for(String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for ( int score : scores ) {
			sum = sum + score;
		}
		System.out.println("합계 : " + sum);
		
		morning0226();
	}

	public static void morning0226() {
		 System.out.println("_________해설_________");
		 int[] engScores = new int[3];
		 engScores = new int[] { 90, 88, 87 };
		 int[] mathScores = new int[3];
		 mathScores = new int[] { 88, 90, 92 };
		
		// int[][] scores = new int[2][];
		// scores[0] = new int[] {90, 88, 87};
		// scores[1] = new int[] {88, 90};
		
		 int[][] scores = { { 90, 88, 88 }, { 80, 90, 92 } };
		 double avg = 0.0;
		 for (int i = 0; i < scores.length; i++) {
		 int sum = 0;
		 for (int j = 0; j < scores[i].length; j++) {
		 sum += scores[i][j];
		 }
		 //
		 if (i == 0) {
		 avg = (double) sum / scores[i].length;
		 System.out.println("영어평균 : " + avg);
		 } else if (i == 1) {
		 avg = (double) sum / scores[i].length;
		 System.out.println("수학평균 : " + avg);
		 }
		 }
		
		 System.out.println(scores.length);
		 System.out.println(scores[0].length);
		 System.out.println(scores[1].length);
		 
			System.out.println("_________1._________");
			// int 영어성적 담을 수 있는 배열 .engScores - 3
			// int 수학성적 담을 수 있는 배열 .mathScores - 3
//			int[] engScores = { 85, 86, 85 };
//			int[] mathScores = { 88, 89, 89 };

			// 영어 수학성적 입력
			// 영어 수학 평균 값 코딩
			int sum = 0;
//			double avg = 0;
			// 영어
			for (int i = 0; i < engScores.length; i++) {
				System.out.println(engScores[i]);
				sum = sum + engScores[i];
			}
			avg = (double) sum / engScores.length;
			System.out.println(avg);
			// 수학
			sum = 0;
			for (int i = 0; i < mathScores.length; i++) {
				System.out.println(mathScores[i]);
				sum = sum + mathScores[i];
			}
			avg = (double) sum / mathScores.length;
			System.out.println(avg);
			System.out.println("_________2._________");
			morning0226();

		 }

	

	public static void arraycopy() {
		 int[] oldAry = {45, 55, 67};
		 int[] newAry = new int[3];
		 for (int i = 0; i < oldAry.length; i++) {
		 newAry[i] = oldAry[i];
		 }
		 System.out.println(newAry[0]);
		 System.out.println(newAry[1]);
		 System.out.println(newAry[2]);
		
		 int[] newAry2 = new int[5];
		 System.arraycopy(newAry, 0, newAry2, 2, 3);
		
		 System.out.println(newAry2[0]);
		 System.out.println(newAry2[1]);
		 System.out.println(newAry2[2]);
		 System.out.println(newAry2[3]);
		 System.out.println(newAry2[4]);
	}
}
