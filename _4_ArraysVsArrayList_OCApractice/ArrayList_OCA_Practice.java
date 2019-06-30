package _4_ArraysVsArrayList_OCApractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_OCA_Practice {
	public static void main(String[] args) {
		//Q1: what is the result?
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.print(points);

//		a) A NullPointerException is thrown at runtime
//		b)[1,2,4,]
//		c)[1,2,4 null]
//		d)[1,3,4]
//		e)[1,3,4]
//		f)Compilations fails

//		ANSWER: B

        //Q2: What is the result?
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names);

//		A. [Robb,Rick,Bran]
//		B. [Robb,Rick]
//		C. [Robb,Bran,Rick,Bran]
//		D. An exception is thrown at runtime.

//		Answer A



	}

}
