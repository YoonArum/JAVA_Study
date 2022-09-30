package ch07_Drink;

public abstract class Drinks {

	protected String name;
	protected int price;

	public Drinks() {
		name = "";
		price = 0;
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;

	}
	
	
	

	public abstract void drink();

}
