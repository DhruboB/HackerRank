package implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ManasaAndStones {
    public static void main(String[] args) {
//        int n = 4;
//        int a = 10;
//        int b = 100;

//        int n = 5;
//        int a = 3;
//        int b = 23;

        int n = 73;
        int a = 25;
        int b = 25;

        System.out.println(Arrays.toString(stones(n,a,b)));
    }

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {
        int gap = n - 1;
        if(a == b){
            return new int[]{gap*a};
        }
        int i = 0;
        int[] ans = new int[n];
        int minDiff = a > b ? b : a;
        int maxDiff = a > b ? a : b;

        int minNum = gap * minDiff;
        int maxNum = gap * maxDiff;

        while(minNum <= maxNum){
            ans[i++] = minNum;
            minNum += maxDiff - minDiff;
        }
        return ans;
    }
}
