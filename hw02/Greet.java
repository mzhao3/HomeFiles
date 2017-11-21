/*
 Maggie Zhao
APCS1 pd2
HW03 -- Howdy, <VeryInterestingPerson>! 
2017-09-17
*/

import java.util.Random; 
public class Greet {
    
    public static void main (String [] args ) {
	new Greet().greet() ;
    }
    
    static void greet () {
	Random rand = new Random();
	int n = rand.nextInt (3);
	String greetname;
	if (n == 0) {
	    greetname = "Moo";   
	} else if (n == 1) {
	    greetname = "Foo";
	} else {
	    greetname = "Boo";
	}
	System.out.println("Why, hello there, " + greetname +  ". How do you do?");
    }
    
}
