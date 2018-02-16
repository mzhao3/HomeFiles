// Maggie Zhao
// APCS1 pd02
// HW46-- Al<B> Sorted!.
// 2017-12-04 M

import java.util.ArrayList;


public class ALTester {


    public static void populate (ArrayList<Comparable> a) {
	//A static method to populate an existing array with randomly generated ints.
	for (int x = 0; x < 23; x += 1 ) {
	    a.add((int)( Math.random() * 100) ) ;    
	}
    }

    public static void populate2 (ArrayList<Comparable> a) {
	//A second static method to populate an existing array, but with their respective indices.
	for (int x = 0; x < 23; x += 1 ) {
            a.add(x);
        }
    }

    public static boolean sorted (ArrayList<Comparable> a) {
	boolean sorted = true;
	for (int x = 0; x < a.size() - 1; x += 1){
	    sorted = sorted && (a.get(x).compareTo(a.get(x+1))<=0);
	} //If the first int (x) is smaller than or the same as the second int (x+1), compareTo() will return a negative number or 0. If an array is sorted, each number is smaller or equal to the next.
	return sorted;
    }
    


    public static void main(String[] args)
    {
	//Testing a randomly populated array.
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	populate(foo);
	System.out.println(foo);
	System.out.println(sorted(foo));

	//Testing an array that is sorted.
	ArrayList<Comparable> goo = new ArrayList<Comparable>();
	populate2(goo);
	System.out.println(goo);
	System.out.println(sorted(goo));
    }
}
