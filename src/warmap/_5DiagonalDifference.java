package warmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class _5DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0, sum2 = 0;
        int j = arr.size() - 1;
        for(int i=0; i < arr.size() ; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(j).get(i);
            j--;
        }
        return Math.abs(sum1 - sum2);
    }


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11,2,4);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(10,8,-12);
        List<List<Integer>> arr = Arrays.asList(list1,list2,list3);
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
