package _2WhileLoops;

import java.util.Scanner;

public class _2_Replit_100 {
	public static void main(String[] args) {
		//a==b, b==c,
		// 5 5 5 5--->
		
		Scanner scan = new Scanner(System.in);

        int prize = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        int compare =1;
        int last =20;
        int same=0;
        int maxSame=0;
        
                //1 <= 20
               //2 <= 20
               //20<=20
        
        while (compare<last) {
        	
        	same=0;
        	if (a==compare) {
                same++; //1
            }
        	
        	if (b==compare) {
                same++;
            }
        	
        	if (c==compare) {
                same++;
            }
        	
        	if (d==compare) {
                same++;
            }
            
        	
        	   //ex:1 2 2 2
        	   //1 > 0
        	    //3 > 1
        	if (same> maxSame) {
        		maxSame =same; //maxSame=1, maxSame = 3
        	}
        	
        	compare++;//1-->2
        }
               
                    //(4-1)*10 =30
        prize = (maxSame-1)*10;
        
        System.out.println(prize);
		
	}

}
