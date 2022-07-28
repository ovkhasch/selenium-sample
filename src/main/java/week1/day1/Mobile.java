package week1.day1;

public class Mobile {
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendMsg();
		obj.saveContact();
		obj.makeCall();
		
		
	}

	public void sendMsg() {
		System.out.println("I will not available for todays session");
		
	}
		
	void makeCall() {
		System.out.println("Please call testleaf");
		
		
	}
	
	private void saveContact() {
		System.out.println("Please save Testleaf contact");
		
	}
}
