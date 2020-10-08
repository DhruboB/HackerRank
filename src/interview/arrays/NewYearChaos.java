package interview.arrays;

import java.util.*;

public class NewYearChaos {

    public static void main(String[] args) {
//        int[] arr = {2,1,5,3,4}; // 3
//        int[] arr = {2,5,1,3,4}; // too chaotic
        int[] arr = {1, 2, 5, 3, 7, 8, 6, 4}; // 7
        minimumBribes(arr);
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
        int minBribes = 0;
        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (arr[i] == expectedSecond) {
                ++minBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (arr[i] == expectedThird) {
                minBribes += 2;
                ++expectedThird;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(minBribes);
    }
}
