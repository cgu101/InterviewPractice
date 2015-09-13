package sorting;

import java.util.Arrays;

/**
 * Created by connorusry on 9/12/15.
 */
public class InsertionSort {

    public static int[] doIt(int[] arr) {
        int curr, loc, temp;

        //Start at the 1st position compare to 0th...2nd compared to 1st & Oth..etc.
        for(int i = 1; i <= arr.length -1; i++){
            curr = arr[i];  //value you're comparing
            loc = i-1;

            while(loc >= 0 && arr[loc] > curr){
                temp = arr[loc];
                arr[loc] = curr;
                arr[loc+1] = temp;
                loc--;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
