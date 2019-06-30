package _5_Methods;

public class MethodReveiw {
	
	public static void main(String[] args) {
		
		//methods called /invoked
		//static methods are called by name directly, no need to create object
		
		
		name4("hi"); //step1
		name4 ();    //step2
		System.out.println("Hello");//step3
		
		
		String str = name5(""); //returning "jennet"//step
		String str2 ="jennet";
		
		System.out.println(str);
		System.out.println(name5(""));
		
	}
	
	
	
//access modofier, specified, return type, name of Method 	
	public         static       void       name () {
		
	}
	
	static void  name2 (String str) {// no access modifier
		
	}
    
	String name3 () { //return type String //no specifier
		String str = "Jennet";
		return str;
	}
	
//	name4(){         //no return type
//		
//	}
	
public static void  name4 () {
		System.out.println("no parameter");
}

//overloaded method name4
public static void  name4 (String str) {
	System.out.println("with parameter "+str);
	//no return key
}


public static String name5 (String str) {
	
	return "jennet";
}


	
	

}
