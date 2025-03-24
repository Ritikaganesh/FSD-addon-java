package session3;

public class constructorexample {
	
	public constructorexample() {
		System.out.println("Default Constructor");
	}
	
	public constructorexample(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized constructor");
	}
		

	public int sum(int a,int b) {
		int res = a + b;
		return res;
	}
	public static void main(String[] args) {
		constructorexample ce = new constructorexample();
		constructorexample cx = new constructorexample("Ritika", "19");
		System.out.println(ce.sum(5, 10));
	}

}
