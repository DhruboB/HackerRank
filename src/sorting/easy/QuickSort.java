package sorting.easy;

public class QuickSort {

    public static void main(String[] args) {
        //        int arr[] = {10, 7, 8, 9, 1, 5,11};
        int arr[] = {10, 7, 8, 9, 1, 5, 1000987,15678,3,199984,65};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array >");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int v: arr)
            System.out.print(v + " ");
        System.out.println();
    }

    static void sort(int[] arr,int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            sort(arr, low , pivotIndex - 1);
            sort(arr, pivotIndex + 1 , high);
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int index = low - 1;

        for(int j = low; j < high ; j++){
            if(arr[j] < pivot){
                index++;
                swap(arr, j, index);
            }
        }
        swap(arr, index + 1, high);
        return index + 1;
    }

    static void swap(int[] arr, int i , int j){
        if(i!=j) {
            arr[j] = arr[j] + arr[i];
            arr[i] = arr[j] - arr[i];
            arr[j] = arr[j] - arr[i];
        }
    }
}