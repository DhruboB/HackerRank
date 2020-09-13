package warmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class _8MiniMaxSum {

    public static void main(String[] args) {

//        int arr[] = new int[]{1,2, 3, 4, 5};
//        int arr[] = new int[]{7,69, 2, 221, 8974};
        int arr[] = new int[]{9,0, -1, 0, -5};

        IntStream ints  = Arrays.stream(arr).sorted();
        arr = ints.toArray();
        long sumMax = 0;
        long sumMin = 0;
        for(int i = 0; i <  arr.length ; i++){
            if( i != 0) {
                sumMax += arr[i];
            }
            if( i != arr.length - 1 ){
                sumMin += arr[i];
            }
        }
        System.out.println(sumMin + " " + sumMax);
    }
}
