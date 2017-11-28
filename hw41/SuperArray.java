// Maggie Zhao
// APCS1 pd2
// HW #41: Array of Steel like Kal El , inspired by Curtis
// 2017-11-27 M


/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10]; // allocates an array with enough memory for 10 integer elements
      
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
   
      String s = "["; //start with opening bracket of the array
      for (int y : _data) { //add each element of the array to the string
	  s += (y + ",");
      }
      s += "]"; //end with a closing bracket
      return s;
      
  }


  //double capacity of SuperArray
  private void expand()
  {
      _size = _data.length; // sets the variable _size to the length of the array _data
      _size = _size * 2; // doubles the capacity (doubles the size)
      _data = new int[_size]; // allocates a new array, with the same name, but with double the memory for integers
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int oldVal = get(index); // gets the old value of the index and assigns it to a temp variable
      _data[index] = newVal; // sets the index to the input value
      return oldVal; // returns the old value
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
   
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
