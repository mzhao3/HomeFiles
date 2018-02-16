// Maggie Zhao
// APCS1 pd02
// HW57-- How Deep Does the Rabbit Hole Go?
// 2017-12-19 T

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/

public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() 
    {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];    
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) 
    {
	matrix = new Object[a][a];
    }

    //populates method with consecutive integers
    //runtime: O(n^2)
    public void populate()
    {
	int i = 0;
	for (int x = 0; x < matrix.length; x ++ ) {
	    for (int y = 0; y < matrix.length; y++ ){
		set(x,y, i);
		i++;
	    }
	}    
	
    }
    //return size of this matrix, where size is 1 dimension
    //runtime: O(1)
    private int size() 
    {
	return matrix.length;
    }


    //return the item at the specified row & column   
    //runtime: O(1)
    private Object get( int r, int c ) 
    {
	return matrix[r][c];
    }


    //return true if this matrix is empty, false otherwise
    //runtime: O(1)
    private boolean isEmpty() 
    {
	for (int x = 0; x < matrix.length; x ++) {
	    for (int y = 0; y < matrix[x].length; y++) {
		if (!((matrix[x][y]) == (null)))
		    return false;
	    }
	}
	return true;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    //runtime: O(1)
    private Object set( int r, int c, Object newVal ) 
    {
	Object oldVal = matrix[r][c];
	matrix[r][c] = newVal;
	return oldVal;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    //runtime: O(n^2)
    public String toString() 
    {
	String matrixS = "| ";
	for (Object[] row: matrix) {
	    for (Object o: row)
		matrixS +=  o + " ";
	    	
	    matrixS += "|\n| ";
	}
	if (matrixS.length() > 1)
	    matrixS = matrixS.substring(0, matrixS.length() - 3);
	//gets rid of last newline and "| "
	return matrixS;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    //runtime: O(n^2) [has to check each slot to see if the values are identical]
    public boolean equals( Object rightSide ) 
    {
	boolean equality = false;
	// check if rightside is a matrix
	if ( rightSide instanceof Matrix) {
	    // check for aliases
	    if (this == rightSide) 
		return true;
	    // check if sizes match (have identical dimensions)
	    if (this.size() == (((Matrix)rightSide).size())){
		equality = true; 
		for (int x = 0; x < matrix.length; x ++) {
		    //checks each slot to see if values are identical
		    for (int y = 0; y < matrix[x].length; y++) 
			if (!(matrix[x][y].equals(((Matrix)rightSide).get(x,y))))
			    return false;
		}
	    }
	    return equality; // if the sizes are not equal
	}
	return false; //if rightSide is not a Matrix		 
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //runtime: O(n)
    public void swapColumns( int c1, int c2  ) 
    {
	Object[] tempCol = new Object[matrix.length];
 
	for (int x = 0; x < matrix.length; x ++){ 
	    tempCol[x] = matrix[x][c1-1];
	    matrix[x][c1-1] = matrix[x][c2-1];
	    matrix[x][c2-1] = tempCol[x];
	}
    }

    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //runtime: O(n)
    public void swapRows( int r1, int r2  ) 
    {
	Object[] tempRow = new Object[matrix.length];

	for (int x = 0; x < matrix.length; x ++){
	    tempRow[x] = matrix[r1-1][x];
	    matrix[r1-1][x] = matrix[r2-1][x];
	    matrix[r2-1][x] = tempRow[x];
	}
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	System.out.println("\no====o====o====o====o====o====o====o====o====o====o\n");
	System.out.println("oOooOooOo Now testing isEmpty oOooOooOo\n");
	Matrix sally = new Matrix();
	System.out.println("=====Printing sally==== \n" + sally);
        System.out.println("======================");
	System.out.println("Is sally empty? " + sally.isEmpty());
	
	sally.set(0,1,12);
        System.out.println("=====Printing sally==== \n" + sally);
        System.out.println("======================");
        System.out.println("Is sally empty? " + sally.isEmpty());

	System.out.println("\no====o====o====o====o====o====o====o====o====o====o\n");
	
	Matrix peter = new Matrix();
	System.out.println("peter initialized without items is");
	System.out.println("=====Printing peter====\n" + peter);
	System.out.println("======================");
	System.out.println("Is peter empty? " + peter.isEmpty());
	
	System.out.println("Is peter equal to pete?");
      
	peter.populate();
	System.out.println("=====Printing peter====\n" + peter);
	System.out.println("======================");
	System.out.println("Is peter empty? " + peter.isEmpty());  
	System.out.println("size: " + peter.size());


	Matrix pete = new Matrix();
	pete.populate();
	System.out.println("=====Printing pete====\n" + pete);
	System.out.println("======================");
	System.out.println("Is pete empty? " + pete.isEmpty());  
	System.out.println("size: " + pete.size());

	System.out.println("(peter == pete) is " + peter.equals(pete));
	
	System.out.println("oOooOooOo Now testing get and set oOooOooOo\n");
	System.out.println("The value at (0,0) is: " + peter.get(0,0));
	System.out.println("Replacing this value with 23...");
	peter.set(0,0,23);
	System.out.println("=====Printing peter====\n" + peter);
        System.out.println("======================");

	System.out.println("Is peter still equal to pete? " + peter.equals(pete));

	System.out.println("\no====o====o====o====o====o====o====o====o====o====o\n");
	Matrix louise = new Matrix(3);
	louise.populate();
	System.out.println("=====Printing louise==== \n" + louise);
	System.out.println("======================\n");

	//testing swapColumns
	System.out.println("oOooOooOo Now testing swapColumns oOooOooOo\n");
	System.out.println("Swapping columns 1 and 2...");
	louise.swapColumns(1,2);
	System.out.println("=====Printing louise==== \n" + louise);
	System.out.println("======================\n");
      
	System.out.println("\no====o====o====o====o====o====o====o====o====o====o\n");
	Matrix tony = new Matrix(4);
	tony.populate();
	System.out.println("=====Printing tony==== \n" + tony);
	System.out.println("======================\n");

	//testing swapRows
	System.out.println("oOooOooOo Now testing swapRows oOooOooOo\n");
	System.out.println("Swapping rows 1 and 3...");
	tony.swapRows(1,3);
	System.out.println("=====Printing tony==== \n" + tony);
	System.out.println("======================\n");
       
	System.out.println("Is louise equal to tony? " + louise.equals(tony));
    }

}//end class Matrix
