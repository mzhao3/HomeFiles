/* 
   Maggie Zhao
   APCS1 pd02
   HW25 -- All Hallow's Eve Getting Real Spooky Out Here      
   2017-10-31
*/

public class Loopier { 
    public static void populate (int[] a) {
	//A static method to populate an existing array with randomly generated ints.
	for (int x = 0; x < a.length; x += 1 ) {
	    a[x] = (int)( Math.random() * 100) ;    
	}
	
    }
    public static String stringArray (int[] nums) {
	//A static method to return a String version of an array of ints.
	String stringArray = "[";
	for (int x = 0; x < nums.length; x += 1) {
	    stringArray = stringArray + nums[x] + ", ";
	}
	stringArray = stringArray.substring(0, stringArray.length() - 3) + "]";
	return stringArray;	
    }

    public static int linSearch( int[] a, int target) {
	//A static, iterative implementation of a linear search function that will return the index of the first occurrence of a target in an existing array, or -1 if not found.
	int occurrence = -1;
	for (int x = 0; x < a.length; x += 1) {
	    if (a[x] == target) {
		occurrence = x;
	    }
	}
	return occurrence;
    } // end linSearch

    public static int linSearchR (int[] a, int target ) {
	//A static, recursive implementation of a linear search function that will return the index of the first occurrence of a target in an existing array, or -1 if not found.
	int index = -1;
	if (linSearch(a, target) == -1) {
	    return -1;
	}
	if (a[0] == target) {
	    index = 0;
	}
	else {
	    int[] newA = new int[a.length - 1];
	    for (int x = 0; x < a.length - 1; x += 1) {
		// initialization: int x, equal to 0, counts the indices
		// a.length - 1 is up to the second to last element of the array
		// x increases by 1 for each iteration
		newA[x] = a[ x + 1];
		    // the newa array will contain all of the a array except the element at index 0
		    }// end of for loop
	    index = linSearchR(newA, target) + 1;
	} // end of if statement
	return index; 
    }
    
    public static int freq (int[] a, int target ) {
	//A static, iterative implementation of a frequency function that will return the number of occurrences of a target in an existing array.
	int counter = 0;
	for (int x = 0; x < a.length; x += 1) {
	    if (a[x] == target ) {
		counter = counter + 1;
	    }
	}
	return counter;
    }// end freq

    public static int freqRec (int[] a, int target) {
	//A static, recursive implementation of a frequency function that will return the number of occurrences of a target in an existing array.
	int counter = 0;
	if (a.length == 0) {
	    return 0; // if there is no more of the array left, the frequency can only be 0. The recursion ends.
	}
	if (a[0] == target) {
	    counter = counter + 1;
	} // if the first element is equal to the target, add 1 to the counter
	int[] newA = new int[a.length-1]; // create a new array, excluding the first element ( which has already been checked to see if it matches) 
        for (int x = 0; x < a.length - 1; x+= 1) {
            newA[x] = a[x+1];
	}
	return counter + freqRec(newA, target) ; //take the existing counter, and add that to the counter of a new recursion- the one with the shortened array
    }

	


						 
    public static void main (String[] args) {
	System.out.println("Testing- Populating an Array and Turning it Into a String ");
	int[] thisArray;
	thisArray = new int[10];
	populate(thisArray);
	System.out.println(stringArray(thisArray));

	//linSearch Test Cases:
	int[] array1 = { 76, 89, 40, 61, 11, 49, 19, 98, 86, 21, 100 } ;
	System.out.println("Testing linSearch [iterative] ---------------------");
	System.out.println(linSearch(array1, 49)); // 5
	System.out.println(linSearch(array1, 89)); // 1
	System.out.println(linSearch(array1, 33)); // -1
	System.out.println("\n");
	
	//linSearchR Test Cases:
	System.out.println("Testing linSearchR [recursive] ---------------------");
	System.out.println(linSearchR(array1, 19)); // 6
	System.out.println(linSearchR(array1, 21)); // 9
	System.out.println(linSearchR(array1, 50)); // -1
	System.out.println("\n");

	
	//freq Test Cases:
	int[] array2 = {87, 96, 36, 73, 35, 27, 12, 5, 37, 11, 57, 37, 37, 37, 96, 87 };

	System.out.println("Testing freq [iterative]  ---------------------");
	System.out.println(freq(array2, 22)); // 0
	System.out.println(freq(array2, 37)); // 4
	System.out.println(freq(array2, 87)); // 2
	System.out.println("\n");

	//freqRec Test Cases:
	System.out.println("Testing freq [recursive]  ---------------------");
	System.out.println(freqRec(array2, 22)); // 0
	System.out.println(freqRec(array2, 37)); // 4
	System.out.println(freqRec(array2, 87)); // 2
    }
}// end Loopier
