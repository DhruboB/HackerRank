package sorting.algo;

public class InsertionSortPart1 {

    public static void main(String[] args) {
//        int[] arr = {1,2,4,5,6,8,9,11,3};
        int[] arr = {2,4,6,8,14};
        sort(arr);
    }

    static void sort(int[] arr){
        int n = arr.length -1;
        int temp = arr[n];
        if(arr[n] > arr[n-1]){
            printArray(arr);
            return ;
        }
        temp = arr[n];
        int index = n -1;
        while(index >= 0) {
            arr[index + 1] = arr[index];
            if (arr[index] < temp) {
                arr[index+1] = temp;
                printArray(arr);
                break;
            }
            index--;
            printArray(arr);
        }
        if (index == -1) {
            arr[0] = temp;
            printArray(arr);
        }

//        for(int index = 0 ; index < n ; index++){
//            if(arr[index] > arr[n]){
//                arr[n] = arr[n] + arr[index];
//                arr[index] = arr[n] - arr[index];
//                arr[n] = arr[n] - arr[index];
//            }
//            for(int v: arr){
//                System.out.print(v+ " ");
//            }
//            System.out.println();
//        }
    }

    static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
