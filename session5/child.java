package session5;

public class child extends parent{
	
	//override parent method 
	//public void assets() {
	//	System.out.println("Parents assets and propreties with child assets.");
	//}
	
	public void vehicle() {
		System.out.println("car");
	}
public static void main(String[] args) {
	child cd = new child();
	cd.assets();
	cd.vehicle();
}
}
