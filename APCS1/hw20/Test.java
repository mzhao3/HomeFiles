public class Test{
    public static void countDown (int n){
	for ( int x = n; x > 0; x --){
	    System.out.println(x);
	}
	System.out.println("Countdown!");
    }
    public static void main (String [] args) {
	countDown(2);
	System.out.println(" \n =======================================");
	countDown(99);
	System.out.println(" \n =======================================");
	countDown(678);
	System.out.println(" \n =======================================");
	countDown(0);
	System.out.println(" \n =======================================");
	countDown(32);
	System.out.println(" \n =======================================");
	countDown(-22);
	System.out.println(" \n =======================================");
    }
    
}
