package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7};

        System.out.println(Arrays.toString(closestNumbers(arr)));

    }

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int smallestDiff  = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            int diff  = Math.abs(arr[i] - arr[i-1]);
            if(smallestDiff > diff){
                smallestDiff = diff;
            }
        }

        for(int i = 1; i < arr.length ; i++){
            int diff  = Math.abs(arr[i] - arr[i-1]);
            if(diff == smallestDiff){
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
