// Maggie Zhao
// APCS1 pd2
// HW45-- In America, the Driver Sits on the Left
// 2017-12-03

/***************************
 * class SuperArray version 3.0
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 *
 * ...and now SuperArray complies with the specifications of the
 * List interface. (List.java must be in same dir as this file)
 ***************************/

public class SuperArray implements List
{
    private Object[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new Object[10]; //array type changed to object
	_size = 0;
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
	Object[] temp = new Object[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }


    //accessor -- return value at specified index
    public Object get( int index )
    {
	if (!( index < 0 || index >= size() )) // if the index is less than 0, or more than the number of significant numbers in the array, an IndexOutofBoundsException will be thrown.
	    return _data[index];
	else
	    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }
    

    //mutator -- set value at index to newVal,
    //           return old value at index
    public Object set( int index, Object object ) // set objects in the array
    {
	if (!( index < 0 || index >= size() )) {
	    Object temp = _data[index];
	    _data[index] = object;
	    return temp;
	}
	else
	    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }


    //adds an item after the last item
    public boolean add(Object object )
    {
	add( _size, object );
	return true;
    }


    //inserts an item at index
    public void add( int index, Object object )
    {
	//first expand if necessary
	
	if ( _size >= _data.length )
	    expand();
	if (!( index < 0 || index > size() )) {
	    for( int i = _size; i > index; i-- ) {
		_data[i] = _data[i-1]; //each slot gets value of left neighbor
	    }
	    _data[index] = object;
	    _size++;
	}
	else
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    //returns removed value
    public Object remove( int index )
    {
	if (!( index < 0 || index >= size() )) {
	    Object retObj = _data[index];
	    for( int i = index; i < _size - 1; i++ ) {
		_data[i] = _data[i+1];
	    }
	    _size--;
	    return retObj;
	}
	else
	    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
      
    }


    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }



    //main method for testing
    public static void main( String[] args )
    {
	List mayfield = new SuperArray();
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
	//uncomment to view this error
	//mayfield.remove(8);
        //System.out.println("Printing SuperArray mayfield post-remove...");
        //System.out.println(mayfield);
	
	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	//uncomment to view this error
	//mayfield.add(7,22);
        //System.out.println("Printing SuperArray mayfield post-insert...");
        //System.out.println(mayfield);

	//uncomment to view this error
	//System.out.println("The item at index 13 is" + mayfield.get(13));
	System.out.println("The item at index 2 is" + mayfield.get(2));

	mayfield.set(1, "chicken");
	System.out.println("Printing SuperArray mayfield post-set");
	System.out.println(mayfield);
	mayfield.set(3, 4.23456);
        System.out.println("Printing SuperArray mayfield post-set");
	System.out.println(mayfield);
	//uncomment to view this error
	//mayfield.set(13, "nugget");
        //System.out.println("Printing SuperArray mayfield post-set");
	//System.out.println(mayfield);
	/*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
    }//end main()


}//end class
    
/***                                                                        
             ,,########################################,,                   
          .*##############################################*                 
        ,*####*:::*########***::::::::**######:::*###########,              
      .*####:    *#####*.                 :*###,.#######*,####*.            
     *####:    *#####*                      .###########*  ,####*           
  .*####:    ,#######,                        ##########*    :####*         
  *####.    :#########*,                       ,,,,,,,,.      ,####:       
    ####*  ,##############****************:,,               .####*          
     :####*#####################################**,        *####.
       *############################################*,   :####: 
        .#############################################*,####*  
          :#####:*****#####################################.    
            *####:                  .,,,:*****###########,      
             .*####,                            *######*       
               .####* :*#######*               ,#####*        
                 *###############*,,,,,,,,::**######,           
                   *##############################:            
                     *####*****##########**#####*               
                      .####*.            :####*                
                        :####*         .#####,                  
                          *####:      *####:                    
                           .*####,  *####*                      
                             :####*####*                        
                               *######                          
                                 *##                                                                                           
         -Miranda Chaiken '16                                               
                                
         ***/
