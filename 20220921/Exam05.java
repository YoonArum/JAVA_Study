package edu;

import java.util.Iterator;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int b[][] = { { 1, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 0, 1, 1 } };
		
		int a[][]=new int[2][3];
		int b[][]=new int[3][4];
		int c[][] = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]=(int)(Math.random()*10);
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
									
				for (int k = 0; k < b.length; k++) {
					c[i][j] = a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
