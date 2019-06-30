package _2WhileLoops;

public class _2_WhileLoopExamples {
	public static void main(String[] args) {
	/* A while loop executes statements repeatedly 
	   while the condition is true.
		
       while (loop-continuation-condition) {
			// Loop body=statements to be repeated
			Statement(s);
		}
	*/
	//EX:1 getting chars from a to z (a, b,c,d,e,...z)
		
		char initial = 'a';
		char last = 'z';
			 //ASCII
		     //b <= z
		     //z <= z
		while(initial <=last) {
		 System.out.print(initial+", ");
		 initial ++;
		}
		
		//Ex 2: print numbers from 1 to 10 in 
		//1) one line, 2)with space between them	
		System.out.println();
		int initialNum=1;
		int lastNum = 10;
		             //1<=10 --true
		while(initialNum<=lastNum) {
			System.out.print(initialNum +" ");
			initialNum++;
		}
		
		//Ex 3: print even numbers from 10 to 1 in 
		//1)one line and 2)put space between numbers 3)even number
		
		System.out.println();
		int initialNum2=10;
		int lastNum2 = 1;
		
		//10-->9-->8--> 7....1
		while(initialNum2 >= lastNum2) {
			
			
			if (initialNum2 %2==0) {   // (initialNum2 %2 !=1) --> even
				System.out.print(initialNum2+" ");
				
			}
			
			initialNum2--;
		}
		
	 //Ex4. Find sum and product of all numbers from 1 t0 10
		System.out.println();
		int initialNum3=1;
		int lastNum3 = 10;
		int sum=0;
		int product=1; //change to 1 to get non zero result
		
		             //1<=10 --true
		while(initialNum3<=lastNum3) {
			sum = sum+initialNum3; // sum = 0+1=1, sum = 1+2
			
			
			product = product*initialNum3; // 0*1*2*3*4
			
			initialNum3++;
		}
		System.out.println(sum+" ");
		System.out.println(product+" ");
	}

}
