package sorting.medium;

import java.util.Arrays;

public class FraudulentActivityNotifications {

    public static void main(String[] args) {
        int[] expenditure = {2,3,4,2,3,6,8,4,5};
        int day = 5; // 2
//        int[] expenditure = {1,2,3,4,4};
//        int day = 4; // 0
//        int[] expenditure = {10,20,30,40,50};
//        int day = 3; // 1
        System.out.println(activityNotifications(expenditure, day));
    }

    static int activityNotifications(int[] expenditure, int d) {

        if(d <= 0) return 0;
        if(expenditure.length <= d) return 0;

        int count = 0;
        for(int i = d; i < expenditure.length; i++){
            float median = findMedium(expenditure, i - d, i-1);
            if( expenditure[i] >= 2 * median ) {
                count++;
            }
        }
        return count;
    }

    static float findMedium(int[] expenditure,int low, int high){
        if(low == 0) {
            int[] helper = new int[expenditure.length];
            mergeSort(expenditure, helper, low, high);
        }else{
            customSort(expenditure, low, high);
        }

        if ((high - low + 1) % 2 == 1){
            return expenditure[(low + (high-low)/2 )];
        } else{
            return (float)((expenditure[low + (high-low)/2 ] + expenditure[low + (high-low)/2 + 1]) / 2.0);
        }
    }

    static void mergeSort(int[] arr,int[] helper, int low, int high ){
        if(low < high){
            int middle = (high+low)/2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    static void merge(int[] arr,int[] helper, int low, int middle, int high){
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

    static void customSort(int[] expenditure, int low , int high){
        for(int i = 0; i < expenditure.length ; i++) {
            if (expenditure[i] > expenditure[high]) {
                for(int j = i; j < expenditure.length; j++) {
                    swap(expenditure, i, high);
                    i++;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
