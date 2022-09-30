package ch07_2;

public class Examgame01 {
	
	class Unit{
		
		private String weapon;
		private String shoot;
				
		public Unit() {
			// TODO Auto-generated constructor stub
			weapon="";
			shoot="";						
		}
		public Unit(String weapon,String shoot) {
			this.weapon=weapon;
			this.shoot=shoot;
		}
		public void unit() {
			System.out.printf("%을/를 %s",weapon,shoot);
		}
	}
	
	class Airplane extends Unit{
		public Airplane() {
			// TODO Auto-generated constructor stub
		}
	}
	
	class Submarine extends Unit{
		public Submarine() {
			// TODO Auto-generated constructor stub
		}
	}
	
	class Soldier extends Unit{
		public Soldier() {
			// TODO Auto-generated constructor stub
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
