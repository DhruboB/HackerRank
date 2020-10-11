package interview.arrays;

import java.util.Arrays;

public class MinimumAbsDiffInArray {

    public static void main(String[] args) {
        int[] arr = {-1,5,-2,8,3,9};
        System.out.println(minimumAbsoluteDifference(arr));
    }

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        // sorting to compare in one go by checking minimum
        // O(NlogN)
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        for(int i=0; i < arr.length - 1; i++){
            int absValue = Math.abs(arr[i+1]-arr[i]);
            if( absValue < minAbs){
                minAbs = absValue;
            }
        }
        return minAbs;
    }
}
