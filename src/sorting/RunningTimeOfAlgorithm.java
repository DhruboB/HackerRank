package sorting;

public class RunningTimeOfAlgorithm {
    public static void insertionSort(int[] A){
        int counter = 0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >=0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
                counter++;
            }
            A[j + 1] = value;
        }
        System.out.println(counter);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1,2 };
        insertionSort(arr);
    }
}
