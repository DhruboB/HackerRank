package sorting.easy;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = {3,1,4,0,9,6,3,1,8,0,2,6,10,15,3,15,11,10};
        doCountSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void doCountSort(int[] arr){
        int size = arr.length;
        int k = Arrays.stream(arr).max().getAsInt();  // rangeMax
        int[] counts = new int[k+1];
        // counting number of occurrences in original arr and storing the value in counts at the index location
        for(int i=0; i < size; i++){
            ++counts[arr[i]];
        }
        // deriving correct position of the occurrences from counts array
        for(int i = 1 ; i < k+1 ; i++ ){
            counts[i] = counts[i] + counts[i-1];
        }
        // creating helper array to store sorted values.
        int[] helper = new int[size];
        for(int i = size - 1; i >= 0 ; i--){ // This is done from back due to preserve the order of same elements
            helper[--counts[arr[i]]] = arr[i];
        }

        // populating original arr from the sorted helper array.
        for(int i=0; i < size ; i++){
            arr[i] = helper[i] ;
        }
    }
}
