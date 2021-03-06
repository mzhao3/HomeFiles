/***************************
 * interface ListInt
 * Declares methods that will be implemented by any
 *  class wishing to adhere to this specification.
 * This interface specifies behaviors of a list of ints.
 ***************************/

public interface ListInt
{
  // Return number of elements in the list
  public int size();

  // Append an int to the end. Return true.
  public boolean add( int num );

  // Insert an int at index
  public void add( int index, int num ); 

  // Retrieve the int at index
  public int get( int index );

  // Overwrite the int at index
  public int set( int index, int num );

  // Remove the int at index,
  // shifting any elements after it to the left.
  // Return removed value.
  public int remove( int index );

}//end interface ListInt
