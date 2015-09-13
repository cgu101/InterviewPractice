package sorting;

import java.util.Arrays;

/**
 * Created by connorusry on 9/12/15.
 */
public class SelectionSort {

    public static int[] doIt(int[] arr){
        int tempSwitch, tempHighest;

        //Start w/ last item...work your way down
        for(int loc = arr.length - 1; loc >=0; loc --){
            tempHighest = loc;

            for(int curr = loc; curr >= 0; curr--){
                if(arr[curr] > arr[tempHighest]){
                    tempHighest = curr;
                }
            }
            tempSwitch = arr[loc];
            arr[loc] = arr[tempHighest];
            arr[tempHighest] = tempSwitch;
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
