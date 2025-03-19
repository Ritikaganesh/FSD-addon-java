package session3;

import java.util.Scanner;

public class Nestedforloop {

	public static void main(String[] args) {
		
		//square printing
		// for(int i = 1 ; i<=4; i++) {  //i =1
			// for(int j =1 ; j<=4; j++) { //j=1 to 4 //4 times iteration happens
				// System.out.print(i);
				 //System.out.print(" "+j);
			 //}
			 //System.out.println();
		 //}
		
		
		//Triangle printing
		//for(int i = 1; i<=5; i++){
			//for(int j =1; j<i+1; j++) {
				//System.out.print(j+" ");
			//}
			//System.out.println();
		
		//}
		
		
		//pattern
		
		/*int num = 6;
		
		for(int i = 0; i<=num; i++) {
			for(int j = 1; j<=num-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		//dimond pattern
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		//top half of diamond
		for(int i = 1; i<=rows; i++) {
			//leading spaces
			for(int j = i; j<rows; j++) {
				
				System.out.print(" ");
				
			}
			//print *
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Bottom half of dimaond
			for(int i = rows-1; i>=1; i--) {
				//leading space
				for(int j = rows; j>i; j--) {
					System.out.print(" ");
				}
				//print
				for(int k = 1; k<=(2*i-1); k++){
					System.out.print("*");
				}
				System.out.println();
			}	
}
		}