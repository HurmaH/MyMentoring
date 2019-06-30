package _2WhileLoops;

import java.util.Scanner;

public class _2_DoWhileLoopExamples {
	public static void main(String[] args) {
		/* The do-while Loop
		 * is the same as a while loop except that it executes the loop body
		 * first and then checks the loop continuation condition
		 * 
		 *  do { 
                //Loop body;
                Statement(s);
             } while (loop-continuation-condition); 
		 */
		
		//Ex1: Ask user to enter any a word
		// using do-while loop reverse the word
		// check if it is palindrome or not
		
		Scanner scan = new Scanner (System.in);
		String word;
		String reversed="";
		
		System.out.println("Please enter a word:");
        word= scan.next(); 
        int len =word.length();
		//example : myensulu
        //length  : 12345678
        //index   : 012345678
        do {
			len--; //8-->7
        	reversed += word.substring(len, len+1)+"";//reversed=reversed+;
			
		} while(len>0);
		
        System.out.println("Entered word: "+word);
        System.out.println("Reversed word: "+reversed);
        
        
        if (word.equals(reversed)) {
        	System.out.println("Great, You got palindrome word: "+word);
        }else {
        	System.out.println("Your word is not palindrome");
        }
		
	}

}
