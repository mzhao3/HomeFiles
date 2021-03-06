/*
  Maggie Zhao
  APCS1 pd02
  HW22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
  2017-10-24
 */
/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *          9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: 
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
      // If the letter is in the string, w, the index will be a number that is not -1. If the letter is in the string, the statement below will return true.
      return (w.indexOf(letter) != -1 );

  }//end hasA()

    
  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
      // If the letter is in the string, VOWELS, (if the letter is a vowel), the index will be a number that is not -1. If the letter is a vowel, the statement below will return true. 
      return (VOWELS.indexOf(letter) != -1 ) ;
      
  }//end isaVowel()


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      // Checks each letter in the string to see if it is a vowel. If the letter is a vowel, the counter goes up by one. 
      int counter = 0;
      for (int x = 0; x < w.length(); x+= 1){
	  if (isAVowel(w.substring( x, x + 1))) {
	      counter = counter + 1;
	  }
      }
      return counter;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
      // Checks each letter in the string to see if it is a vowel. If the letter is a vowel, return true.
      return countVowels(w) > 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
      // Checks each letter in the string to see if it is a vowel. If the letter is a vowel, add it to a result string.
      String restr = "";
      for (int x = 0; x < w.length(); x += 1){
          if (isAVowel(w.substring( x, x + 1))) {
              restr  =	restr + w.substring(x, x + 1);
          }
      }
      return restr;
  }


  public static void main( String[] args ) 
  {
    /* YOUR TEST CALLS HERE */
      System.out.println("Now testing hasA();");
      System.out.println(hasA("cat", "a")); //true
      System.out.println(hasA("cat", "p")); //false
      System.out.println("/------------------------------------- \n");

      System.out.println("Now testing isAVowel();");
      System.out.println(isAVowel("a")); //true
      System.out.println(isAVowel("z")); //false
      System.out.println(isAVowel("e")); //true
      System.out.println(isAVowel("x")); //false
      System.out.println("/------------------------------------- \n");

      System.out.println("Now testing countVowels():");
      System.out.println(countVowels("meatball")); //3
      System.out.println(countVowels("gargantuan")); //4
      System.out.println(countVowels("nymph")); //0
      System.out.println("/------------------------------------- \n");

      System.out.println("Now testing hasAVowel();");
      System.out.println(hasAVowel("cat")); //true
      System.out.println(hasAVowel("zzz")); //false
      System.out.println(hasAVowel("slavery")); //true
      System.out.println(hasAVowel("myth")); //false
      System.out.println("/------------------------------------- \n");
      
      System.out.println("Now testing allVowels();");
      System.out.println(allVowels("meatball")); //"eaa"
      System.out.println(allVowels("flibber")); //"ie"
      System.out.println(allVowels("lunchbox")); //"uo"
      System.out.println(allVowels("outrageous")); //"ouaeou"
     
      
  }//end main()

}//end class Pig
