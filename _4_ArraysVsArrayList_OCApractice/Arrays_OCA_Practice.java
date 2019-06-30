package _4_ArraysVsArrayList_OCApractice;

import java.util.Arrays;

public class Arrays_OCA_Practice {
	public static void main(String[] args) {
		//Q1: Which code fragments, when inserted at line 9
		//enables the code to print 10:20?
		
		/* insert code here */
		//int[] array  = new int[2];
		int[] array;
        array = new int[2];
        
		array[0] = 10;
        array[1] = 20;
        System.out.println(array[0]+ ":" + array[1]);
		
        /* A) int[] array  = new int[2];
           
           B) int[] array;
           array = new int[2];
           
           C) int array = new int[2]; //missing []
           D) int array[2];            //int array []= new int [2]
      */
        
        //A,B
        
        //Q2: Which two code fragments, independently, print each element in this array?
        int [] intArr = {8,16,32,64,128};
        //enhanced loop, for each loop same 
        for(int i : intArr){              //possible
            System.out.println(i+" ");
        }
		
        /*
         * A) for (int i : intArr){            //wrong
                  System.out.println(intArr);  //(i)
               }

           B) for(int i : intArr){              //possible
                  System.out.println(i+" ");
              }

         C) for(int i = 0 : intArr){            //wrong
                System.out.println(intArr[i]+" ");
                i++;
             }
             
         D) for(int i = 0; i < intArr.lenght;i++){    //wrong
                System.out.println(i+" ");           //intArr[i]
             }

        E) for(int i=0; i< intArr.lenght;i++){        //correct
               System.out.println(intArr[i]+" ");
           }

        F) for(int i; i< intArr.lenght;i++){         //wrong
               System.out.println(intArr[i]+" ");
           }
         */
        //B,E
		
		
      //Q3: which option represents the state of the num array
        //    after succesfully completion of the outer loop?
        int num [][] = new int [1][3];
        for( int i = 0; i < num.length; i++){       //raws
            for(int j = 0; j < num[i].length; j++){ //columns
                num[i][j] = 10;
            }
        }

	/*a) num[0][0]=10
         num[0][1]=10
         num[0][2]=10

        b)num[0][0]=10
          num[1][0]=10
          num[2][0]=10

        c)num[0][0]=10
          num[0][1]=0
          num[0][2]=0

       d)num[0][0]=10
         num[0][1]=10
         num[0][2]=10
         num[0][3]=10
         num[1][0]=0
         num[1][1]=0
         num[1][2]=0
         num[1][3]=0
	 */
        //A
        
      //Q4: Which line of code, when inserted in place of //insert code,
        //adds an X into the grid so that the grid contains three consecutive X’s?

//    The following grid shows the state of a 2D array:

//	  [O,  O,  ]
//	  [ ,  X, O]
//	  [ ,  X, X]

        //This grid is created with the following code:
        char [][] grid = new char [3][3];
        grid [0][0] = 'O';
        grid [0][1] = 'O';
        grid [1][1] = 'X';
        grid [1][2] = 'O';
        grid [2][1] = 'X';
        grid [2][2] = 'X';
        //insert code

//	  A. grid[1][3] = ‘X’;
//	  B. grid[3][1] = ‘X’;
//	  C. grid[0][2] = ‘X’;
//	  D. grid[2][0] = ‘X’;
//	  E. grid[1][2] = ‘X’;

//	  Answer: C

        //Q5:What is the result?

        int[] arr = {1, 2, 3, 4};
        int j = 0;
        do {
            System.out.print(arr[j] + " ");
            j++;
        } while (j < arr.length - 1);

//	  A. 1 2 3 4
//	     followed by an ArrayIndexOutOfBoundsException
//	  B. 1 2 3
//	  C. 1 2 3 4
//	  D. Compilation fails.

//	  Answer: B

		

	  
	  
	}//end of main method
 

}//end of class


