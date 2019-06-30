package _1_Operations;

import java.util.Scanner;

public class _1_CalculatePhoneBill {
	public static void main(String[] args) {
	/*	
    Write a Java program CalculatePhoneBill to calculate the monthly telephone bills 
	as per the following rule: 
	1. Ask user to enter number of calls.
	   Minimum $200 for up to 100 calls. 
	   Plus $0.60 per call for next 50 calls. 
	   Plus $0.50 per call for next 50 calls. 
	   Plus $0.40 per call for any call beyond 200 calls.

		Examples:
		 Enter number of calls:
		 88
		 Your bill is $200.0

		 Enter number of calls:
		 120
		 Your bill is $212.0

		 Enter number of calls:
		 185
		 Your bills is $247.5
	*/
	
		Scanner scan = new Scanner (System.in);
		int callNums;
		double bill=0;
		System.out.println("Enter number of calls:");
		callNums = scan.nextInt(); //1, 2...100, 150, 180,
		
		if (callNums<=100) {
			
			bill =200;
			
		}else if (callNums<=150) {// calls =120
			//calls:100+ (20)    
			bill = 200+ (callNums-100)*0.60;
			
		}else if (callNums<=200) { //calls=180
		    //calls:100 +50    + (30)
		    bill = 200+ 50*0.60+(callNums-150)*0.50;
		
		}else if (callNums>200) {//calls = 270
		    //calls:100+ 50      + 50      +  70
			bill = 200 + 50*0.60 + 50*0.50 + (callNums-200)*0.40;
		}
		
		System.out.println("Your bills is "+bill);
		
	}

}
