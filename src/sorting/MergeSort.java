package sorting;

import java.util.Arrays;

/**
 * Created by connorusry on 9/12/15.
 */
public class MergeSort {

    private static int[] sendBack;

    public static int[] doIt(int[] arr){
        sendBack = arr.clone();

        mergeSort(sendBack);
        return sendBack;
    }
    private static void mergeSort(int[] backArray){
        //check if we only have a single value... then can start to merge
        if(backArray.length < 2) return;

        //Make two new arrays (left & right) of whatever the current Array holds (starts with unsorted Array)
        int middleIndex = backArray.length/2;
        int[] left = new int[middleIndex];
        int[] right = new int[backArray.length - middleIndex];

        for(int i = 0; i < middleIndex; i++){
            left[i] = backArray[i];
        }
        for (int i = middleIndex; i < backArray.length; i++){
            right[i -middleIndex] = backArray[i];
        }

        //sort left & right side...
        mergeSort(left);
        mergeSort(right);

        //combine left & right into the memory of the current backArray
        merge(left, right, backArray);
        sendBack = backArray;

    }

    //Merges the two halves arr[0-leftIndex) and arr[middle+1 - rightIndex)
    private static void merge(int[] left, int[] right, int[] backArray){
        int leftSize = left.length;
        int rightSize = right.length;

        int leftIndex = 0;  //index of smallest unpicked in left
        int rightIndex = 0;  //index of smallest unpicked in right
        int arrPosition = 0;  //index of current position in Array

        while(leftIndex < leftSize && rightIndex < rightSize){
            //if smallest unpicked in left is smaller than smallest unpicked in right...
            if(left[leftIndex] <= right[rightIndex]){
                backArray[arrPosition] = left[leftIndex];
                leftIndex++;
            }
            else{
                backArray[arrPosition] = right[rightIndex];
                rightIndex++;
            }
            arrPosition++;
        }

        //**ONLY ONE OF THE FOLLOWING TWO WHILE LOOPS WILL EXECUTE**

        //Copy the rest of the left side of the array into the target array
        while(leftIndex < leftSize){
            backArray[arrPosition] = left[leftIndex];
            leftIndex++;
            arrPosition++;
        }
        //Copy the rest of the right side into the target array
        while(rightIndex < rightSize){
            backArray[arrPosition] = right[rightIndex];
            rightIndex++;
            arrPosition++;
        }
        System.out.println(Arrays.toString(backArray));
    }
}
