package SundayAssessment;

import java.util.Scanner;

public class Repl7_3 {
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    
	    int amt = inp.nextInt();
	    
	    inp.nextLine(); //this line is necessary
	    
	    System.out.print("word:");
	    
	    String word = inp.nextLine();
	    //leave the above unedited, write your code below:
	    
	    String str ="";
	    int len =word.length();
	    if (amt ==1) {
	    	str= amt+" "+word;
	    }else {
	    	if (word.endsWith("fe")) {
	    		str = amt+" "+word.substring(0,len-2)+"ves";
   		
	    	}else if (word.endsWith("sh") ||
	    			  word.endsWith("ch")) {
	    		str = amt+" "+word+"es";
	    	
	    	}else if (word.endsWith("us")) {
	    		str=amt+" "+word.substring(0, len-2)+"i";
	    		
	    	}else if (word.endsWith("ay") ||
	    			  word.endsWith("oy") ||
	    			  word.endsWith("ey") ||
	    	    	  word.endsWith("uy")) {
	    		str = amt+" "+word+"s";
	    		
	    	}else if (word.endsWith("y")) {
    		str = amt+" "+word.substring(0,len-1)+"ies";
    		
	    	}else {
	    		str = amt+" "+word+"s";
	    	}
	    }
	    
	    System.out.println(str);
	    
	  }
	

}
