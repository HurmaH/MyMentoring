package _3NestedLoop;

import java.util.Arrays;

public class _3_reverseEachWord {
	public static void main(String[] args) {
		String str = "The Life is Beautiful";
		
		//Task1: print words of sentences in reverse order
		//print: Beautiful 
//				 is
//				 Life 
//				 The
		
		String [] strArr= str.split(" ");
		System.out.println(Arrays.toString(strArr)); //[The, Life, is, Beautiful]
		
		for (int i=strArr.length-1; i>=0; i-- ) {
			System.out.println(strArr[i]);   //println for printing in seperate line
			
		}
		
		for (int i=strArr.length-1; i>=0; i-- ) {
			System.out.print(strArr[i]+" ");   //print for printing in one line
			
		}
		System.out.println();
		
		//Task 2
		//[The, Life, is, Beautiful]
		// ehT efiL si
		//   i=0 strArr[i]=strArr[0]="The"
		
		for (int i=0; i<strArr.length; i++ ) {//loop through each element of the Array
			String reversedWord = "";
		    String eachWord=strArr[i];
			
		    for(int j=eachWord.length()-1; j>=0; j-- )  {                    //loop through each chars of the words
				
				reversedWord+=eachWord.charAt(j);   //reversed=reversed+eachWord.charAt(j);
			}
			System.out.print(reversedWord+" ");
			
		
		}
		
		//Task 3 String str = "The Life is Beautiful";
		//print :              lufituaeB si efiL ehT
		//long version		
		
         System.out.println();
         
         for (int i=strArr.length-1; i>=0; i-- ) {//loop through each element of the Array
 			String reversedWord = "";
 			
 		    for(int j=strArr[i].length()-1; j>=0; j-- )  {                    //loop through each chars of the words
 				
 				reversedWord+=strArr[i].charAt(j);   //reversed=reversed+eachWord.charAt(j);
 			}
 			System.out.print(reversedWord+" ");
 		}
         System.out.println();
         
         
         
       //Task 3 String str = "The Life is Beautiful";
       //short version
		
         
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
		
//		
//		String [] arr = str.split(" ");
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i=0; i<arr.length; i++) { //loop through each element of array
//			String reversedElement ="";//it is here so that each time it will start with empty string
//			//System.out.println(arr[i]);
//			for (int j=arr[i].length()-1; j>=0; j--) { //loop inside each element
//				reversedElement += arr[i].charAt(j)+"";
//			}
//			
//			arr[i]=reversedElement;
//		}
//		
//		System.out.println(Arrays.toString(arr));

	
	}

}
