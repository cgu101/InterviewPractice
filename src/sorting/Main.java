package sorting;

import java.util.*;

/**
 * Created by connorusry on 9/12/15.
 */
public class Main {
    public static void main (String[] args){
        Random rand = new Random();
        int[] unsorted = new int[10];
        for (int i = 0; i < unsorted.length; i++){
            unsorted[i] = rand.nextInt(10) + 1;
        }



        System.out.println("******InsertionSort******\n");
        checkCorrectness(unsorted, SelectionSort.doIt(unsorted.clone()));

        System.out.println("******SelectionSort******\n");
        checkCorrectness(unsorted, SelectionSort.doIt(unsorted.clone()));

        System.out.println("******BubbleSort*******\n");
        checkCorrectness(unsorted, BubbleSort.doIt(unsorted.clone()));

        System.out.println("******MergeSort******\n");
        checkCorrectness(unsorted, MergeSort.doIt(unsorted.clone()));

        System.out.println("******QuickSort******\n");
        checkCorrectness(unsorted, QuickSort.doIt(unsorted.clone()));
    }

    public static void checkCorrectness(int[] orig, int[] sorted){
        ArrayList<Integer> origList = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();

        for(int i = 0; i < orig.length; i++){
            origList.add(orig[i]);
            sortedList.add(sorted[i]);
        }
        Collections.sort(origList);

        System.out.println("\nCorrectly Sorted -->" + origList.equals(sortedList) + "\n\n");
        System.out.println("=======================\n=======================");

    }
}
