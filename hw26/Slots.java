/*****************************************************
 * Maggie Zhao
 * APCS1 pd02
 * HW26 -- Spin Class
 * 2017-11-07

 * class Slots
 * simulates a slot machine in your very own terminal
 *****************************************************/

public class Slots
{

  private static final String[] FRUITS = {
    "lime", "lime", "lime", 
    "lemon", "lemon", "lemon", 
    "cherry", "cherry", "cherry", 
    "orange", "orange", "orange", 
    "grapefruit", "grapefruit", "grapefruit", 
    "tangerine", "tangerine", "tangerine", 
    "ugli", "ugli", "ugli",
    "peach", "peach", "peach"
  };
  
  private String[] _fruits; //to be init'd by each instance


  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public Slots()
  {
    //allocate memory for _fruits based on size of FRUITS:
      _fruits = new String[FRUITS.length];

      //copy elements of FRUITS into _fruits:
      for (int x = 0; x < FRUITS.length; x ++) {
	  _fruits[x] = FRUITS[x];
      }
 
  }


  /*=====================================
    String toString() -- overrides inherited toString()
    pre:  
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString()
  {

      String retStr = "\n=============== SLOT MACHINE ===============";
      retStr += "\nSlot 1: \t Slot 2: \t  Slot 3: \t";
      retStr += "\n" + _fruits[0] + "\t\t" + _fruits[1] + "\t\t" + _fruits[2] + "\t\t";
      retStr += "\n============================================ \n";
      return retStr;
  }


  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
  private void swap( int i, int j )
  {
      String temp = _fruits[i];
      _fruits[i] = _fruits[j];
      _fruits[j] = temp;
  }


  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
  {
    /* For each element in the _fruits array, two random elements will be switched. */
      
      int fruit = _fruits.length;
      for ( int x = 0; x < fruit ; x ++ ) {
	  swap((int)(Math.random() * fruit), (int)(Math.random() * fruit));
      }

  }

    
    public boolean doesEqual(int x, int y)
    {
	/* Helper function: are elements x and y of _fruits equal?  */
	return (_fruits[x].equals(_fruits[y]));
    }
    
  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
      /* Checks if the first three elements are equal to each other. If the elements at 0 and 1, and 1 and 2 are equal, then all of the elements are equal (transitive property). */
      return (doesEqual(0, 1) && doesEqual(1, 2)); 
  }


  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct, 
    false otherwise
    =====================================*/
  public boolean miniWin()
  {
    /* Checks if there is a jackpot, or if none of the elements are equal to each other (the elements are mutually distinct). */
      return ( jackpot() || (!(doesEqual(0,1)) || (doesEqual(1,2)) || (doesEqual(0,2)) ));
  }


  //main() method for testing
  public static void main( String[] args )
  {
    //usage: move bar below down 1 line at a time to test functionality...
   
      Slots machine01 = new Slots();
      Slots machine02 = new Slots();

      //test to verify slot machines function indepently
      System.out.println();
      System.out.println( "Machine01 initial state:\t" + machine01 );
      System.out.println( "Machine02 initial state:\t" + machine02 );

      System.out.println( "\nSpinning machine01...\n" );

      machine01.spinOnce();

      System.out.println();
      System.out.println( "Machine01 state:\t" + machine01 );
      System.out.println( "Machine02 state:\t" + machine02 );
      System.out.println();

      
      //test gamble-until-you-win mechanism

      System.out.println( "Preparing to spin until a mini win! . . ." );
      System.out.println( "------------------------------------" );

      //if you haven't won, spin again until you win!
      while( machine01.miniWin() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
      }
      
      System.out.println( "====================================" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "WIN\n" );

      System.out.println("--+--+--+--+--+--+--+--+--+--+--+--+--+--");

      System.out.println( "Preparing to spin until...jackpot! . . ." );
      System.out.println( "------------------------------------" );

      //if you haven't won, spin again until you win!
      while( machine01.jackpot() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
      }
      
      System.out.println( "==========================================" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "JACKPOT!\n" );
 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Slots
