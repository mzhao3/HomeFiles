// chicken nuggets- Maggie Zhao & Kaitlin Wan
// APCS1 pd2
// HW #42:_Array of Grade 316_
// 2017-11-28 T 


/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10]; // allocates an array with enough memory for 10 integers
	_size = 0; // there are 0 significant numbers in the array
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
	String foo = "[";
	for( int i = 0; i < _size; i++ ) {
	    foo += _data[i] + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
	return foo;
    }


    //double capacity of SuperArray
    private void expand()
    {
	int[] temp = new int[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
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
	int temp = _data[index]; // gets the old value of the index and assigns it to a temp variable
	_data[index] = newVal; // sets the index to the input value
	if (_size <= index)
	    _size += 1; 
	return temp; // returns the old value
    }


    //adds an item after the last item
    public void add( int newVal )
    {
	if (_data.length == _size) // if the array is completely filled with significant digits
	    expand(); // double the capacity of the array
	_data[_size] = newVal; // set the first non-significant number to the new value
	_size += 1; // include this new value as a significant number
    }


    //inserts an item at index
    public void add( int index, int newVal )
    {
	int[] temp = new int[_data.length + 1]; // create a temp array with enough memory for one more integer
	for (int i = 0; i < index; i++) // for all values preceding the index
	    temp[i] = _data[i]; // copy those values into the temp array
	temp[index] = newVal;   // insert the item at the index
	for (int i = index; i < _data.length; i++) // for all values after the
	                                           // index
	    temp[i + 1] = _data[ i]; // shift each value in data to the next
	                             // spot over in the temp array

	_data = temp; // reassign _data to temp 
	_size += 1;   // include added value as a significant number 
	    
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index )
    {
      
	for(int i = index; i < _data.length ; i ++){ // for all values after
	                                             // the index
	    int temp = _data[index + 1]; // shift all values to the left by 1
	    _data[index] = temp;         // this will cover up the value at the
        }                                //  index

	int[] temp = new int[_data.length - 1]; // create a temp array with enough space for the original array with one value taken out
     
	_size -= 1; // remove the value as a significant number
    }


    //return number of meaningful items in _data
    public int size()
    {
	return _size; // returns the integer that stores the number of significant values
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
	    System.out.println("new length of underlying array: "
			       + curtis._data.length );

	  
	      }
	
	      SuperArray mayfield = new SuperArray();
	      System.out.println("Printing empty SuperArray mayfield...");
	      System.out.println(mayfield);

	      mayfield.add(5);
	      mayfield.add(4);
	      mayfield.add(3);
	      mayfield.add(2);
	      mayfield.add(1);
		  
	      System.out.println("Printing populated SuperArray mayfield...");
	      System.out.println(mayfield);

	      mayfield.remove(3);
	      System.out.println("Printing SuperArray mayfield post-remove...");
	      System.out.println(mayfield);
	      mayfield.remove(3);
	      System.out.println("Printing SuperArray mayfield post-remove...");
	      System.out.println(mayfield);

	      mayfield.add(3,99);
	      System.out.println("Printing SuperArray mayfield post-insert...");
	      System.out.println(mayfield);
	      mayfield.add(2,88);
	      System.out.println("Printing SuperArray mayfield post-insert...");
	      System.out.println(mayfield);
	      mayfield.add(1,77);
	      System.out.println("Printing SuperArray mayfield post-insert...");
	      System.out.println(mayfield);
		  	
/*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
	      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
	}//end main()


    }//end class
