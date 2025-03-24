package session3;

import java.util.Scanner;

public class stringmethod {
	
	public static void main(String[] args) {
		//String s1 = "Java program";
		//1.length
		//System.out.println(s1.length());
		
		
		//2.equals()
		//3.equalsIgnorecase
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if(username.equals("admin") && password.equalsIgnoreCase("admin@123")) {
			System.out.println("success");
		}else {
			System.out.println("Error 404 found ");
		}
		
		//==
		  String s4 = "Mugilan";
		  String s5 = "Mugilan";
		  
		  system.out.println(s4==s5);
		 
		String name = new String("Ritika");
		String name1 = new String("Ritika");
		System.out.println(name==name1);
		  
		//compare to
		//s1>s2-->positive number
		//s1<s2==>negative number
		//s1==s2-->0
		
		String s6 = "hellos";
		String s7 = "heuits";
		
		System.out.println(s6.compareTo(s7));*/
		
		
		/*//concat()
		String str1 = "Static";
		String str2 = new String("Program");
		System.out.println(str1.concat(str2));*/
		
		//tocharArray()
		String str3 = "Welcome to java";
		System.out.println("Value of method: ");
		char[] ch = str3.toCharArray();
		for(char st: ch) {
			System.out.println(st);
		}
		
		
		//System.out.println(str3.toCharArray());
		
		/*//substring()
		System.out.println(str3.substring(7));
		System.out.println(str3.substring(0, 8));
		
	   //intern
		String clg = "kgisl";
		String clg1 = new String("kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);*/
	}

}
