/*
  The Krusty Krabs- Maggie Zhao & Kaitlin Wan
  APCS1 pd02
  HW19-- gcd 3 ways
  2017-10-18-F
*/

public class Stats{
    //MAX & MIN  ----------------------------      
    
    public static int max(int a, int b){
	/* the method, max() takes two integer values, and returns the greater of the two. If the two values are equal, it is returned. 
	   precondition: two integer inputs
	   postcondition: one integer, that is the larger of the two inputs
	*/
	if ( a >= b)
	    {
		return a;
	    } else {
	    return b;
	}
    }
    public static int min(int a, int b) {
	if ( a >= b)
            {
                return b;
            } else {
            return a;
        }
    }
    
    // Brute force method! Start with two variables, counter (defined as 1), and divisor. In the while loop, the counter will increase by 1 until it reaches the smaller of the two inputs. Each time, it will check if either a or b is divisible by the counter. If both inputs are divisible by the counter, that number becomes the greatest common divisor (GCD). It will continue in this manner until all numbers until the minimum are checked.
    public static int gcd( int a, int b ) {
	int counter = 1; 
	int divisor = 0;
	if ( a == 0 || b == 0) {
	    return max(a,b); // if either value is 0, return the other number
	}
	while (counter <= min(a,b)){
            if ((a % counter == 0) &&(b%counter == 0)){ //are both numbers divisible by the counter?
                divisor = counter; //if so, the new gcd is the counter
	    }
	    counter += 1; // add 1 to the counter, and try again!
	    
	}
	return divisor;	
    }
    // To find GCD in a loop, start with the maximum and minimum of the two inputs. If either of them are equal to 0, return the other. If the minimum divides the max evenly, return the min. If neither of the above statements are true, and while they remain untrue, take the remainder of the two numbers, and the smaller number. Repeat this until one of the numbers is equal to 0, or if kicked out of the while loop (if the max is divisible by the min, which is when you return min).
    public static int gcdEW (int a , int b) {
	int max = max (a,b);
	int min = min (a,b);

	if (a ==0 || b ==0 ){ // if either value is 0, return the other number 
	    return max;
	} 
	if (max%min == 0) {
	    return min;
	}
	else{
	    while (max % min != 0){
		min = max % min; //the new min is the remainder
		max = min(a,b); // the new max is the smallest of the two previous numbers
		if (max == 0) {
		    return min;
		}
		if (min == 0) {
		    return max;
		}
	    }
	    return min;
	}
    }// end gcdEW

    // To find the GCD recursively, define the max and min of the two numbers. If either number is equal to 0, the GCD is the other number. If the min divides max, min is the GCD. If neither of the above statements are true, take the difference of the two numbers. If the difference is equal to 0, that difference is the GCD. Otherwise, take the remainder of max and min, and min, and take the GCD of those two. 
    public static int gcdER(int a, int b){
	int max = max(a,b);
	int min = min(a,b);
  
	if ( a == 0 || b == 0) {
            return max(a,b); // if either value is 0, return the other number 
        }
	if (max % min == 0){
	    return  min;
	}
	else {
	    if (max % (max - min) == 0){
		return max - min;
	    }
	    else {
		return gcdER(max % min, min);
	    }
	}
    }// end gcdER
    public static void main (String [] args) {
	System.out.println("Now testing brute-force approach...");
	System.out.println(gcd(1, -1)); //1
	System.out.println(gcd(2, 27)); // 1
	System.out.println(gcd(81, 18)); //9
	System.out.println(gcd(26, 139)); //1
	System.out.println("\n ===========================================");
	System.out.println("Now testing Euclid's algorithm recursively...");
	System.out.println(gcdER(15,20)); //5
	System.out.println(gcdER(20,17)); //1
	System.out.println(gcdER(99,33)); //33
	System.out.println(gcdER(44, 33)); //11
	System.out.println("\n ===========================================");
	System.out.println("Now testing Euclid's algorithm in a loop...");
	System.out.println(gcdEW(12, 18)); //6
	System.out.println(gcdEW(18, 0)); //18
	System.out.println(gcdEW(110, 55)); //55
	System.out.println(gcdEW(45, 67)); //1
    }// end Stats
}   
