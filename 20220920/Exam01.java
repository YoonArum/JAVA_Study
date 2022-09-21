package edu;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 5;
		for (int i = 2; i < 10; i += dan) {
			for (int j = 1; j < 10; j++) {
				for (int k = 0; k < dan; k++) {
//					if(i+k>10)break;
					System.out.printf("%d x %d = %d", i + k, j, i * j);
//					System.out.printf("%d %d %d", i, j,  k);
					if (k < dan - 1)
						System.out.printf("\t");
					else
						System.out.printf("\n");
				}
			}
			System.out.println("");

		}

	}

}
