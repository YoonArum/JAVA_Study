package com.ruby.java.test2;

import java.util.Iterator;
import java.util.List;
import java.io.*;

public class Gugu {
	
	private int x,y,dan,col;
	
	
	
	public void dan(int dan) {
		this.dan = dan;
	}




	public void col() {
		
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
