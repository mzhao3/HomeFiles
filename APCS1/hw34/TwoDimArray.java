// Maggie Zhao                                                                 
// APCS1 pd2                                                                   
// HW34 -- Arrays of Arrays                                                    
// 2017-11-17                                                                  

/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
    {
	//go through all the rows, until the number of rows (a.length)
	//is reached
	for (int x = 0; x < a.length; x ++ ) {
	    //go through each element in the row, until the number of
	    //elements/columns (a[row].length) is reached
	    for (int y = 0; y < a[x].length; y ++ ) {

		//print the element		
		System.out.print(a[x][y]);
	    }
	    
	    //print a line separating each row
	    System.out.println();
	    
	}
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
      //for each set of array in the array of arrays
      for( int [] x : a) {
	  // for each element in the array	  
	  for (int y : x) {

	      //print out the element
	      System.out.print(y); 
            }
	  // print a line separating each row
	  System.out.println(); 
        }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
      int total = 0;
      
      //go through each row...
      for (int x = 0; x < a.length; x ++ ) {

	  //and go through each element/column...
            for (int y = 0; y < a[x].length; y ++ ) {

		//and add it to the total.
		total += a[x][y]; 		
	    }
      }

      return total;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {

      int sum = 0;

      //for each row, add the sum of the row to the total sum
      for (int x = 0; x < m.length; x ++ ) {
	  sum += sumRow(x, m);
      }

      return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
      int total = 0;
      //go through each element in a specified row, r, until you reach the end
      //of the row 
      for (int x = 0; x < a[r].length; x++){

	  //add the element to the total for the row
	  total += a[r][x];
      }
      return total;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
      int total = 0;

      // for each element in a specified row, r,...
      for ( int x : m[r]) {
	  //add the element to the total for the row
	  total += x;
      }

      return total;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      System.out.println("==============TESTING PRINT1==============");
      print1(m1); 
      print1(m2);
      print1(m3);
      System.out.println("==========================================\n");

      System.out.println("==============TESTING PRINT2==============");
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.println("==========================================\n");
	    
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1)); //0
      System.out.println("sum m2 : " + sum1(m2)); //27
      System.out.println("sum m3 : " + sum1(m3)); //21
      System.out.println("==========================================\n");
      
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1)); //0
      System.out.println("sum m2 : " + sum2(m2)); //27
      System.out.println("sum m3 : " + sum2(m3)); //21
      System.out.println("==========================================\n");

      System.out.print("testing sumRow...\n");
      System.out.println("sumRow 0 of m1 : " + sumRow(0,m1));//0
      System.out.println("sumRow 1 of m2 : " + sumRow(1,m2));//5
      System.out.println("sumRow 2 of m3 : " + sumRow(2,m3));//19
      System.out.println("==========================================\n");
      
      System.out.print("testing sumRow2...\n");
      System.out.println("sumRow2 0 of m1 : " + sumRow2(0,m1));//0
      System.out.println("sumRow2 1 of m2 : " + sumRow2(1,m2));//5
      System.out.println("sumRow2 2 of m3 : " + sumRow2(2,m3));//19
      System.out.println("==========================================\n");
  }

}//end class TwoDimArray
