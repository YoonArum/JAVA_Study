package com.ruby.java.test1;

import com.ruby.java.test2.*;
import java.util.List;
import java.io.*;

public class Armor {
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	private int speed;
		
	public Armor() {
		name = "John";
	}
	public Armor(String name) {
		this.name = name;
	}
	
		
	public Armor(String name, int height, int weight, String color, boolean isFly, int speed) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
		this.speed = speed;
	}
	 
	
	void takeOn() {
		System.out.println("System On");
		System.out.println("Hello :)");

	}

	void takeOff() {
		System.out.println("System Off");
		System.out.println("Good Bye :)");

	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" Change Name Complete ! ");
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println(" Change Color ! ");
	}

	public String getColor() {
		return color;
	}
	
	public void setHeight(int height) {
		this.height = height;
		System.out.println(" Change height ! ");
	}
	
	public int getHeight() {
		return height;		
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
		System.out.println(" Change weight ! ");
	}
	
//	오버로딩
	public void setWeight(int weight,int value) {
		this.weight = weight;
		System.out.println(" Change weight ! ");
	}
	
	public int getWeight() {
		return weight;
	}

	private void speed(int value) {
		speed = value;
		System.out.println("Speed = " + speed);
	}

	public void speedUp(int value, int maxValue) {
		speed = value;
		System.out.println("Speed Up = " + speed);
		System.out.println("MaxSpeed = " + maxValue);
	}

	void test(int... v) {
		System.out.println(v.length);
	}

	public void xxxx() {
		speed(1515);
	}
	
	

}
