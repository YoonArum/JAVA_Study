package edu;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((int)(Math.random()*10));
		
		int[][] a = new int[5][5];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
