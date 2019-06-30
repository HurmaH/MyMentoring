package _2WhileLoops;

import java.util.Scanner;

public class _2_Timer {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Write a program that asks user to enter Break time as a number of minutes
           Program should count minutes and seconds remaining until it becomes 0:0
           Print each second count
           Print at the end "Welcome Back , Break is over!";

		 */
		
		Scanner scan = new Scanner (System.in);
		//1. Ask from user to input
		
		System.out.println("Please enter Break time in minutes:");
		int minutes;
		//10
//		9:59
//		9:58
//		..
//		0:0
		
		do {
			System.out.println("Minute should be positive integer:");
		    minutes = scan.nextInt();
		}while (minutes<=0);
		
		
		while (minutes >0) {
			minutes--;
			
			int seconds = 60;
			
			while(seconds>0) {
				seconds--;
				System.out.println(minutes + " : "+ seconds );
				Thread.sleep(1000); //delay the program by 1 second
			}
			
			
		}
		
		System.out.println("Welcome Back , Break is over!");
	}
	

}
