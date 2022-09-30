package edu;

class point {
	private int x, y;
	private String color;

	public point(int x, int y,String c) {
		this.x = x;
		this.y = y;
		this.color = c;
		
		

		System.out.println("생성자 호출");
	}

	public void getpoint() {
		System.out.println("x = " + x + "\ny = " + y);
	}

	public void setpoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setColor(int x, int y, String color) {
		setpoint(x, y);
		this.color = color;
	}

	public void getColor() {
		System.out.println("color = " + color);
		getpoint();
	}

}

public class Testpoint {
	public static void main(String[] args) {
//		point p = new point();
		point p = new point(10, 20,"blue");
		p.setpoint(10, 20);
		p.getpoint();

	}
}
