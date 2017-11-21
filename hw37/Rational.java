// Maggie Zhao
// APCS1 pd02
// HW37-- Be More Rational
// 2017-11-20 M
public class Rational{

    // instance variables for the numerator and denominator
    private int numerator;
    private int denominator;

    // default constructor (no parameters)
    // creates a new Rational with the value of 0/1
    public Rational(){
	numerator = 0;
	denominator = 1;
    }

    // overloaded constructor with 2 parameters- one for numerator, one for denominator
    public Rational(int inpNum, int inpDenom) {
	this();
	if (inpDenom != 0){
	    numerator = inpNum;
	    denominator = inpDenom;
	}
	else{
	    System.out.println(inpNum + "/" + inpDenom + " is an invalid Rational number.");
	    System.out.println("The denominator cannot be 0.");
	    System.out.println("Changing Rational number to 0/1.");
	}
	
    }

    public String toString() {
	String s = "";
	s += numerator;
	s += "/";
	s += denominator;
	return s;
    }

    public double floatValue() {
	return (double)((numerator * 1.0) / denominator);
    }

    //takes 1 Rational object as a parameter and multiplies it by this Rational object
    //does not return any value
    //should modify this object and leave the parameter alone
    //need not reduce the fraction
    
    public void multiply(Rational m) {
	int newNum = numerator * m.numerator;
	int newDenom = denominator * m.denominator;
	numerator = newNum;
	denominator = newDenom;
    }

    // works the same as multiply, except the operation is division
    public void divide (Rational m) {
	if (m.numerator != 0){
	    // when you divide by a fraction, it is the same as multiplying by
	    // the reciprocal
	    int newNum = numerator * m.denominator;
	    int newDenom = denominator * m.numerator;
	    numerator = newNum;
	    denominator = newDenom;
	}
	else {
	    System.out.println("Your divisor has a value of 0. Your rational number cannot be divided.");
	}
    }

    public static int gcdER (int a, int b) {
	//From the day Jackie and Victor presented their code for the class
	if (b==0) {
	    return a;
	}
	return gcdER(b, a % b);
    }

    public void add (Rational m) {
	int lcm = lcm( denominator, m.denominator);
	int ratio1 = lcm / denominator;
	int ratio2 = lcm / m.denominator;
	    
	numerator = (this.numerator * ratio1) + (m.numerator * ratio2);
	denominator = lcm;
    }

    public void subtract (Rational m) {
	int lcm = lcm( denominator, m.denominator);
        int ratio1 = lcm / denominator;
        int ratio2 = lcm / m.denominator;

        numerator = (this.numerator * ratio1) - (m.numerator * ratio2);
        denominator = lcm;
    }

    public int gcd(){
	return gcdER(numerator, denominator); 
    }
    public int lcm(int a, int b){
	if (a==b) {
	    return a;
	}
	else
	    return (a*b) / gcdER(a,b);
    }

    public void reduce(){
	int gcd = this.gcd();
	int newNum = numerator/gcd;
	int newDenom = denominator/gcd;
	numerator = newNum;
	denominator = newDenom;
    }

    //Takes a Rational parameter and compares it to the calling object
    public int compareTo(Rational m){
	//Returns 0 if the two numbers are equal
	if (this.floatValue() == m.floatValue()) {
	    return 0;
	}
	//Returns a positive integer if the calling number is larger than the parameter
	if (this.floatValue() > m.floatValue()){
	    return 1;
	}
	//Returns a negative integer if the calling number is smaller than the parameter
	else {
	    return -1;
	}
	
    }
    
    public static void main(String [] args) {
	System.out.println("Making Rational objects...");
	Rational r = new Rational (2,3); //Stores rational number 2/3
	Rational s = new Rational(1,2); //Stores rational number 1/2
	Rational t = new Rational (5, 0); //Stores rational number 0/1
	Rational u = new Rational (8, 5); //Stores rational number 8/5
	
	System.out.println("=====================================");
	System.out.println("Rational r is: " + r); // 2/3
	System.out.println("Rational s is: " + s); // 1/2
	System.out.println("Rational t is: " + t); // 0/1
	System.out.println("Rational u is: " + u); // 8/5
	System.out.println("=====================================\n");
	
	System.out.println("Now testing floatValue()...");
	System.out.println("=====================================");
	System.out.println("r as a float is " + r.floatValue()); // 0.6666666
	System.out.println("s as a float is " + s.floatValue()); // 0.5
	System.out.println("t as a float is " + t.floatValue()); // 0.0
	System.out.println("u as a float is " + u.floatValue()); // 1.6
	System.out.println("=====================================\n");


	System.out.println("Now testing multiply()...");
	System.out.println("=====================================");
	
	System.out.print(r + " multiplied by " + s + " is " ); // 2/3 & 1/2
	r.multiply(s);
	System.out.print(r); // 2/6
	System.out.println("\n s is still " + s); // 1/2

	System.out.print(s + " multiplied by " + u + " is "); // 1/2 & 8/5
	s.multiply(u);
        System.out.print(s); // 8/10
	System.out.println("\n u is still " + u); // 8/5

	System.out.println("=====================================\n");

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	System.out.println("Now testing divide()...");
	System.out.println("=====================================");
	
	System.out.print(t + " divided by " + r + " is "); // 0/1 & 2/6
	t.divide(r);
        System.out.print(t); // 0/2
	System.out.println("\n r is still " + r); // 2/6

	System.out.print(u + " divided by " + r + " is "); // 8/5 & 2/6
        u.divide(r);
        System.out.print(u); // 48/10
        System.out.println("\n r is still " + r); // 2/6
	System.out.println("=====================================\n");

	
	
	System.out.println("Now testing add()...");
        System.out.println("=====================================");

	System.out.print(r + " + " + s + " = " ); // 2/3 + 1/2 = 7/6
	r.add(s);
	System.out.print(r + "\n");
	    
	System.out.print(s + " + " + t + " = " ); // 1/2 + 0/1 = 1/2
        s.add(t);
        System.out.print(s + "\n");
	
	System.out.println("=====================================\n");

	
	System.out.println("Now testing subtract()...");
	System.out.println("=====================================");

	System.out.print(t + " - " + u + " = "); // 0/1 - 8/5 = -8/5 
	t.subtract(u);
	System.out.print(t + "\n");

	System.out.print(u + " - " + r + " = "); // 8/5 - 7/6 = 13/30 
	u.subtract(r);
        System.out.print(u + "\n");

	System.out.println("=====================================\n");

	
	System.out.println("Now testing reduce()...");
        System.out.println("=====================================");
	System.out.print(r + " is reduced to ");
	r.reduce();
	System.out.println(r); // 7/6
	System.out.print(s + " is reduced to ");
	s.reduce();
        System.out.println(s); // 1/2
	System.out.print(t + " is reduced to ");
	t.reduce();
	System.out.println(t); // 8/-5
	System.out.print(u + " is reduced to ");
	u.reduce();
	System.out.println(u); // 13/30
	Rational v = new Rational (-10, 5);
	System.out.print(v + " is reduced to ");
        v.reduce();
        System.out.println(v); // -2/1
	System.out.println("=====================================\n");
	
	System.out.println("Now testing compareTo()...");
        System.out.println("=====================================");
	System.out.println(r +" vs. "+ s + " => " + r.compareTo(s)); //1
	System.out.println(s +" vs. "+ t + " => " + s.compareTo(t)); //1
	System.out.println(t +" vs. "+ u + " => " + t.compareTo(u)); //-1
	System.out.println(u +" vs. "+ r + " => " + u.compareTo(r)); //-1
	System.out.println("=====================================\n");




    }
    
}// end Rational

