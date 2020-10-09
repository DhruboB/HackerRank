package algorithm.hard;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        long[] arr = {3, 3, 9, 9, 5};
        long modulo = 7; // 6
//        long[] arr = {1,2,3};
//        long modulo = 2; // 1
//        long[] arr = {1,5,9};
//        long modulo = 5; // 4

        System.out.println((getMaximumSum(arr, modulo)));
    }

//    Using modular arithmetic formula , M = modulo
//    (𝑎+𝑏)%𝑀=(𝑎%𝑀+𝑏%𝑀)%𝑀
//    (𝑎−𝑏)%𝑀=(𝑎%𝑀−𝑏%𝑀)%𝑀
//    𝑝𝑟𝑒𝑓𝑖𝑥[𝑛]=(𝑎[0]+𝑎[1]+...+𝑎[𝑛])%𝑀
//    𝑠𝑢𝑚𝑀𝑜𝑑𝑢𝑙𝑎𝑟[𝑖,𝑗]=(𝑝𝑟𝑒𝑓𝑖𝑥[𝑗]−𝑝𝑟𝑒𝑓𝑖𝑥[𝑖−1]+𝑀)%𝑀
//    Still O(^2) -- it will still fail for few test cases
    static long maximumSum(long[] arr, long modulo) {
        long currSumModular = 0;
        long maxSumModular = 0;
        long[] prefix = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            currSumModular = (arr[i] % modulo + currSumModular) % modulo;
            prefix[i] = currSumModular;
        }
        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (prefix[j] <= prefix[i]) {
                    continue;
                }
                maxSumModular = Math.max(maxSumModular, (prefix[i] - prefix[j] + modulo) % modulo);
                if (maxSumModular == modulo - 1) {
                    break outer;
                }
            }
            maxSumModular = Math.max(maxSumModular, prefix[i]); // Don't forget sum from beginning.
        }

        return maxSumModular;
    }

    // further optimized solution using TreeSet so searching larger elements is in O(logN) order
    // Overall complexity is now O(NlogN)
    private static long getMaximumSum(long[] arr, long modulo) {
        long maxSumModular = 0;
        long currSumModular = 0;
        TreeSet<Long> prefix = new TreeSet<Long>();

        outer:
        for (int i = 0; i < arr.length; i++) {
            currSumModular = (arr[i] % modulo + currSumModular) % modulo;
            SortedSet<Long> set = prefix.tailSet(currSumModular + 1);

            Iterator<Long> itr = set.iterator();
            if (itr.hasNext()) {
                maxSumModular = Math.max(maxSumModular, (currSumModular - itr.next() + modulo) % modulo);
            }

            maxSumModular = Math.max(maxSumModular, currSumModular);
            if (maxSumModular == modulo - 1) {
                break outer;
            }
            prefix.add(currSumModular);
        }

        return maxSumModular;
    }
}
