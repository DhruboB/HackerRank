package sorting.algo;

public class Countingsort2 {

    public static void main(String[] args) {
//        int[] arr = {1,1,3,2,1};
        int[] arr = {63,54,17,78,43,70,32,97,16,94,74,18,60,61,35,83,13,56,75,52,70,12,24,37,17,0,16,64,34,81,82,24,69,2,30,61,83,37,97,16,70,53,0,61,12,17,97,67,33,30,49,70,11,40,67,94,84,60,35,58,19,81,16,14,68,46,42,81,75,87,13,84,33,34,14,96,7,59,17,98,79,47,71,75,8,27,73,66,64,12,29,35,80,78,80,6,5,24,49,82};
        printArray(countingSort(arr));
    }

    static int[] countingSort(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        int[] temp = new int[max+1];
        for(int i = 0; i < arr.length ; i++){
            temp[arr[i]] = temp[arr[i]] + 1;
        }
        return sortPrint(temp,arr);
    }

    static int[] sortPrint(int[] countArray, int[] arr){
        int counter  = 0;
        for(int i = 0 ; i < countArray.length; i++){
            if(countArray[i] > 0){
                for(int j=0 ; j < countArray[i] ; j++) {
                    arr[counter++] = i;
                }
            }
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int v: arr){
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
