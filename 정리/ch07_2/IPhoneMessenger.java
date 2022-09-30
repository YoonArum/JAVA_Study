package ch07_2;

public class IPhoneMessenger implements Messenger {
	
	public String getMessage() {
		return "iPhone";
	}

	public void setMessage(String msg) {
		System.out.println("설정");
	}

	public void clearMessage() {
		System.out.println("좌우로");
	}
}
