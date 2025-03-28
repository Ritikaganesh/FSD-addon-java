package session7;

public class throwex {
	public static int divideNumber(int m, int n)throws
	ArithmeticException, ArrayIndexOutOfBoundsException{
		
		int div = m/n;
		
		String[]name = {"java","Python","node"};
		
		System.out.println(name[2]);
		
		return div;
	}
	
	public static void main(String[] args) {
		//throwex te = new throwex();
	try {
		System.out.println(divideNumber(45,9));
	}catch(ArithmeticException e){
		System.out.println("\n Number cannot be divided by 0");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index is out of bounds");
	}
	}
}
