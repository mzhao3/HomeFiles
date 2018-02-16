// Maggie Zhao
// APCS1 pd02
// HW47-- ascending
// 2017-12-05 T


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
      String foo = "[";
      for( int i = 0; i < _data.size(); i++ ) {
	  foo += _data.get(i) + ",";
      }
      if ( foo.length() > 1 )
	  //shave off trailing comma
	  foo = foo.substring( 0, foo.length()-1 );
      foo += "]";
      return foo;
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


  public void add(Comparable newVal)
  { 
      _data.add(newVal);
  }

    public static void sort(OrderedArrayList arr){
	
	while (! isSorted(arr._data) ) { //checks to see if all elements are in ascending order
	    
	    for (int j = 0; j < arr.size() -1 ; j++){
		if (arr.get(j).compareTo(arr.get(j+1)) > 0) // if the first of two adjacent elements is larger than the second, swap the elements
		    swapper(arr._data, j);
	    }
	}
    }
	
    public static void swapper(ArrayList<Comparable> arr, int i){
	// swap elements
	Comparable temp = arr.get(i+1);
	arr.set(i+1, arr.get(i));
	arr.set(i, temp);
    }
    
    
    public static boolean isSorted (ArrayList<Comparable> a){
	boolean sorted = true;
	for (int x = 0; x < a.size() - 1; x += 1){
	    sorted = sorted && (a.get(x).compareTo(a.get(x+1))<=0);
	} //If the first int (x) is smaller than or the same as the second int (x+1), compareTo() will return a negative number or 0. If an array is sorted, each number is smaller or equal to the next.
	return sorted;
    }


    
  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.add( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    sort(Franz);
    System.out.println(Franz);
    //check for sorted-ness
    //if msg does not appear, list was sorted
    for( int i=0; i<Franz.size()-1; i++ ) {
      System.out.println("at i: " + Franz.get(i) );
      if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
        System.out.println( " *** NOT sorted *** " );
        break;
      }
    }
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class OrderedArrayList
