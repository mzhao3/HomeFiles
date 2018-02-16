import cs1.Keyboard;

// Maggie Zhao
// APCS1 pd2
// HW40-- Make It Better
// 2017-11-22

/* ==================================================
 * class Swapper
 * Methods: stringMaker(), fillArray(), printArray(), swap()   
 * Creates a 2D array and fills it with unique 4-character strings, and display it in the terminal.
 * Prompts user to specify two locations, swap the items at these locations, and redisplay the array.
================================================== */

/* ==================================================
          ------ v2 improvements ------
 * Made the printArray() more clear and pleasing to look at by adding row and column markers.
 * Added instructions for the user to explain how to read the printed array and how to use swap.
================================================== */

public class Swapper{

    //final instance variable- lists all characters of alphabet
    private static final String ALPHABET =  "abcdefghijklmnopqrstuvwxyz"; 

    //Using a foreach loop, you can go through each row, and then each column to print out each value in the array. After it finishes with one row, it will add a new line to separate the rows.
    public static void printArray(String [][] array){
	int i = 0;
	String heading = "Column: ";
	
	System.out.println("============ YOUR ARRAY ============");
	for (int counter = 0; counter < array[0].length; counter ++ )
	    heading += (counter + "    ");
	
	System.out.print(heading);
	System.out.println("\n====================================");
		
	for (String [] x : array) {
	    System.out.print("Row " + i + "||");
	    for (String s : x) {
		System.out.print(s + " ");
	    }
	    i += 1;
	    System.out.println();
	}
	System.out.println("====================================\n");
    }

    //This is where the final String of the alphabet comes in handy! Using a random integer from 0 to 26, I used that to choose 4 random letters and combine them into a unique 4-character string.
    public static String stringMaker() {
	String retStr = "";
	for (int x = 0; x < 4; x ++) {
	    int indexer = (int)(Math.random() * 26 );
	    retStr += ALPHABET.substring(indexer, indexer + 1);
	}
	return retStr;
    }

    //Since we are altering the content of the array, a for loop is necessary. This goes through each value in the array and replaces the default value with a unique string.
    public static void fillArray( String[][] array){
	for (int x = 0; x < array.length; x ++){
	    for (int y = 0; y < array[x].length; y++) {
		array[x][y] = stringMaker();
	    }
	}
    }

 
    public static void swap (String[][] array, int a, int b) {
	int row = array.length;
	int column = array[0].length;
	// If the value you want to swap is within the total number of values within the array...
	if (a < row * column && b < row * column){
	    // a/column represents which *row* the desired swap will be in
	    // a%column represents which *column* the desired swap will be in
	    String temp = array[a/column][a%column];
	    array[a/column][a%column] = array[b/column][b%column];
	    array[b/column][b%column] = temp;
	}
	// If the value you want to swap is _not_ within the total number of values, you get an error message.
	else
	    System.out.println("Your location is out of bounds.");
    }
    
    public static void main(String [] args) {
	//Testing the creation of a unique 4 character String.
	System.out.print("Testing 4 character string creator: ");
	System.out.println(stringMaker());

	//Creating a new array, filling it with 4-character strings, and printing it out.
	String[][] array = new String[6][6];
	fillArray(array);
	printArray(array);

	System.out.println("The locations of the 4-character strings in this array are numbered from 0 to 35, with 0 being the top left-most. It is read from left to right, top to bottom. \n \n");
	
	System.out.println("Specify one location to swap. Please enter one integer only.");
	int input1 = Keyboard.readInt();
	System.out.println("Your first desired swap is at Row "+ input1/array[0].length+ " and Column " + input1%array[0].length + ".");
			   
	System.out.println("What would you like to swap it with?");
	int input2 = Keyboard.readInt();
	System.out.println("Your second desired swap is at Row "+ input2/array[0].length+ " and Column " + input2%array[0].length + ".");
	
	swap(array, input1, input2 );
	printArray(array);
    }//end main
    
}// end Swapper
