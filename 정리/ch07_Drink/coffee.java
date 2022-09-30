package ch07_Drink;


class Coffee extends Drinks {

	public Coffee(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
		System.out.print("[COFFEE]");
		System.out.println();
	}

}