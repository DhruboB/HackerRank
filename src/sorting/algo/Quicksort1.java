package sorting.algo;

public class Quicksort1 {

    public static void main(String[] args) {
        int[] arr = {4,5,3,7,2,1,8,3};
        quickSort(arr);
    }

    static void quickSort(int[] arr){
        int pivot = arr[0];
        partition(arr, arr[0],0 , arr.length - 1);
//        printArray(arr);
    }

    static void partition(int[] arr, int pivot, int left, int right){
        for(int i=left+1; i <= right ; i++){
            if(arr[i] < pivot ){
                for(int j = i ; j > 0; j--) {
                    swap(arr, j, j-1);
                }
            }
            printArray(arr);
            System.out.println();
        }
    }

    static void printArray(int[] arr){
        for(int v: arr){
            System.out.print(v + " ");
        }
    }

    static void swap(int[] arr, int i , int j){
        if(i!=j) {
            arr[j] = arr[j] + arr[i];
            arr[i] = arr[j] - arr[i];
            arr[j] = arr[j] - arr[i];
        }
    }
}
