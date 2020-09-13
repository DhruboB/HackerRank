package sorting.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,7,9,12};
        System.out.println(introTutorial(9,arr));
    }

    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
//        return searchBinaryRecursive(V, arr, 0, arr.length-1);
        return searchBinaryIterative(V, arr, 0, arr.length-1);
    }

    // Recursive Binary
    static int searchBinaryRecursive(int V, int[] arr, int low , int high){
        if(high >= low ){
            int mid = low + (high - low)/2;
            if(arr[mid] == V){
                return mid;
            }
            if(arr[mid] > V){
                return searchBinaryRecursive(V, arr, low, mid -1 );
            }
            return searchBinaryRecursive(V,arr, mid+1,high);
        }
        return -1;
    }

    // iterative Binary Search
    static int searchBinaryIterative(int V, int[] arr, int low ,int high){
        while (low <= high){
            int mid = (high - low)/2;
            if(arr[mid] == V){
                return mid;
            }
            if(arr[mid] < V){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

}
