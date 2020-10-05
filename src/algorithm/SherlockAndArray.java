package algorithm;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

    public static void main(String[] args) {
//        Integer[] arr = {1, 1, 4, 1, 1};
        Integer[] arr = {2,0,0,0};
        System.out.println(balancedSums(Arrays.asList(arr)));
    }

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        String NO_MATCH = "NO", MATCH = "YES";
        int size = arr.size();
        if (size <= 1) {
            return MATCH;
        }
        if (size == 2) {
            return NO_MATCH;
        }
        int sum = 0;
        int j = 0;

        int[] sums = new int[size];
        for (Integer i : arr) {
            sum += i;
            sums[j++] = sum;
        }
        System.out.println(Arrays.toString(sums));
        for (int i = 0; i < size; i++) {
            if ((sums[size - 1] - sums[i]) == (sums[i] - arr.get(i))) {
                return MATCH;
            }
        }
        return NO_MATCH;
    }
}
