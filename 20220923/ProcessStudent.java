package com.ruby.java.ch06;

class Student {
	private int sno;
	private String name;
	private float weight;

	public void getStudent(int sno, String name, float weight) {
		this.sno = sno;
		this.name = name;
		this.weight = weight;
	}

	public void showStudent() {
		System.out.println(sno);
		System.out.println(name);
		System.out.println(weight);
	}

}

public class ProcessStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.getStudent(10, "123", 20);
		s.showStudent();
		
	}
}
