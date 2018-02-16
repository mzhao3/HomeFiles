/* 
   Money Team - Eric Wong, Lily Yan, Maggie Zhao
   APCS1 pd2
   HW09 -- CMYM/Creating Classes/Creating BankAccount.java
   2017-10-02
*/

// creates the class BankAccount
public class BankAccount {

    //instance variable for the account name
    private static String acctHolder;

    //instance variable for the account password
    private static String password;

    //instance variable for the account pin
    private static int pin;

    //instance variable for the account number
    private static int accountNum;

    //instance variable for the account name
    private static double accountBalance;

    /* all instance variables are static because we are not creating new instances of the class BankAccount */

    //constructor for BankAccount 
    public BankAccount() { 

	acctHolder = "John Doe";
	password = "abcdefg";
	pin = 1234;
	accountNum= 123456789;
	accountBalance = 0.00;
    }

    //main method
    public static void main (String[] args){
	setAcctHolder("Squiggly McSquigglyFace");
    	setPassword("password");                                               
    	setPin(6789);
    	setAcctNumber(255678941);
    	setInitBalance(10000.00);
    	//deposit(56.00);
    	withdraw(56.00);
    	accountInfo();
    }

    // methods for setting each attribute
    public static void setAcctHolder( String name) {
	acctHolder = name;
    }
    public static void setPassword( String pass) {
    	password = pass;
    }
    public static void setPin( int newPin) {
    	pin = newPin;
    }
    public static void setAcctNumber( int nine) {
    	accountNum = nine;
    }
    public static void setInitBalance( double richness) {
   	accountBalance = richness;
    }

    // depositing and withdrawing money methods
    public static void deposit(double amt) {
   	accountBalance += amt;
    }
    public static void withdraw(double amt) {
   	accountBalance -= amt;
    }

    /* printing bank account information method- each line is separated so that the information will be printed out in 5 separate lines */
    public static void accountInfo() {
  	System.out.println("Name: " + acctHolder);
    	System.out.println("Password: " + password);
    	System.out.println("4-Digit Pin: " + pin);
    	System.out.println("Account Number: " + accountNum);
    	System.out.println("Balance: $" + accountBalance);
    }
}
