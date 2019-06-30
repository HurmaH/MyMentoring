package _4_ArraysVsArrayList_OCApractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListIs {// becareful with naming
	//definition: Resizable-array implementation of the List interface
public static void main(String[] args) {
	 
//1. ArrayList has resizable length/size
	ArrayList <String> arr = new ArrayList <>();

//2. ArrayList is part of Collection framework implements List interface
	//has set of methods to access and edit each elements
	
    arr.add("Hi"); //index =0
    arr.add("all");//indx =1
    System.out.println(arr.get(0));

//3. ArrayList only supports object entries
    //but not primitive data type
    ArrayList <Integer> listWrapper = new ArrayList <>();
    ArrayList <Object> listObject = new ArrayList <>();
    
    //ArrayList <int> listPrimitive = new ArrayList <>();
 
 //4. Length if the arrayList is provided by the size() method
    //.length() - method for String
  	//.length - variable for Array
    //.size() - method for ArrayList
    
    int arrLength = arr.size();
    System.out.println(arrLength); //System.out.println(arr.size());
    
 //5.  ArrayList is always single dimensional
    
 //6. ArrayList can be printed directly
    System.out.println(arr);
 
 //7. Creating ArrayList
    
    //way1
    ArrayList <String> list1 = new ArrayList <>();
    List <String> list2 = new ArrayList <>();
    
    //way2 -- creating arraylist with all the items from another list
    ArrayList <String> list3 = new ArrayList <> (list1);
    
  //way3, in one shot
    ArrayList <String> list4 = new ArrayList (Arrays.asList("Mensulu", "Tugba", "Tugba", "Sayyara", "Manzire", "Deniz"));
    List <String> nameList = Arrays.asList("Mensulu", "Tugba", "Tugba", "Sayyara", "Manzire", "Deniz"); //size fixed
 
  //8. Loop to print each item
    for (int i=0; i<list4.size(); i++) {
    	System.out.println(list4.get(i));//accessing each element
    }
    
    for (String each: list4 ) {
    	System.out.print(each+" ");
    }
    
    System.out.println();
    
  //9. Some important methods
  //.add()
    ArrayList <String> lst = new ArrayList <>();
    lst.add("Spartans");//Spartans @ index=0
    lst.add(0, "Hi");   //Spartans became idx=1
    lst.add(1, "Cyber");//Spartans became id=2
    System.out.println(lst);
    
    // remove(ItemValue) --> removing items from arrayList
    // remove(index)     -->
    lst.remove(1); //remove index 1
    System.out.println(lst);
    lst.remove("Hi"); //remove value "Hi"
    System.out.println(lst);
    
    //set() -- Updating value
    lst.set(0, "Students");
    System.out.println(lst);
    
    //.indexOf ()
    System.out.println(lst.indexOf("Students")); //0
    
  //.contains()
    System.out.println(lst.contains("Bye")); //false
    
 // .clear () - delete all elements
    lst.clear();
    System.out.println(lst);
    
  //isEmpty () 
    System.out.println(lst.isEmpty()); //true
    
    //removeAll()
    ArrayList <String> list5 = new ArrayList (Arrays.asList("Mensulu", "Tugba", "Tugba", "Sayyara", "Manzire", "Deniz"));
    System.out.println(list5);
    
    list5.removeAll(list5);//list5.clear()
    System.out.println(list5);
    
}
}
