// "You Might Belong in Gryffindor" -- Bing Li & Maggie Zhao  
// APCS1 pd02 
// HW55-- Never Fear, Big Oh Is Here!
// 2017-12-14 R 
/* ===============================================       
class MySorts --
* void version of bubbleSort
* void version of selectionSort
* void version of insertionSort
=============================================== */       
import java.util.ArrayList;

public class MySorts
{
    //======================================================
    // add (Comparable newVal);
    // uses a linear search to find appropriate index
    //   execution time: add() = O(n);
    // Since add() uses a linear search, it goes through each element of the ArrayList
    // to check if the input value belongs in that spot. If each element is checked, 
    // the execution time is n.
    //======================================================

    //======================================================                              
    // addBin (Comparable newVal);
    // uses a binary search to find appropriate index
    //   execution time: addBin() = O(log2(n));
    // addBin() uses binary search, and the number of "guesses" required to reach the 
    // number is equal to log2(n), since the range is divided by 2 each time. As discussed
    // in class, the log2(n) is the execution time.
    //======================================================
    
    //======================================================     
    // VOID version of bubbleSort                                              
    // Rearranges elements of input ArrayList                                  
    // postcondition: data's elements sorted in ascending order
    //
    // best case: ArrayList is already sorted
    //    execution time: t(x) = O(n^2)
    // 
    // worst case: ArrayList is sorted in descending order
    //    execution time: t(x) = 0(n^2)
    //
    // Regardless of whether it is best/worst case, bubbleSort uses 2 for loops,
    // which go through the collection twice (for each pass, all of the elements
    // are checked). However, the worst case scenario should require a higher execution
    // time since elements have to be swapped every time.
    //======================================================     
    public static void bubbleSort( ArrayList<Comparable> data )
    {
	//make n-1 passes across collection
	for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
	    System.out.println( "commencing pass #" + passCtr + "..." );    
	    //iterate from first to next-to-last element                       
	    for( int i = 0; i < data.size()-1; i++ ) {
		//if element at i > element at i+1, swap                       
		if ( data.get(i).compareTo(data.get(i+1) ) > 0 )
		    data.set( i, data.set(i+1,data.get(i)) );
		System.out.println(data); //diag: show current state of list 
	    }
	}
    }


    //======================================================         
    // VOID version of SelectionSort                                          
    // Rearranges elements of input ArrayList                                 
    // postcondition: data's elements sorted in ascending order
    // best case: No distinction. 
    //    execution time: t(x) = O(n^2)
    //
    // worst case: No distinction
    //    execution time: t(x) = O(n^2)
    // 
    // selectionSort also uses two for loops. Even though it does not loop through all
    // of the elements, it will still bound the execution time of selectionSort. Both
    // the best and worst case scenarios would require the same amount of execution time,
    // whether the array is sorted or not, because the values are swapped, even if they
    // are in their correct location
    //======================================================     
    public static void selectionSort( ArrayList<Comparable> data )
    {
	//note: this version places greatest value at rightmost end,           
	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;
	for( int pass = data.size()-1; pass > 0; pass-- ) {
            System.out.println( "\nbegin pass " + (data.size()-pass) );//diag  
            maxPos = 0;
            for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
            }
            data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
            System.out.println( "after swap: " +  data );//diag               
	}
    }//end selectionSort
    
    //======================================================         
    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    // best case: ArrayList is already sorted
    //    execution time: t(x)= O(n^2)                                                
    // 
    // worst case: ArrayList is sorted in descending order                    
    //    execution time: t(x) = O(n^2)                     
    //
    // Regardless of whether it is best/worst case, insertionSort uses 2 for loops,
    // which go through the collection twice (for each pass, all of the elements
    // are checked). However, the worst case scenario should require a higher execution
    // time since elements have to be swapped every time.    
    //======================================================         
    public static void insertionSort( ArrayList<Comparable> data )
    {
	for( int partition = 1; partition < data.size(); partition++ ) {
	    //partition marks first item in unsorted region                    
	    //diag:                                                            
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data );
	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {
		// "walk" the current item to where it belongs
		// by swapping adjacent items                                 
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) );
		}
		else
		    break;
            }
	}
    }//end insertionSort         
}
