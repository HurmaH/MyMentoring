package _1_Operations;

import java.util.Scanner;

public class _1_BreakCounter {
	public static void main(String[] args) throws InterruptedException  {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter Break time in minutes:");
		int min = scan.nextInt();
		
		while (min>0) {
			
			min--;
			int sec = 60;
			while (sec>0) {

				System.out.println(min + " : "+ --sec );
				Thread.sleep(1000); //1000 mili sec=1sec
			//	TimeUnit.SECONDS.sleep(1); 
			}
			
		}
		
		System.out.println("*****************************");
		System.out.println("Welcome Back , Break is over!");
		System.out.println("*****************************");
	}

}
