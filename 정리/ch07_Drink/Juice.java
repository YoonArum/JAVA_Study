package ch07_Drink;

class Juice extends Drinks {
	public Juice(String name, int price) {
		super(name, price);
	}
	
	public void Drinks() {
		
				name = "";
				price = 0;
	}

	public void drink() {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
		System.out.print("[JUICE]");		
		System.out.println();
	}

}
