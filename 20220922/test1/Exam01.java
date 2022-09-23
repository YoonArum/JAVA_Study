package com.ruby.java.test1;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armor armor = new Armor();
		String name = "mark6";
		
		System.out.println("name : " + armor.getName());
		Armor ar2 = new Armor("홍길동", 195, 200, "red", true, 100);
		System.out.println(ar2.getName()+" "+ar2.getHeight()+" "+ar2.getColor());
				
		armor.takeOn();
//		armor.speed(150);
		armor.xxxx();
		armor.speedUp(160, 200);		
		armor.setName(name);
		String n = armor.getColor();
		System.out.println("Name : "+n);
		armor.setColor("red");
		String c = armor.getColor();
		System.out.println("Color : "+c);
		armor.setHeight(1000);
		int h = armor.getHeight();
		System.out.println("Height : "+h +"M ");
		armor.setWeight(300);
		int w = armor.getHeight();		
		System.out.println("Weight : "+w+"kg ");
		armor.setWeight(200, 200); // 오버로딩
		w = armor.getWeight();		
		System.out.println("overloading Weight : "+w+"kg ");
		armor.takeOff();
		
				
		System.out.println("name : "+armor.getName()
		);
		
		
	}

}
