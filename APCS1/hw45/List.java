/***************************
 * interface List
 * Declares methods that will be implemented by any
 *  class wishing to adhere to this specification.
 * This interface specifies behaviors of a list of ints.
 ***************************/

public interface List
{
  // Return number of elements in the list
  public int size();

  // Append an int to the end. Return true.
  public boolean add( Object object );

  // Insert an int at index
  public void add( int index, Object object ); 

  // Retrieve the int at index
  public Object get( int index );

  // Overwrite the int at index
  public Object set( int index, Object object );

  // Remove the int at index,
  // shifting any elements after it to the left.
  // Return removed value.
  public Object remove( int index );

}//end interface ListInt
