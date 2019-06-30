package _1_Operations;

import java.util.Scanner;

public class _1_LeapYear {

	public static void main(String[] args) {		
		//Write the program that lets the user enter a year
        //and checks whether it is a leap year or not.
		
		//A year is a leap year if it is (divisible by 4) but (NOT by 100),
        //or if it is divisible by 400.
		
		//1.  Create a Scanner
		// 2. Check if the year is a leap year
		// 3. Display the result
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a year:");
		int year = scan.nextInt();
		
		
		//          (divisible by 4) but (NOT by 100)
		boolean b1 = (year % 4==0) && (year%100 !=0);   //if true--> leap year
		
		//          divisible by 400
		boolean b2 = (year%400==0);                     //if true--> leap year
		
		
		
//		if ((b1) || (b2)) {
//			System.out.println("It is a leap year!");
//		}else {
//			System.out.println("Not a leap year!");
//		}
		
		
		
		//"Ternary otion:";

		String result = (b1 || b2) ? ("It is a leap year!") : ("Not a leap year!");
		
		System.out.println(result);
	}

}
