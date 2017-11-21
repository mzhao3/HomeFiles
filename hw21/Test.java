public class Test {
    
    public static String helloName(String name) {
	//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        return ("Hello " + name + "!");
    }

    
    public static String makeAbba(String a, String b) {
	// Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	return(a+b+b+a);
    }

    
    public static String doubleChar(String str) {
	// Given a string, return a string where for every char in the original, there are two chars.
	String rst = "";
	for (int x = 0; x + 2 < str.length(); x++) {
	    rst += str.substring(x , x + 1) + str.substring( x ,x + 1);
	}
	return rst;
    }
    public static int countHi(String str) {
	//Return the number of times that the string "hi" appears anywhere in the given string.
	int counter = 0;
	for (int x = 0; x  <= str.length() - 2 ; x += 1) {
	    if (str.substring(x, x + 2).equals( "hi")){
		counter += 1;	
	    }
	}
	return counter;
    }
    public static boolean catDog(String str) {
	int catcounter = 0;
        for (int x = 0; x  <= str.length() - 3 ; x += 1) {
            if (str.substring(x, x + 3).equals( "cat")){
                catcounter += 1;
            }
        }
        int dogcounter = 0;
        for (int x = 0; x  <= str.length() - 3 ; x += 1) {
            if (str.substring(x, x + 3).equals( "dog")){
                dogcounter += 1;
            }
        }
        return dogcounter == catcounter;
    }
	
    public static int countCode(String str) {
	//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	int counter = 0;
        for (int x = 0; x  <= str.length() - 4 ; x += 1) {
	    String copart = str.substring(x, x + 2);
	    String epart = str.substring(x + 3, x + 4); 
            if (copart.equals( "co") && epart.equals("e")){
		counter += 1;
            }
        }
        return counter;
    }

    public static boolean endOther(String a, String b) {
	//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
	int alength = a.length();
	int blength = b.length();

	if (alength > blength) {
	    b = b.toLowerCase();
	    a = a.substring( alength- blength);
	    a = a.toLowerCase();
	}
	else {
	    a = a.toLowerCase();
	    b = b.substring( blength- alength);
	    b = b.toLowerCase();
	}
	return a.equals(b);
    }

    public static boolean xyzThere(String str) {
	// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
	int counter = 0;
	boolean returning = false;
        for (int x = 0; x  <= str.length() - 3 ; x += 1) {
            if (str.substring(x, x + 3).equals( "xyz")){
                if (x == 0) {
		    returning = true;
		}
		else {
		    returning = (!str.substring (x -1, x).equals("."));
	    	
		}
	    }
	}
	return returning;
    }
    public static void main(String [] args){
	/*
	String foo = "bar";
	foo.substring(0,4);
	foo.substring(1,7);
	foo.substring(1,1);
	foo.substring(7);

	System.out.println();
	
	System.out.println(helloName("Bob")); //Hello Bob!
	System.out.println(helloName("Alice")); // Hello Alice!
	System.out.println(helloName("X")); //Hello X!
	
	System.out.println(makeAbba("Hi", "Bye")); //HiByeByeHi
	System.out.println(makeAbba("Yo", "Alice")); //YoAliceAliceYo
	System.out.println(makeAbba("What", "Up")); //WhatUpUpWhat
        
	System.out.println(doubleChar("The") ); //Tthhee
	System.out.println(doubleChar("AAbb") ); //AAAAbbbb
	System.out.println(doubleChar("Hi-There") ); //HHii--TThheerree
	
	System.out.println(countHi("abc hi ho") ); //1
	System.out.println(countHi("ABChi hi")); // 2
	System.out.println(countHi("hihi")); //2
	
	System.out.println(catDog("catdog")); //true
	System.out.println(catDog("catcat")); //false
	System.out.println(catDog("1cat1cadodog")); //true
	
	System.out.println(countCode("aaacodebbb")); //1
	System.out.println(countCode("codexxcode")); //2
	System.out.println(countCode("cozexxcope")); //2

	System.out.println(endOther("Hiabc", "abc")); //true
	System.out.println(endOther("AbC", "HiaBc")); //true
	System.out.println(endOther("abc", "abXabc")); //true
	*/	
	
	System.out.println(xyzThere("abcxyz") ); //true
   	System.out.println(xyzThere("abc.xyz")); //false
	System.out.println(xyzThere("xyz.abc")); //true
	

    }
}
