package edu;

class ColorPoint extends point {
	public ColorPoint(int x, int y) {
		super(x, y);
	}
}

public class Testcolorpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint c = new ColorPoint(10, 20
				);
		c.getColor();
		c.setColor(920, 100, "red");
		c.getColor();

		c.setpoint(10, 20);
		c.getColor();

	}

}
