package session5;

public class accessbirdaction extends bird implements flyable {

	@Override
	public void fly() {
		System.out.println("Bird fly...");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		accessbirdaction aba = new accessbirdaction();
		aba.eat();
		aba.fly();
	}
	

}
