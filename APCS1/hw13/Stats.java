/*
  Maggie Zhao
  APCS1 pd02
  HW13- May ah Hahv S’maur, Please?  MORE!?!
  2017-10-07-F
*/

public class Stats{

    //MEANS ----------------------------      
    public static int mean(int a, int b) {
	/* the method, mean() takes two integer values, and returns the average (the sum of the values divided by the number of values, 2).
	   precondition: two integer inputs
	   postcondition: an integer value that is halfway between a and b
	*/
	int mean;
	mean = (a + b) / 2;
	return mean;
    }
    
    public static double mean(double a, double b){
	/* the method, mean() takes two double values, and returns the average (the sum of the values divided by the number of values, 2).                                
	   precondition: two double inputs
	   postcondition: a double value that is halfway between a and b         
	*/
	double mean;
	mean = ( a + b) / 2;
        return mean;
    }

    //MAX ----------------------------      
    
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
    
    public static double max(double a, double b){
	/* the method, max() takes two double values, and returns the greater of the two. If the two values are equal, it is returned.                        
           precondition: two double inputs                                    
           postcondition: one double, that is the larger of the two inputs                     
	*/
	if ( a >= b)
	    {
		return a;
	    } else {
            return b;
	}
    }
    
    public static int max (int a, int b, int c) {
	/* the method, max() takes three integer values, and returns the greatest of the three.
	   If the three values are equal, it is returned.                                                
           precondition: three integer inputs                                                  
           postcondition: one integer, that is the largest of the three inputs                 
        */
        int max = max(max(a,b), max(b,c));
	return max;
    }

    public static double max (double a, double b, double c) {
	/* the method, max() takes three float values, and returns the greatest of the three. I
	   f the three values are equal, it is returned.                                                  
           precondition: three float inputs                                                    
           postcondition: one float, that is the largest of the three inputs                   
	*/
	double max = max(max(a,b), max (b,c));
	return max;
    }
    
    //GEOMEANS ----------------------------

    public static int geoMean(int a, int b){
	/* the method, geoMean() takes two integer values, and finds the square root of the product. If the output is a float, it will return the floor of the float. Typecasting is necessary to change the float back to integer.
	   precondition: two integer inputs
	   postcondition: the geometric mean of the two numbers, as an integer
	*/
	double geoMean = (Math.sqrt( a *  b));
	return (int) geoMean;
    }
    
    public static int geoMean(int a, int b, int c) {
        /* the method, geoMean() takes three integer values, and finds the cube root of the pro
	   duct. If the output is a float, it will return the floor of the float. Typecasting is necessary
	   to change the float back to an integer.                                                       
           precondition: three integer inputs                                                  
           postcondition: the geometric mean of the three numbers, as an integer               
        */
        double geoMean = Math.pow((a*b*c), (1./3));
        return (int) geoMean;
    }
    
    public static double geoMean(double a, double b){
	/* the method, geoMean() takes two float values, and finds the square root of the product. Unlike the integer version of geoMean, the output of this method can be a float. 
           precondition: two integer inputs                                     
           postcondition: the geometric mean of the two numbers, as an integer
	*/
	double geoMean = (Math.sqrt( a * b)); 
	return geoMean; 
    }

    public static double geoMean(double a, double b, double c) {
        /* the method, geoMean() takes three float values, and finds the cube root of the produ
	   ct. Unlike the integer version of geoMean, the output of this method can be a float.          
           precondition: three float inputs                                                    
           postcondition: the geometric mean of the three numbers                              
	*/
        double geoMean = Math.pow((a*b*c), (1./3));
        return geoMean;
    }
    
}
