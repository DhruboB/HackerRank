package sorting.algo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String... args){

        int[] arr = {2,4,7,4,3,9,1,5,7,8,2,10,1,3};
        int[] helper = new int[arr.length];
        mergeSort(arr, helper,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int[] helper, int low,int high){
        if(low < high ){
            int middle = (low + high)/2;
            // merging left half of the array from middle position
            mergeSort(arr, helper, low, middle);
            // merging right half of the array from middle position
            mergeSort(arr,helper, middle+1,high);
            // merging the above two array and making the merged array as sorted
            merge(arr,helper, low, middle, high);
        }
    }

    private static void merge(int[] arr, int[] helper, int low , int middle, int high){
        // copying all the elements from arr to helper array within the low to high range
        // note, it is a recursive call and low and high vale will always vary
        for(int i = low ; i <= high ; i++){
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        // Doing merging from helper to original arr, considering either leftIndex element if smaller than element at right index, otherwise copying
        // element at right index as it is smaller
        while( helperLeft <= middle && helperRight <= high){
            if(helper[helperLeft] <= helper[helperRight]){
                arr[current] = helper[helperLeft];
                helperLeft++;
            }else{
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        // Copying remaining elements in left half of middle portion
        // No need to copy right remaining elements as those are already copied earlier from original to helper and stayed as is
        for(int i = 0; i <= middle - helperLeft; i++){
            arr[current+i] = helper[helperLeft+i];
        }
    }
}
