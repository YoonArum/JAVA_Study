package edu;

public class TestStatic {

	static void show(int a[][]) {
//		System.out.println("hello");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		int a[][]=new int[3][4];
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		show(a);
//		TestStatic.show();

	}

}
