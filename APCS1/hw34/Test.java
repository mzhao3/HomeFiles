public class Test {
    public static void main(String[] args) {
	int[][] a2 = new int[8][9];
	populate(a2);
	printArray(a2);
    }
    public static void printArray(int[][]a2) {

	for( int [] c : a2) {
	    for (int x : c) {
		System.out.print(x);
	    }
	    System.out.println();
	}
    }
    public static void populate(int[][] a3) {
	int counter = 0 ;
	for (int a = 0; a < a3.length; a ++ ) {
	    for (int b = 0; b < a3[0].length; b ++) {
		a3[a][b] = counter;
		counter ++;
	    }
	}
    }
    public static void filling(int[][] a3) {
	// use *without* counter!
	
}

    
