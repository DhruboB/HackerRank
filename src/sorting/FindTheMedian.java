package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTheMedian {

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,6,5,3};
        System.out.println(findMedian(arr));
    }

    // Complete the findMedian function below.
    static int findMedian(int[] arr) {
        int len  = arr.length;
        int[] helper = new int[len];
        int max = Arrays.stream(arr).max().getAsInt();
        int[] counts = new int[max+1];
        for(int i = 0 ; i < len ; i++){
            counts[arr[i]]++;
        }

        for(int i = 1 ;  i< max ; i++ ){
            counts[i] += counts[i-1];
        }

        for(int i = len-1 ;  i>=0 ; i-- ){
            helper[--counts[arr[i]]] = arr[i];
        }

        for(int i = 0 ;  i< len ; i++ ){
            arr[i] = helper[i];
        }

        System.out.println(Arrays.toString(arr));

        return arr[len/2];
    }
}
