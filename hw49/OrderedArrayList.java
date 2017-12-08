// Maggie Zhao
// APCS1 pd02
// HW49-- Halving the Halves
// 2017-12-07 R
/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Comparable 
  // (ie, instances of a class that implements interface Comparable)
  private ArrayList<Comparable> _data;


  // default constructor initializes instance variable _data
  public OrderedArrayList()
  {
    _data = new ArrayList<Comparable>();    
  }


  public String toString()
  {
    return _data.toString(); 
  }


  public Comparable remove( int index )
  {	
    return _data.remove(index); 
  }


  public int size()
  { 
    return _data.size();
  }

    
  public Comparable get( int index )
  { 
    return _data.get(index); 
  }


  /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * maintains ascending order of elements
   * uses a linear search to find appropriate index
   ***/
  public void add( Comparable newVal )
  { 
    for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
	    }
    }
    _data.add( newVal ); //newVal > every item in oal, so add to end 
  }

    
  public void addBin( Comparable newVal)
  {
      int _hi, _lo, compared;
      _lo = 0; //lowest possible index
      _hi = _data.size() - 1; //highest possible index
 
      if (_data.size() == 0) //build up from an empty array
	  _data.add(0, newVal);
      if (newVal.compareTo(_data.get( _lo)) <= 0){
	  // if the newVal is the smallest number, it will go in the front of the array
	  _data.add( _lo, newVal ); /
	    return;
        }
        if (newVal.compareTo(_data.get( _hi)) >= 0){
	    // if the newVal is the largest number, it will go in the back of the array
	    _data.add( _hi + 1, newVal );
	    return;
        }

      while (true) {
	   // will compare newVal to the middle value of the range being compared
	  compared = (int) ( (_hi + _lo) / 2 );

	  // if the newValue is equal to the compare value, or is in between the compared value and the value adjacent to it, add that value in the array behind compared
	  if( this.get(compared) ==  newVal ||
	      (this.get(compared).compareTo( newVal ) < 0) && (this.get(compared + 1).compareTo(newVal) > 0)) {
	    _data.add( compared + 1, newVal );
	    return;
	  }
	  else if( this.get(compared).compareTo(newVal) > 0 ) {
	      // if the newVal is less than the value at compared, cut the range, so that it starts from the lowest index, and the new highest index is the element before compared 
	      _hi = compared - 1;
	  }
	  else {
	      // if the newVale is greater than the value at compared, cut the range, so that the new lowest index is the element after compared, and ends at the highest index
	      _lo = compared + 1;
	      
	  }	  
      }
  }
    
    
  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addBin( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    	    
    //check for sorted-ness
    //if msg does not appear, list was sorted
    /*
    for( int i=0; i<Franz.size()-1; i++ ) {
      System.out.println("at i: " + Franz.get(i) );
      if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
        System.out.println( " *** NOT sorted *** " );
        break;
      }
    }
    */
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class OrderedArrayList
