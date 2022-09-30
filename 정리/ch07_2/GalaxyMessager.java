package ch07_2;

public class GalaxyMessager implements Messenger{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		
	}
	
	public void clearMessage() {
		System.out.println("좌우로");
	}
	
}
