package NestedClass;

public class Tri {

	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int num = 1;
		for(int i = 0; i< ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = num++;
			}
		}
		
		for(int i = 0; i< ary.length; i ++) {
			for(int j= 0; j<ary[i].length; j++) {
				System.out.print(i+j);
			}System.out.println();
			i = i-4;
		}
	}
}
