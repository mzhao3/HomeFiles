/*
  Maggie Zhao
  APCS1 pd02
  HW16 -- Get It While You Can
  2017-10-14
*/
public class Driver
{
    
    public static void main( String[] args )
    {
	heads(2);
	matches(13);
	overNineThousand();
    }
    // 1a coin pair flips and prints summary information until x heads have come up on either coin
    public static void heads (int x) {
	// The coin is flipped and the number of heads is recorded until one of the coin's headCtr exceeds the x value, which prompts the while loop to stop.
	Coin harry = new Coin();
	Coin potter = new Coin();
	while (harry.headsCtr <= x && potter.headsCtr <= x) {
	    System.out.println("Flip #" + harry.flipCtr + ":");
	    harry.flip();
	    potter.flip();
	    System.out.println("Coin 'harry' has landed on " + harry.upFace + ".");
	    System.out.println("Coin 'harry' has landed on heads " + harry.headsCtr + " times.");
	    System.out.println("Coin 'potter' has landed on " + potter.upFace + ".");
	    System.out.println("Coin 'potter' has landed on heads " + potter.headsCtr + " times.");
	    System.out.println("\n----------------------------------------");
	}
    }
	
    // 1b coin pair flips and prints summary information until y matches have occurred
    public static void matches (int y) {
	// When the two coins are flipped, they are checked if their upFaces are the same. If they are, then the matching statement is displayed, and the matches counter goes up. Otherwise, it returns the no match statements.
	int matches = 0;
	int flipCtr = 1;
	Coin apple = new Coin();
	Coin banana = new Coin();
	while (matches <= y) { 
	    System.out.println("Flip #" + flipCtr + ":");
	    apple.flip();
	    banana.flip();
	    flipCtr += 1;
	    System.out.println("///////////////////////////");
	    if (apple.equals(banana)){
		matches += 1;
		System.out.println("Matchee matchee!");
		System.out.println("Coins 'apple' and 'banana' have matched " + matches+ " times.\n");
		
	    }
	    else {
		System.out.println("Coin 'apple' has landed on "+ apple.upFace+".");
		System.out.println("Coin 'banana' has landed on "+banana.upFace + ".");
		System.out.println( "No match. Firestarter you can not be.\n" ); 
	    }
	}
    }

    
    // 1c coin pair flips until at least 13000 matches have come up. and the number of matches is divisible by the year of your birth
    public static void overNineThousand () {
	// while the number of matches is under 13000, the coins will continue to flip, no matter what. However, when the number of matches is over 13000, then it will check if the number of matches is divisible by my birth year (2001). If it is not, then it will continue to run, (aka if the modulo of matches and 2001 is not 0). When it *is* 0, (when the two numbers are divisible), then the while loop will stop. 
	int matches = 0;
	int flipCtr = 1;
	Coin cookie = new Coin();
	Coin dough = new Coin();
	while (matches <= 13000){
	    System.out.println("Flip #" + cookie.flipCtr + ":");
	    cookie.flip();
	    dough.flip();
	    flipCtr += 1;
	    if (cookie.equals(dough)){
		matches += 1;
		System.out.println("Matchee matchee!");
		System.out.println("Coins 'cookie' and 'dough' have matched " + matches+ " times.\n");
	    }
	    else {
		System.out.println("Coins 'cookie' and 'dough' do not match. Flip again!");
	    }
	}
	while (matches > 13000 && (matches %2001) != 0) {
	    System.out.println("Flip #" + cookie.flipCtr + ":");
	    cookie.flip();
	    dough.flip();
	    if (cookie.equals(dough)){
                matches += 1;
                System.out.println("Matchee matchee!");
                System.out.println("Coins 'cookie' and 'dough' have matched " + matches+ " times.\n");
            }
            else {
                System.out.println("Coins 'cookie' and 'dough' do not match. Flip again!\n");
            }
        }
    }
	    
		 
}//end class
