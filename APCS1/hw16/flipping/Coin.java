/*
Maggie Zhao
APCS1 pd02
HW16-- Get It While You Can
2017-10-14
 */
public class Coin
{
    // instance variables
    private double value;
          // monetary worth
    public String upFace;
          // face showing currently ("heads" or "tails")
    public String name;
          //  “penny”, “nickel”, etc
    public int flipCtr;
          // number of times this coin has been flipped
    public int headsCtr;
          // number of times this coin has landed heads-up
    public int tailsCtr;
          // number of times this coin has landed tails-up
    public double bias;
          // likelihood of landing heads-up every time (1.0) or tails-up every time (0.0)

    // CONSTRUCTORS-------------------------------------------------
    public Coin() {
	// default constructor: initializes instance vars to default vals
	// precondition: none
	// postcondition: instance vars have appropriate default vals
	bias = .5;
	setValue(0.05);
	flip();
	headsCtr = 0;
	tailsCtr = 0;
	flipCtr = 0;
    }
    public Coin( String denomination) {
	// 1st overloaded constructor: allows caller to specify the denomination as a String input
	// precondition: params are passed in a specific order
	// instance vars have values specified by params; value also changes to match denomination
	// demonination: names of the coins, i.e. cent, nickel, dime, quarter, half dollar, and dollar
	this();
	setName(denomination);
	assignValue();
    }
    public Coin( String denomination, String face) {
	// 2nd overloaded constructor: allows caller to specify the denomination and face of the coin, as a String input
	// precondition: params are passed in a specific order (input denomination and face)
	// instance vars have values specified by params; the value changes as well to match the denomination of the coin
	this();
	setName(denomination);
	assignValue();
	setUpFace(face);
    }

    //--------------------------------------------------
    // MUTATORS
    public String setName(String newName){
	// sets the inst var 'name' to whatever coin name is inputted
	String oldName = name;
	name = newName;
	return oldName;
    }
    
    public String setUpFace(String face){
	// sets the inst var 'upFace' to whatever side is inputted
	String oldFace = upFace;
	upFace = face;
	return oldFace;
    }
    
    public double setValue(double newValue){
	// sets the inst var 'value' to whatever value is inputted, although the value is changed later with assignValue().
	double oldValue = value;
	value = newValue;
	return oldValue;
    }

    // --------------------------------------------------------
    // METHODS
    // flip method
    public String flip(){
	// simulates a coin flip. returns a a string ("heads" or "tails") with probability of getting heads determined by bias being above a certain threshold
	double flippability = Math.random(); 
	if (flippability > bias) {
	    upFace = "tails";
	    tailsCtr += 1;
	    }
	else {
	    upFace = "heads";
	    headsCtr += 1;
	} //end if statement
	flipCtr += 1;
	return upFace;
	
    }// end flip()

	// overloaded toString() method    
    public String toString(){
	// output will be [the name of the coin]--[face of the coin]
	String reStr = name + " -- " + upFace;
	return reStr;
    } // end toString


    // assignValue method
    public double assignValue()
    {
	// assigns values to given names of coins. all 6 coins are included 
	if (name == "penny"){
	    value = 0.01;
	}
	if (name == "nickel"){
	    value = 0.05;
	}
	if (name == "dime"){
	    value = 0.10;
	}
	if (name == "quarter"){
	    value = 0.25;
	}
	if (name == "half dollar"){
	    value = 0.50;
	}
	if (name == "dollar"){
	    value = 1.00;
	}
	return value;
    }
    
    public boolean equals(Coin secondcoin){
	String compare = secondcoin.upFace;
	return (upFace.equals(compare)); 
	// In this code, 'current' stands for the object being compared, and the face value of this object is put into the variable compare (this is an outside object!) In the if statement, the face of the object running equals() is compared to the 'compare' variable, or the face of the other object (the second coin).
    }// end equals()
}// end class Coin
