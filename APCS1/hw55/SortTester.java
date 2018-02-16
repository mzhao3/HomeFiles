// "You Might Belong in Gryffindor" -- Bing Li & Maggie Zhao
// APCS1 pd02
// HW53-- Solid Comparative Analysis
// 2017-12-13 W

/* ===============================================
class SortTester --
* Tests best and worst case scenarios for 
      bubbleSort, selectionSort, and insertionSort
=============================================== */ 
import java.util.ArrayList;

public class SortTester
{
    public static void main(String [] args) {
	//=============================================================
	//.oOo.oOo.oOo.oOo.oOo.oOo-- [BUBBLE SORT] --oOo.oOo.oOo.oOo.oOo.oOo.\\

	System.out.println(".oOo.oOo-- [BUBBLE SORT] --oOo.oOo.");

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/* 
	   The best case scenario for bubbleSort is an ArrayList that is already completely sorted. BubbleSort makes n-1 passes for each collection, but it only makes swaps as needed. An ArrayList that is already sorted would be the best case scenario because no swaps would be required on an array that is already in ascending order. Since no swaps are necessary, this type of arraylist would take the least memory to run.  
	 */
	ArrayList bestCaseBub = new ArrayList<Integer>();
	bestCaseBub.add(2);
	bestCaseBub.add(3);
	bestCaseBub.add(5);
	bestCaseBub.add(8);
	bestCaseBub.add(13);
	
	System.out.println("========= ~Best Case~ ========= ");
	System.out.println("Before sorting: " + bestCaseBub);
	MySorts.bubbleSort(bestCaseBub);
	System.out.println("After sorting: " + bestCaseBub);
	System.out.println();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*
	  The worst case for bubbleSort is when the ArrayList is sorted, but indescdending order. This set up requires the greatest amount of swaps to be made, as the largest and smallest elements are on the opposite side of their final resting place. To move these elements to their correct position, they have to be swapped with every other element in the ArrayList, thus maximizing the number of swaps possible. This method would use the most memory, thus making it the worst case scenario.
	 */

	
	ArrayList worstCaseBub = new ArrayList<Integer>();
	worstCaseBub.add(21);
        worstCaseBub.add(13);
	worstCaseBub.add(8);
        worstCaseBub.add(5);
        worstCaseBub.add(3);

	System.out.println("========= ~Worst Case~ ========= ");
        System.out.println("Before sorting: " + worstCaseBub);
        MySorts.bubbleSort(worstCaseBub);
        System.out.println("After sorting: " + worstCaseBub);
	System.out.println();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//=============================================================
	//.oOo.oOo.oOo.oOo.oOo-- [SELECTION SORT] --oOo.oOo.oOo.oOo.oOo.\\

	System.out.println(".oOo.oOo-- [SELECTION SORT] --oOo.oOo.");

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*
	  There is no distinction between the best and worst case scenario for selectionSort. Regardless of how sorted the ArrayList is, the greatest value of the array will be swapped, so that the amount of sorted elements increases by 1 for every pass. Even if the element is already in the correct position, it is "swapped" with itself. The maximum amount of swaps is achieved, regardless if the array is sorted or not, or in what order it is sorted in.  
	 */
	ArrayList bestCaseSel = new ArrayList<Integer>();
	bestCaseSel.add(2);
        bestCaseSel.add(3);
        bestCaseSel.add(5);
        bestCaseSel.add(8);
        bestCaseSel.add(13);
	
	System.out.println("========= ~Best Case~ ========= ");
        System.out.println("Before sorting: " + bestCaseSel);
        MySorts.selectionSort(bestCaseSel);
        System.out.println("After sorting: " + bestCaseSel);
	System.out.println();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	ArrayList worstCaseSel = new ArrayList<Integer>();
	worstCaseSel.add(21);
        worstCaseSel.add(13);
        worstCaseSel.add(8);
        worstCaseSel.add(5);
        worstCaseSel.add(3);
	
	System.out.println("========= ~Worst Case~ ========= ");
        System.out.println("Before sorting: " + worstCaseSel);
        MySorts.selectionSort(worstCaseSel);
        System.out.println("After sorting: " + worstCaseSel);
	System.out.println();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//=============================================================
        //.oOo.oOo.oOo.oOo.oOo-- [INSERTION SORT] --oOo.oOo.oOo.oOo.oOo.\\


        System.out.println(".oOo.oOo-- [INSERTION SORT] --oOo.oOo.");

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       
	/* 
	   Lke bubbleSort, the best case scenario for insertionSort is an already sorted array. InsertionSort works by taking unsorted elements and "walking" them down to their correct positions in relation to the elements that are already sorted. In an array that is already sorted, no swaps are necessary.
	 */
	ArrayList bestCaseIns = new ArrayList<Integer>();
        bestCaseIns.add(5);
        bestCaseIns.add(8);
        bestCaseIns.add(13);
        bestCaseIns.add(21);
        bestCaseIns.add(34);

	System.out.println("========= ~Best Case~ ========= ");
        System.out.println("Before sorting: " + bestCaseIns);
	MySorts.insertionSort(bestCaseIns);
        System.out.println("After sorting: " + bestCaseIns);
	System.out.println();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       
	/*
	  Again, like bubbleSort, the worst case scenario for insertionSort is an array that is sorted in descending order. Since each element (reading from left to right) is larger than the element to its right, it has to be swapped. An array sorted in descending order would maximize the number of swaps required, thus making it the worst case scenario in terms of efficiency. 
	 */
	ArrayList worstCaseIns = new ArrayList<Integer>();
	worstCaseIns.add(34);
        worstCaseIns.add(21);
        worstCaseIns.add(13);
        worstCaseIns.add(8);
        worstCaseIns.add(5);
	
	System.out.println("========= ~Worst Case~ ========= ");
        System.out.println("Before sorting: " + worstCaseIns);
	MySorts.insertionSort(worstCaseIns);
        System.out.println("After sorting: " + worstCaseIns);
	System.out.println();
    }
}
