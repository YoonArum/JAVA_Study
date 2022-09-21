package edu;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				int n = scan.nextInt();
				arr[i][j] = n;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	scan.close();
	}

}