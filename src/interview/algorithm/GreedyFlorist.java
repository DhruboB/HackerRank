package interview.algorithm;

import java.util.Arrays;

public class GreedyFlorist {

    public static void main(String[] args) {
        int[] costs = {1,3,5,7,9};
        int k = 3;
        System.out.println(getMinimumCost(k,costs));
    }

    // O(NlogN)
    public static int getMinimumCost(int k, int[] costs){
        int minCost = 0;
        Arrays.sort(costs);
        int len = costs.length;
        int prevFlower  = 0;
        external:
        for(int i = len - 1 ; i >= 0 ; i -= k ) {
            internal:
            for(int j = i ; j >= (len - (prevFlower + 1)*k) && j >= 0 ; j--){
                minCost += ( prevFlower + 1 ) * costs[j];
            }
            prevFlower++;
        }
        return minCost;
    }
}
