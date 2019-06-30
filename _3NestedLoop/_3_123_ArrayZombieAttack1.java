package _3NestedLoop;

import java.util.Arrays;
import java.util.Scanner;

public class _3_123_ArrayZombieAttack1 {
	public static void main(String[] args) {
/*
 * An array inhabitants represents cities and their respective populations. 
 * For example, the following arrays shows 8 cities and their respective 
 * populations: [3, 6, 0, 4, 3, 2, 7, 1]
 * Some cities have a population of 0 due to a pandemic zombie disease 
 * that is wiping away the human lives. 
 * After each day, every city will lose half of its population.
 * write a program to loop though each city population and 
 * make it lose half of its population until all cities have no humans left. 
 * Make updates to each element in the array And print the array like below 
 * for each day:
 * Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
 * Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
 * Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
 * Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
 * 
 * ---- EXTINCT ----
 */		
		 Scanner input = new Scanner(System.in);
		 
		 int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};

		 //TODO. Write you code below this line. 
		//Steps:
	    //1. print statement to print: " Day 0 [3, 6, 0, 4, 3, 2, 7, 1]"
		//2. for loop to divide elements of array
		// 3. use do{} while() loop to repeat steps 1&2
		// 4. create int sum var to put int the while loop condition
		 
		 int day =0;
		 int sum =0;
		 
		 do {
			 
			 System.out.println("Day "+day+ Arrays.toString(inhabitants) );  //1.
			 			 
			 for (int idx=0; idx<inhabitants.length; idx++) {
				  inhabitants [idx] /= 2;       //inhabitants [0] = inhabitants [0]/2;
			 }
			 
			 sum = 0;
			 for (int idx=0; idx<inhabitants.length; idx++) {
				 sum += inhabitants [idx]; // example: after first division sum=11
			 }
			 
			 
			 day++;
			 
			 if (sum == 0) {            //if condition, to print array when all zero
				 System.out.println("Day "+day+ Arrays.toString(inhabitants) ); 
			 }
			 
		 }while (sum !=0) ;   // stop when sum == 0;
		 
	}

}
