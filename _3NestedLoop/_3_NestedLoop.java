package _3NestedLoop;

import java.util.Arrays;

public class _3_NestedLoop {
	/* Syntax of For Loop:
	 * 
	 * for (initial-action; loop-continuation-condition; action-after-each-iteration) {
       // Loop body;
       Statement(s);
       }
     */
	//Repl 120 ;
	/*
	 * Given a String variable sentence, write code to type each word in separate lines
	 *  in a reverse order.
Example:
sentence -> "Java is fun with Zombie Attack"
Print
Attack
Zombie
with
fun
is
Java
 */
public static void main(String[] args) {
	
	String str = "Java is fun with Zombie Attack";
	        //idx 0 ........................   str.length-1
	        //length1 2 3...                   str.length
	//reverse all letters
	
	for (int i= str.length()-1; i>=0; i--) { //kcattA eibmoZ htiw nuf si avaJ
		System.out.print(str.charAt(i));
	}
	System.out.println();
	
	//answer of repl 120
	String [] strArr = str.split(" ");
	
	//System.out.println(Arrays.toString(strArr));
	//[Java, is, fun, with, Zombie, Attack]
//idx   0     1   2    3     4      5
//length:1    2   3    4     5      6
	//strArr[5] = "Attack"
	for (int i=strArr.length-1; i>=0; i--) {   //looping inside the array strArr
		System.out.println(strArr[i]);
	}
	
	
}
	

}
