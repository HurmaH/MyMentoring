package _5_Methods;

public class CountWords {
	/*
	 * Create a void method named countWords.
       Accepts a string as an argument: Exemple: " Today is a good day";
       Create a logic to have the expected output.
         
       print out should be: "The number of words in sentences is: "+number of words 

	 */
	public static void main(String[] args) {
		
		String str = "Today is a good day";
		countWords (str);
		
	}
	
	public static void countWords (String s) {
		//s="Today is a good day"
		//s.length() will give only letter nmbers not words
		//arr.length will give count of of elements inside array
		
		String [] strArr = s.split(" ");//Today, is,a, good, day
		
		int wordNumber = strArr.length;
		
		System.out.println("The number of words in sentences is: "+wordNumber);
	}
	
	

}
