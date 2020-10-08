package interview.arrays;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,1,9,3,5};
        int d = 3;
        System.out.println(Arrays.toString(rotLeft(arr,d)));
    }

    static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int[] helper = new int[len];
        int shiftedMaxIndex = len - 1 - d;
        for(int i = len -1; i >=0 ; i-- ){
            if( shiftedMaxIndex >= 0) {
                helper[shiftedMaxIndex--] = a[i];
            }
            if(i < d ){
                helper[len-- - 1] = a[i];
            }
        }
        return helper;
    }
}
