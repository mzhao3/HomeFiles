/*
  Maggie Zhao
  APCS1 pd02
  HW20 -- For the -Lulz- Love of Strings. 
  2017-10-19 R
*/


public class Strung{
    public static String fenceF(int posts) {
	String fence = ""; // start with an empty string
	if (posts > 0) {
	    // input should be non negative, but if posts = 0, an empty string is returned
	    for (int x = 0; posts > 1; posts --){
		// initializer :
		// test : is posts greater than 1? (only strings with more than one post have -- attached to the middle
		// update : subtract 1 from posts each time the for loop is run 
		fence += "|--";
		// if posts > 1 returns true, |-- is added to the string
	    }
	    fence += "|"; // base case! if the input is 1, it will pass the if statement but not the for loop, so only | is returned
	}
	return fence;
    }
    public static String reverseF(String s){
	String reversed = ""; // start with an empty string
	int wordiness = s.length(); 
	if (wordiness > 0){
	    // if the length of the string > 0, the for loop is run. Otherwise, an empty string is returned.
	    for (int x = wordiness; x >= 0; x--){
		// initializer : set a new integer, x, to the length of the string
		// test : see if the length of the word is greater than 0
		// update : subtract 1 from x each time the for loop is run

		
		reversed += s.substring(x);
		// if the length of the word is greater than 0, take the last letter of the string and adds it to a new string, reversed
		s = s.substring(0, x);
		// the new s is from the beginning of the string to the penultimate letter
		// when the for loop is run again, it will take the last letter of this shortened string, and then again shorten the string being evaluated
	    }
	}
	return reversed;
    }

    public static String reverseR (String s) {
	String reversed = ""; //start with an empty string
	int x = s.length() - 1;	
	if (x >= 0){
	    // if the length of the word is greater than or equal to 1...
	    reversed += s.substring(x);
	    // take the last letter and attach it to the new string, reversed
	    s= s.substring(0, x);
	    // change s so that the last letter is not included
	    reversed += reverseR(s);
	    // find the reverse of s without the last letter
	    // when done recursively, the original string essentially has its last letter removed and put onto the reversed string. 
	}
	return reversed;
	
    }
    
    
    public static void main (String [] args){
	// FENCES by august wilson
	System.out.println("10 posts:" + fenceF(10)); // |--|--|--|--|--|--|--|--|--|
	System.out.println("-2 posts:" + fenceF(-2)); // [no result]
	System.out.println(" 0 posts:" + fenceF(0)); // [no result]
	System.out.println("32 posts:" + fenceF(32)); //|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|
	System.out.println("1 post:" +fenceF(1)); // |
	System.out.println("-------------------------------\n");

	// FOR LOOP REVERSION
        System.out.println("Now testing loopy reversion.");
	System.out.println("hamburger -> " + reverseF("hamburger")); // regrubmah
	System.out.println("stressed -> " + reverseF("stressed")); //desserts
	System.out.println("desserts -> " + reverseF("desserts")); //stressed
	System.out.println("lived -> " + reverseF("lived")); //devil
	System.out.println("-------------------------------\n");

	// REVERSION WTIH RECURSION
	System.out.println("Now testing recursive reversion.");
	System.out.println("live -> " + reverseR("live")); //evil
	System.out.println("mynoretehs -> " +reverseR("mynoretehs")); //sheteronym 
	System.out.println("pupils -> " +reverseR("pupils")); // slipup
	System.out.println("semordnilap -> " + reverseR("semordnilap")); //palindromes
    }
}	    
