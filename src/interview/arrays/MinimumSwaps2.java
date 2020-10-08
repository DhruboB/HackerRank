package interview.arrays;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        int[] arr = {7,1,3,2,4,5,6};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0 ; i < arr.length ; i++){
            while(arr[i]-1 != i){
                swap(arr, arr[i]-1, i);
                count++;
            }
        }
        return count;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
