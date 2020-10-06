package algorithm.hard;

import java.util.*;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        long[] arr = {3,3,9,9, 5};
        long modulo = 7; // 6
//        long[] arr = {1,2,3};
//        long modulo = 2; // 1
//        long[] arr = {1,5,9};
//        long modulo = 5; // 4

        System.out.println((maximumSum(arr, modulo)));
    }


//    Using modular arithmetic formula , M = modulo
//    (𝑎+𝑏)%𝑀=(𝑎%𝑀+𝑏%𝑀)%𝑀
//    (𝑎−𝑏)%𝑀=(𝑎%𝑀−𝑏%𝑀)%𝑀
//    𝑝𝑟𝑒𝑓𝑖𝑥[𝑛]=(𝑎[0]+𝑎[1]+...+𝑎[𝑛])%𝑀
//    𝑠𝑢𝑚𝑀𝑜𝑑𝑢𝑙𝑎𝑟[𝑖,𝑗]=(𝑝𝑟𝑒𝑓𝑖𝑥[𝑗]−𝑝𝑟𝑒𝑓𝑖𝑥[𝑖−1]+𝑀)%𝑀
    static long maximumSum(long[] arr, long modulo) {
        long curr = 0;
        long[] prefix = new long[arr.length];
        for(int i=0; i < arr.length ; i++) {
            curr = (arr[i] % modulo + curr) % modulo;
            prefix[i] = curr;
        }

        long maxSumModular = 0;
        outer: for(int i = 0; i < arr.length; i ++) {
            for (int j = i - 1; j >= 0; j--) {
                if(prefix[j] <= prefix[i]){
                    continue ;
                }
                maxSumModular = Math.max(maxSumModular, (prefix[i] - prefix[j] + modulo) % modulo);
                if(maxSumModular == modulo - 1){
                    break outer;
                }
            }
            maxSumModular = Math.max(maxSumModular, prefix[i]); // Don't forget sum from beginning.
        }
        return maxSumModular;
    }
}
