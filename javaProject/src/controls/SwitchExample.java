package controls;

public class SwitchExample {

	public static void main(String[] args) {
		// for (int i = 0; i < 5; i++) {
		// int i1 = (int) (Math.random() * 5) + 1;
		// System.out.println(i1); // 0~1 사이 임의 수
		// }
		String msg = "짝수/홀수";
		int z = (int) (Math.random() * 10) + 1;
		switch (z) {
		case 1:
			msg = "홀수";
			break;
		case 2:
			msg = "짝수";
			break;
		case 3:
			msg = "홀수";
			break;
		case 4:
			msg = "짝수";
			break;
		case 5:
			msg = "홀수";
			break;
		case 6:
			msg = "짝수";
			break;
		case 7:
			msg = "홀수";
			break;
		case 8:
			msg = "짝수";
			break;
		default:
			msg = "그만";
			break;
		}
		System.out.println(z + "는 " + msg + "입니다.");
	}

}
