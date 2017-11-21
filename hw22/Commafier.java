/*
  Maggie Zhao
  APCS1 pd02
  HW21 -- Karmacomma,
  2017-10-23 M
*/


public class Commafier {
    public static void main (String [] args) {
	//System.out.println(">> Recursive Version <<");
	//System.out.println(commafyR(1));
	//System.out.println(commafyR(10));
	//System.out.println(commafyR(101));
	//System.out.println(commafyR(1000));
	//System.out.println(commafyR(12345));
	//System.out.println(commafyR(123456789));
	//System.out.println(commafyR(1000000000));

	//System.out.println(">> Iterative Version <<");
	//System.out.println(commafyF(1));
        //System.out.println(commafyF(10));
	//System.out.println(commafyF(101));
	//System.out.println(commafyF(1000));
	//System.out.println(commafyF(12345));
	//System.out.println(commafyF(123456789));
	//System.out.println(commafyF(1000000000));
	for (String s : args) {
	   int temp =  Integer.parseInt(s);
	   System.out.println(commafyR(temp));
	   System.out.println(commafyF(temp));
	}
    }
    public static String commafyF (int input) {
	String result = "";
	String worded = Integer.toString(input);	
	for ( ; worded.length() > 3; ) {
	    // condition: if the number has more than 3 digits...
	    result = "," + worded.substring(worded.length() -3) + result; // separate the last 3 digits, put it onto the "result" string, and stick a comma in front of it
	    worded = worded.substring(0, worded.length()-3); // take off the last 3 digits from the original
	    // continue to add more digits, 3 at a time, to "result", until "worded" has 3 digits or less
	}
	result = worded + result; // take the numbers preceding the firstmost comma (or if there aren't any commas) and add them to the rest of the commafied code
	return result;
    }
    
    public static String commafyR (int x) {
	String result = "";
	String word = Integer.toString(x);
	if (word.length() < 4) {
	    result = word; //if the number isn't long enough, don't even bother
	}
	else {
	    String other = word.substring(0, word.length() - 3); // the beginning of the chain of numbers
	    String ender = word.substring(word.length()-3); // the 3 digits that go after the comma
	    result =  commafyR(Integer.parseInt(other)) + "," + ender + result; // commafy the integer version of the "beginning" digits, the numbers you have not yet commafied
	}
	return result;
	}	
}
