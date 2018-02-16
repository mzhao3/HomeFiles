/*
  Maggie Zhao
  APCS1 pd02
  HW13-- May ah Hahv S'maur, Please? MORE?!?!
  2017-10-07 F
*/

public class StatsDriver {

    public static void main (String [] args) {
	/* main method: tests the functionality of each method, whether or not it returns the correct primitive, and if it prints out with the preceding statement.
	 */

	// MEAN
	System.out.println("Now testing mean...");
	System.out.println("of INTEGERS");	
	System.out.println("The mean of integers a and b is " +Stats.mean(8, 14)+"." );//11
        System.out.println("The mean of integers a and b is " +Stats.mean(1, -9)+"." );// -4
	System.out.println("The mean of integers a and b is " +Stats.mean(-22, -35)+"."); //-28

	System.out.println("of FLOATS");	
	System.out.println("The mean of floats a and b is " + Stats.mean(8.0, 123.5)+".");//65.75
	System.out.println("The mean of floats a and b is " + Stats.mean(-22.765,-11.8) +".");//-17.2825
	System.out.println("The mean of floats a and b is " + Stats.mean(98.08, -22.13) +".");//37.975
	System.out.println("//-------------------------------");

	//MAX
	System.out.println("Now testing max..");
	System.out.println("of INTEGERS");	
	System.out.println("The max of integers a and b is " + Stats.max(10,10)+".");//10
	System.out.println("The max of integers a and b is " + Stats.max(10,15)+".");//15
	System.out.println("The max of integers a and b is " + Stats.max(-5, -23)+".");//-5
	System.out.println("The max of integers a and b is " + Stats.max(0, -789)+".");//0

	System.out.println("of FLOATS");	
	System.out.println("The max of floats a and b is " + Stats.max(12345.0, 2.0)+".");//12345.0
	System.out.println("The max of floats a and b is " + Stats.max(10.4, 10.4)+".");//10.4
	System.out.println("The max of floats a and b is " + Stats.max(-30.2, 1.276)+".");//1.276
	System.out.println("The max of floats a and b is " + Stats.max(-22.45, -9.42)+".");//-9.42

	System.out.println("Three numbers!-------");
	System.out.println("of INTEGERS");	
        System.out.println("The max of integers a, b and c is " + Stats.max(10,10,10)+".");//10      
        System.out.println("The max of integers a, b and c is " + Stats.max(10,10,15)+".");//15
        System.out.println("The max of integers a, b and c is " + Stats.max(-5, -23, -10)+".");//-5
        System.out.println("The max of integers a, b and c is " + Stats.max(2, 3, 3)+".");//3

	System.out.println("of FLOATS");	
        System.out.println("The max of floats a, b and c is " + Stats.max(10.4, 10.4, 10.4)+".");//10.4
        System.out.println("The max of floats a, b and c is " + Stats.max(-30.2, 1.276, 1.276)+".");//1.276
        System.out.println("The max of floats a, b and c is " + Stats.max(15.5, 7.75, 7.75)+".");//15.5
        System.out.println("The max of floats a, b and c is " + Stats.max(22.45, 34.56, 9.42)+".");//34.56
	System.out.println("//-------------------------------");
		
	//GEOMETRIC MEAN
	System.out.println("Now testing geometric mean...");
	System.out.println("of INTEGERS");	
	System.out.println("The geometric mean of integers a and b is " + Stats.geoMean(3, 4)+".");//3
	System.out.println("The geometric mean of integers a and b is " + Stats.geoMean(5, 5)+".");//5
	System.out.println("The geometric mean of integers a and b is " + Stats.geoMean(10, 23)+".");//15
	System.out.println("The geometric mean of integers a and b is " + Stats.geoMean(22, 3)+".");//0

	System.out.println("of FLOATS");	
	System.out.println("The geometric mean of floats a and b is " + Stats.geoMean(1.0, 1.0) + ".");// 1.0
	System.out.println("The geometric mean of floats a and b is " + Stats.geoMean(1.0, 1.9) + ".");// 1.378404875209022
	System.out.println("The geometric mean of floats a and b is " + Stats.geoMean(2.2, 2.2) + ".");//2.2
	System.out.println("The geometric mean of floats a and b is " + Stats.geoMean(209.76, 453.20) + ".");//308.323258934515

	System.out.println("Three numbers!-------");
	System.out.println("of INTEGERS");	
        System.out.println("The geometric mean of integers a, b and c is " + Stats.geoMean(3, 4, 10)+".");//4
        System.out.println("The geometric mean of integers a, b and c is " + Stats.geoMean(5, 5, 6)+".");//5
	System.out.println("The geometric mean of integers a, b and c is " + Stats.geoMean(10, -23, -9)+".");//12
        System.out.println("The geometric mean of integers a, b and c is " + Stats.geoMean(22, 3, 6)+".");// 7
	
	System.out.println("of FLOATS");	
	System.out.println("The geometric mean of floats a, b and c is " + Stats.geoMean(1.0, 1.0, 1.0) + ".");//1.0
        System.out.println("The geometric mean of floats a, b and c is " + Stats.geoMean(1.0, 1.9, 59.9) + "."); //4.84611230591469624
        System.out.println("The geometric mean of floats a, b and c is " + Stats.geoMean(2.2, 2.2, 2.2) + ".");//2.2
        System.out.println("The geometric mean of floats a, b and c is " + Stats.geoMean(209.76, 453.20, 3.2) + "."); //67.254423028851

	System.out.println("//-------------------------------");


    }
}
