package _4_ArraysVsArrayList_OCApractice;

import java.util.Arrays;

public class ArraysIs {
	//definition: Single Object that hold multiple value of same type
	
	public static void main(String[] args) {
		
	//1. Arrays has fixed length data structure and defined when they are created
	String [] arr = new String [3];
	
	//2. Array is basic functionality provided by Java,
	//members are accessed by using []
	arr [0] = "hi";
	System.out.println(arr [0]);//hi
	System.out.println(arr [1]);//null - default String
	
	//3. Array can contain primitive data types and objects 
    //of a class depending on the definition of the array.
	int [] arrPrimitive = new int [3];      //allowed
	Boolean [] arrWrapper = new Boolean [5];//allowed
	Object [] arrObject = new Object [2];   //allowed
	
	//4. Length of the Array has the length variable,
    //that returns length of array
	//.length() - method for String
	//.length - variable for Array
	System.out.println(arr.length);
	
	//5. Array can be multi dimensional
	int[][] intArray2 = new int[10][20]; //a 2D array or matrix
	int[][][] intArray3 = new int[10][20][2]; //a 3D array or matrix
	///////
	///////
	intArray2 [0][1] = 5; 
	
	//6. Printing Array by using Arrays.toString() method
	System.out.println(arrPrimitive);//hashcode
	System.out.println(Arrays.toString(arrObject));

//7. Creating Arrays:
	//1
	int  array []= new int [3];
	array [0] = 12;
	array [1] = 26;
	//array[2]= 3;
	System.out.println(Arrays.toString(array));
	
	//2
	String [] strArr;
	strArr= new String [5];
	
	//3.
	int [] array2= new int [] {2,3,4,5,6,7};//Declaring array literal
	
	//4.in one shot
	 int array3 [] = {12, 26, 2019}; //array3.length = 3
	 System.out.println(Arrays.toString(array3));
	 
//8. Loop to print each item:
	 int array4 [] = {12, 26, 2019}; 
	 //for loop
	 for (int i=0; i<array4.length; i++) {
		 System.out.println(array4[i]);
	 }
	 
	 //for each loop == enhanced for loop
	 for (int each : array4 ) {
		 System.out.println(each);
	 }
	 
//9. Some important methods
	 //clone
	 String [] names = {"Mensulu", "Tugba", "Tugba", "Sayyara", "Manzire", "Deniz"};
	 
	 String [] namesClone = names.clone(); //{"Mensulu", "Tugba", "Tugba", "Sayyara", "Manzire", "Deniz"};
	 
	 System.out.println(Arrays.toString(namesClone));
	 System.out.println(names == namesClone);//false
	 
	 String [] names2 = names;
	 System.out.println(names2 == names);//true
	 
	 //split
	 String str= "Goodmorning Hardworking Spartans";
	 
	 String [] strArr2 = str.split(" ");
	 System.out.println(Arrays.toString(strArr2));
	
	}
}
