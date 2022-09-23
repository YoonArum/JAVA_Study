package com.ruby.java.ch06;

public class StaticMethodTest {
	
	int num = 123;
	public static void main(String[] args) {
		
		StaticMethodTest.print1();
		print1();
		StaticMethodTest a = new StaticMethodTest();
		a.print2();
	}

	public static void print1() {
		System.out.println("hello");
//		int num2=num;
	}

	public void print2() {
		System.out.println("java");
		int num3=num;
	}
}