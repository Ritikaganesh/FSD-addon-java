package session6;



public class exception {

	

	String str1 = "123"; //instance 

	

	public void name() {

		try {

			int i = Integer.parseInt(str1);
			System.out.println("The value of converted string: "+str1);

		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		}

	public static void main(String[] args) {
		exception ee = new exception();
			ee.name();
		

	}

	}