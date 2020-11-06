package algorithm;

import java.util.Arrays;

public class PermutingTwoArrays {

    public static void main(String[] args) {
        int k = 5;
        int[] A = {1,2,2,1};
        int[] B = {3,3,3,4};

        System.out.println(twoArrays(k,A,B));
    }

    // Complete the twoArrays function below.
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        for(int i=0; i < len ; i++){
            if(A[i] + B[ len - 1 - i] < k){
                return "NO";
            }
        }
        return "YES";
    }
}
