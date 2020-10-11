package interview.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LuckBalance {

    public static void main(String[] args) {
//        int[][] contests = {{5,1},{1,1},{4,0}};
//        int k = 2; // 10

//        int[][] contests = {{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
//        int k = 3; // 29

//        int[][] contests = {{5,1},{4,0},{6,1},{2,1},{8,0}};
//        int k = 2; // 21

        int[][] contests = {{13,1},{10,1},{9,1},{8,1},{13,1},{12,1},{18,1},{13,1}};
        int k = 5; // 42


        System.out.println(luckBalance(k,contests));
    }

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int sumOfUnImpContests = 0;
        int impContestsLength = 0;
        int len = contests.length;
        Integer[] helper = new Integer[len];
        int helperIndex = 0;
        for(int i = 0 ; i < len; i++){
            if(contests[i][1] == 0){
                sumOfUnImpContests += contests[i][0];
            }else{
                impContestsLength++;
                helper[helperIndex++] = contests[i][0];
            }
        }

        Arrays.sort(helper, 0,helperIndex ,Collections.reverseOrder());
        int sumOfToLossImpContests = 0;
        int sumOfToWinImpContests = 0;

        for(int i = 0 ; i < impContestsLength ; i++){
            if(i < k){
                sumOfToLossImpContests += helper[i];
            }else {
                sumOfToWinImpContests += helper[i];
            }
        }
        return sumOfUnImpContests + sumOfToLossImpContests - sumOfToWinImpContests;
    }


    // sort based on column 1 and where column 2 has 1
    static void sort(int[][] arr){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                return (entry1[1] == 1 ) ? -1 : 1;
            }
        });

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                return (entry1[1] == 1 ) ? (entry1[0] >=  entry2[0] ? -1 : 1) : 1;
            }
        });
    }
}
