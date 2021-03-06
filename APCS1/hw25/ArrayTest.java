public class ArrayTest {
    public static boolean firstLast6 (int[] nums) {
	//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

	return ((nums[0] == 6) || (nums[ (nums.length - 1) ] == 6 ));
    }
    public static boolean commonEnd(int[]a, int[]b) {
	//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
	return ((a[0] == b[0]) || (b [b.length -1] == a [a.length - 1]));
    }
    public static boolean sameFirstLast(int[] nums) {
	//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

	return ((nums.length >= 1 ) && (nums[0] == nums[nums.length - 1] ));
}
    public static int [] makePi() {
	//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	int [] pinums;
	pinums = new int[3];
	pinums[0] = 3;
	pinums[1] = 1;
	pinums[2] = 4;
	return pinums;
    }
    public static int sum3(int[] nums) {
	//Given an array of ints length 3, return the sum of all the elements.
	return nums[0] + nums[1] + nums [2] ;
    }
    public static int[] rotateLeft3(int[] nums) {
	//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	int[] rotated ;
	rotated = new int[3];
	rotated[0] = nums[1];
	rotated[1] = nums[2];
	rotated[2] = nums[0];
	return rotated;
    }
    public static int[] reverse3 (int[] nums) { 
	//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	int[] reversed ;
	reversed = new int[3];
	reversed[0] = nums[2];
	reversed[1] = nums[1];
	reversed[2] = nums[0];
	return reversed;
    }

    public int[] maxEnd3(int[]nums) {
	//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
	int greatest = Math.max (nums[0], nums[2]);
	int[] same;
	same = new int[3];
	same[0] = greatest;
	same[1] = greatest;
	same[2] = greatest;
	return same;
    }
    public int sum2(int[] nums) {
	//Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
	if (nums.length >= 2) {
	    return nums[0] + nums[1];
	}
	else if (nums.length == 1) {
	    return nums[0];
	}
	else {
	    return 0;
	}
    }
    public int[] middleWay(int[] a, int[] b) {
	//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
	int[] middles;
	middles = new int[2];
	middles[0] = a[1];
	middles[1] = b[1];
	return middles;
    }

    public static int[] makeEnds(int[] nums){
	//Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
	int[] ends;
	ends = new int[2];
	ends[0] = nums[0];
	ends[1] = nums[nums.length - 1];
	return ends;
    }

    public static boolean has23(int[] nums) {
	//Given an int array length 2, return true if it contains a 2 or a 3.
	return ((nums[0] == 2) || (nums[0] == 3) || (nums[1] == 2) || (nums[1] == 3));
    }
    public static boolean no23(int[]nums) {
	//Given an int array length 2, return true if it does not contain a 2 or 3.
	return !((nums[0] == 2) || (nums[0] == 3) || (nums[1] == 2) || (nums[1]== 3));
    }
    public static int[] makeLast(int[] nums) {
	//Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
	int[] newnums;
	newnums = new int[(nums.length * 2)];
	// Make a new result array with double the length
	// Copy over the last element
	newnums[newnums.length - 1] = nums[nums.length - 1];
	return newnums;
	    
	}
    public boolean double23(int[] nums) {
	//Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    }
    
    /*
    public static void main (String [] args) {
	System.out.println (firstLast6([1, 2, 6]) );
	System.out.println (firstLast6([6, 1, 2, 3]));
	System.out.println (firstLast6([13, 6, 1, 2, 3]) );
    */
}
