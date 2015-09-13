package sorting;

import java.util.Arrays;

/**
 * Created by connorusry on 9/12/15.
 */
public class BubbleSort {

    public static int[] doIt(int[] arr){
        int temp;
        boolean swapCalled = true;

        //Until you can run through the list without performing a SWAP
        while(swapCalled == true){
            swapCalled = false;

            //Check in pairs... if the first variable is larger SWAP
            for(int loc = 1; loc < arr.length; loc++){
                if(arr[loc -1] > arr[loc]){
                    temp = arr[loc-1];
                    arr[loc-1] = arr[loc];
                    arr[loc] = temp;
                    swapCalled = true;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
