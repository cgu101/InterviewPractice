package sorting;

import java.util.Arrays;

/**
 * Created by connorusry on 9/12/15.
 */
public class QuickSort {
    private static int[] backArray;

    public static int[] doIt(int[] arr){

        backArray = arr;
        quickSort(backArray, 1, arr.length - 1);
        return  backArray;

    }
    private static void quickSort(int[] arr, int start, int end){
        //If segment is invalid (no element left or right of the returned pivot)
        // or only 1 element in segment, then we exit
        if(start >= end){
            return;
        }
        int pivot = partition(arr, start, end); //Pivot always assigned to the right most element
        quickSort(arr, start, pivot - 1); // sort left side...constantly decreasing pivot size
        quickSort(arr, pivot + 1, end);

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; //pivot is always A[end]
        int partitionIndex = start; //scans from start to end - 1

        //At any point, all values < partitionIndex will be less than pivot
        //Go from left or current array to pivot - 1 location (since the pivot value is far right)
        for(int checkIndex = start; checkIndex < end; checkIndex++){
            if(arr[checkIndex] <= pivot){
                int temp = arr[checkIndex];
                arr[checkIndex] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }

        //Put the pivot in the right place (where partition index is)
        int temp = arr[partitionIndex];
        arr[partitionIndex] = pivot;
        arr[end] = temp;
        System.out.println(Arrays.toString(backArray));
        return partitionIndex;
    }
}
