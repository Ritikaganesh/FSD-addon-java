package session5;

public class accessperson {
	public static void main(String[] args) {
		//ORIginal Person object
		person originalperson = new person ("Ritika",19);
		
		//Copied person Object
		person copiedperson = new person(originalperson);//object dependency
		
		System.out.println("Original Person: ");
		originalperson.displayInfo();
		
		System.out.println("Copied Person: ");
		copiedperson.displayInfo();
	}

}
