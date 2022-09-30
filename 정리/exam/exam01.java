package exam;



public class exam01 {
	private int max;
	private int min;
	private int rem;
	private int num1;
	private int num2;

	public exam01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void setNumber(int x, int y) {

		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		rem = max % min;
	}

	public void print() {
		while (rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
		}
		if (min == 1) {
			System.out.println("최대공약수 : 서로소");
		} else {
			System.out.println("최대공약수 : " + min);
		}
		System.out.println("최소공배수 : " + (num1 * num2) / min);

	}
}
