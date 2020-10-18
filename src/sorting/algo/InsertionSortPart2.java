package sorting.algo;

public class InsertionSortPart2 {

    public static void main(String[] args) {
//        int[] arr = {1,2,4,5,6,8,9,11,3};
//        int[] arr = {9,4,3,6, 1,7, 5, 2};
//        int[] arr = {3,4,7,5,6,2,1};
        int[] arr = {9,8,10,3,4,7,5,6,2,1};
        for(int i = 1 ; i < arr.length; i++) {
            sort(arr, 0, i);
            printArray(arr);
        }
    }

    static void sort(int[] arr , int start, int end){
        int n = end;
        int temp = arr[n];
        if(arr[n] > arr[n-1]){
            return ;
        }
        temp = arr[n];
        int index = n - 1;
        while(index >= start) {
            arr[index + 1] = arr[index];
            if (arr[index] < temp) {
                arr[index+1] = temp;
                break;
            }
            index--;
        }
        if (index == start -1) {
            arr[start] = temp;
        }
    }

    static void swap(int[] arr, int i , int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
