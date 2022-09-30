package ch07_game;

public class Unit implements UnitTest {

	private String name;	
	private String weapon;	

	public Unit() {
		// TODO Auto-generated constructor stub
		name = "";		
		weapon = "";
		
	}
	
	@Override
	public void act() {
		System.out.println(name+"가"+weapon);
	}
	
	public void setname(String name,String weapon) {
		this.name=name;
		this.weapon=weapon;
	}
	
	

	

	
	
}
