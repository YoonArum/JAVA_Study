package com.ruby.java.test2;

public class col {
	
	private int a[][];
	private int b[][];
	private int c[][];
	int i,j;
	
	public void seta(int a[][]) {
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {						
				this.a[i][j]=a[i][j];
				System.out.print(a[i][j] + "\t");
				}
			
		}
	}

}
