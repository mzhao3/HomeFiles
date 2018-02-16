/*
  Robin DeBank (Group 0) -- Ryan Kim, Ricky Lin, Maggie Zhao
  APCS1 pd02
  HW10 -- Mo Money Mo Problems ...but we can MAKE MO AWESOME
  2017-10-03 
*/

public class BankAccount
{    
    //instance variables
    private String name;
    private String password;
    private int pin;
    private int acctNum;
    private double balance;

    //mutators
    public String setName( String newName )
    {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String setPassword( String newPassword )
    {
	String oldPassword = password;
	password = newPassword;
	return oldPassword;
    }

    public int setPin( int newPin )
    {
	int oldPin = pin;
	if( newPin >= 1000 && newPin <= 9998 )
	    {
		pin = newPin;
		System.out.println( "New pin set to " + newPin + "\n" );
	    }
	else
	    {
		pin = 9999;
		System.out.println( "Pin outside of range. Defaulted to 9999. \n" );
	    }
	pin = newPin;
	return oldPin;
    }

    public int setAcctNum( int newAcctNum )
    {
	int oldAcctNum = acctNum;
	if( newAcctNum >= 100000000 && newAcctNum <= 999999998 )
	    {
		acctNum = newAcctNum;
		System.out.println( "New account number set to " + newAcctNum + "\n" );
	    }
	else
	    {
		acctNum = 999999999;
		System.out.println( "Account number outside of range. Defaulted to 999999999. \n" );
	    }
	return oldAcctNum;
    }

    public double setBalance( double newBalance )
    {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }

    public void deposit( double depositAmount )
    {
	balance = balance + depositAmount;
    }

    public boolean withdraw( double withdrawalAmount )
    {
	double oldBalance = balance;
	if( balance >= withdrawalAmount )
            {
		balance = balance - withdrawalAmount;
		System.out.println( "New Balance: $" + balance );
		return true;
	    }
	else
            {
		System.out.println( "Transaction Denied. Insufficient Money. Current Balance: $" + balance + " Withdrawal Amount: $" + withdrawalAmount + "\n" );
		return false;
	    }
    }

    public boolean authenticate( int inputtedAcctNum, String inputtedPassword) {
	if( acctNum == inputtedAcctNum && password == inputtedPassword )
	    {
		return true;
	    }
	else
	    {
		return false;
	    }
    }
	
    //overwritten toString()
    public String toString()
    {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + password;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: $" + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }
	
    //main method for testing
    public static void main( String[] args )
    {
	BankAccount Ricky = new BankAccount();
	Ricky.setName("Ricky Lin");
	Ricky.setPassword("Case Sensitive");
	Ricky.setPin(12345);
	Ricky.setPin(2444);
	Ricky.setAcctNum(1234567890);
	Ricky.setAcctNum(244466666);
	Ricky.setBalance(0.01);
	Ricky.deposit(1.00);
	Ricky.withdraw(1.15);
	Ricky.withdraw(1.00);
	System.out.println(Ricky.toString());
    }//end main()

}//end class BankAccount
