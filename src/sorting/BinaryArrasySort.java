package sorting;

import java.util.Arrays;

public class BinaryArrasySort {

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,1,0,0,1,0,1,0,0,0,0,1,0};
        sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortBinaryArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            while(arr[left] == 0) left++;
            while(arr[right] == 1) right--;
            if(left < right ) {
                swap(arr, left, right);
            }
        }
    }

    static void swap(int[] arr, int left, int right){
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }
}
