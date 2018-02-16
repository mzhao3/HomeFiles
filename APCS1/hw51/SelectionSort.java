//Maggie Zhao
//APCS1 pd02
//HW51-- Selection
//2017-12-11 M


/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // helper function to find the index of the minimum value
    public static int minValue (ArrayList<Comparable> data)
    {
	int minAt = 0;
	for (int x = 0; x < data.size() ; x++) {
	    if (data.get(minAt).compareTo(data.get(x)) > 0) {
		minAt = x; //if the value at the current minimum is larger than
		           //the one being checked, change the minimum to x
	    }
	}
	return minAt;
    }
    
  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data ) 
  {
      int min;
      ArrayList<Comparable> temp = new ArrayList<Comparable>();
      while (data.size() > 0) {
	  min = minValue(data); // find the min of the current array
	  temp.add(data.get(min)); //take the value at min, and add it to temp
	  data.remove(min); // get rid of the min, and find a new min from the
	                    // shortened array
      }
      for (Comparable y : temp) // copies everything from temp back into data
	  data.add(y);
      
	  
  }//end selectionSortV


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    selectionSort( ArrayList<Comparable> input ) 
  {
      ArrayList<Comparable> tempAL = new ArrayList<Comparable>();
      for (Comparable i: input) { //for loop going through each element of input
	  tempAL.add(i); //copies each element of input into the tempAL       
        }
      
      selectionSortV(tempAL); //sorts the tempAL
      return tempAL;
  }//end selectionSort 


  public static void main( String [] args ) 
  {
    /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );


      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


    	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
    /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
