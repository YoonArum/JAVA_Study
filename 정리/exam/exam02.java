package exam;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("A : ");
		int a = scan.nextInt();
		System.out.print("B : ");
		int b = scan.nextInt();
		
		exam01 ex = new exam01(a, b);
		ex.setNumber(a, b);
		ex.print();	
	}
}