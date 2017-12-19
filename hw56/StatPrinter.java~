// Maggie Zhao
// APCS1 pd02
// HW56-- His Toe Grammar
// 2017-12-18

/*====================================================================
  An AP-style question, for practice:
  Write the StatPrinter class below. The StatPrinter Object receives an
  ArrayList of nonnegative integers, then builds a frequency ArrayList in which
  the index values are the data and the entry at the index is the frequency.
  For example, if the received data is    2,3,2,5,1,3    then the frequency 
  list would be [0,1,2,2,0,1]. This is read as 0 zeroes, 1 one, 2 twos,
  2 threes, 0 fours, 1 five. The size of the frequency list is the equal to
  the maximum value of the data.

  A capability of the class is to calculate local modes from the frequency 
  list. A local mode is a value that is greater than the value at index-1 
  and greater than the value at index+1. A local mode is never at the end
  points of the list. For example, if the frequency list is [1,2,1,4,2,3,5] 
  then the local modes are 2 and 4.

  This class is also capable of printing a histogram of the frequencies, using
  '*'s to indicate a frequency amount. To print a histogram, the user specifies
  the longest sequence of '*'s used and then all other values are printed in 
  proportion to this value. For example, if longest bar is 10 and the frequency
  list is [1,2,1,4,2,3,5] then the histogram printed looks like this:

  0 : **
  1 : ****
  2 : **
  3 : ********
  4 : ****
  5 : ******
  6 : **********

  For each method, state run time efficiency using Big O notation.

  Tips for Awesome:
  * Keys to Success are so named for a reason.
  * Look over all fxns, think a bit, decide which to tackle first.
  ( Simplest?  Prerequisites? . . . )
  * Develop 1 fxn at a time, test it, then move to next.
  * For coding today, what extra code do you need to get past compiler?
  ====================================================================*/

import java.util.ArrayList;


public class StatPrinter {

    // instance variable for frequencies of each integer in input ArrayList
    private ArrayList <Integer> _frequency;


    //*************** QUESTION 02 **************************
    //precond:  data.size() > 0, each entry b/t 0,100 inclusive
    //postcond: _frequency.size() set to max(data) + 1
    //          _frequency.get(i) returns frequency of i in data
    //eg, for data [2,3,2,5,2,3]
    //  _frequency would be [0,0,3,2,0,1]
    public StatPrinter( ArrayList <Integer> data ) 
    { 
	_frequency = new ArrayList <Integer>();
	for (int h = 0; h < (max(data) + 1); h++) {
	    _frequency.add(0);
	} // using the highest value in data, increase the size of the _freq ArrayList by adding 0s.
	for (int i = 0; i < data.size(); i++) {
	    _frequency.set(data.get(i), (_frequency.get(data.get(i)) + 1));
	    // update the _freq list everytime a value occurs in data (the value in data is the index in _freq) 
	}
    }
    
    //*************** QUESTION 01 **************************
    //precond:  data.size() > 0
    //postcond: returns largest integer in data
    public Integer max( ArrayList <Integer> data ) 
    { 
	int max = data.get(0); // start off with the max as the first value
	for (int x = 1; x < data.size(); x ++ ) {
	    if (data.get(x).compareTo(max) > 0 ) // if a value in data is greater than 0,
		max = data.get(x); // make max the larger value
	}
	return max;
    }


    //*************** QUESTION 03 **************************
    //postcond: returns true if i > 0 and i < _frequency.size() - 1
    //          and _frequency.get( i - 1 ) < _frequency.get( i )
    //          and _frequency.get( i + 1 ) < _frequency.get( i )
    //          Otherwise, returns false
    //eg, for _frequency [1,2,1,5,5,8,2,4]
    //    2 and 8 are local modes, so
    //    isLocalMode(0) -> false
    //    isLocalMode(1) -> true
    //    isLocalMode(5) -> true
    public boolean isLocalMode( int i ) 
    {
	// If there is a value in frequency that is greater than the values before and after it, there is a local mode. The value cannot be the beginning or the end values.
	boolean isMode = false;
	if ( i > 0 && i < _frequency.size() - 1) {
	    isMode = (_frequency.get( i - 1 ) < _frequency.get( i ) &&
		      _frequency.get( i + 1 ) < _frequency.get( i ) );
	}
	return isMode;
    }


    //*************** QUESTION 04 **************************
    //postcond: returns list of modes in _frequency
    
    public ArrayList<Integer> getLocalModes() 
    {
	ArrayList <Integer> localModes = new ArrayList <Integer>();
	// Takes the local mode and adds it to the ArrayList of local modes
	for (int j = 0; j < _frequency.size() - 1; j ++) {
	    if (_frequency.get( j - 1 ) < _frequency.get( j ) &&
		_frequency.get( j + 1 ) < _frequency.get( j ) )
	       
		localModes.add(_frequency.get(j));
	}
	return localModes;
    }


    //*************** QUESTION 05 **************************
    //precond:  longestBar > 0
    public void printHistogram( int longestBar ) 
    {
	// ratio so that the highest frequency value is the longest bar
	double ratio = (longestBar * 1.0) / max(_frequency) ; 
	for (int z = 0; z < _frequency.size(); z ++) { //for each value in _freq
	    String s = z + " : ";
	    for (int a = 0; a < _frequency.get(z) * ratio ; a++) {
		s += "*";
	    }
	    System.out.println(s);
	}
    }
}//end class StatPrinter

