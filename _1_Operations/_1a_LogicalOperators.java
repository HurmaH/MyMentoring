package _1_Operations;


public class _1a_LogicalOperators {
	public static void main(String[] args) {
		
	//Logical/Boolean Operators AND (&, &&), OR(|, ||), NOT(!), XOR(^)
		System.out.println("1. Logical AND Operator & , &&");
	// Logical AND Operator & , &&
    // F & F --> F
    // T & F --> F
    // F & T --> F
    // T & T --> T
	
	boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;
	  // True &&  False
	b1= (5>4) && (11<10); // -->False
	
	System.out.println(b1);
	
	String meal = "sushi";
	double price = 00.00;
	            //            False     AND True
	boolean eat = meal.equals("palov") && (price<20.0);//True
	
	System.out.println("Should we eat? "+eat);
	
	 System.out.println("-------------------------");
     System.out.println("2. Logical OR Operator | , ||");
	// Logical OR Operator | , || (short circuit)
    // F | F --> F
    // T | F --> T
    // F | T --> T
    // T | T --> T
	     //False OR True
	b2 = (5>10) || (10>5) ;
    System.out.println(b2);//True
    
    String brand = "Nike"; // Adidas
                            //True       OR  False
    b3 = brand.equalsIgnoreCase("nike") || brand.equalsIgnoreCase("adidas");//True
    System.out.println(b3);
         //         False   OR    False
    b4 = brand.equals("puma") || brand.equals("lacoste"); // False
    System.out.println(b4);
    
    b4 = true || true ; //  b4= true | true;
    
    System.out.println("-------------------------");
    System.out.println("3. Logical NOT Operator !");
    // Logical NOT Operator !
    // !T ---> F
    // !F ---> T
      //Not (False)
    b5 = !(45>63);// True
    System.out.println(b5);
    
    double price2 = 50.00;
      //Not ( False)
    b6 = !(price2 == 40.0); //= ---> assigning value
      					   // == --> checking value
    System.out.println(b6);
    
    // Logical XOR Operator ^
    
    // F ^ F ---> F
    // T ^ T ---> F
    // T ^ F ---> T
    // F ^ T ---> T
    
    System.out.println("F ^ F --->" + (false ^ false ));
    System.out.println("T ^ T --->" + (true ^ true ));
    System.out.println("T ^ F --->" + (true ^ false ));
    System.out.println("F ^ T --->" + (false ^ true ));
    
	
	
	
	}

}
