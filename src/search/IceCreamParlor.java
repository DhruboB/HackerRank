package search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    public static void main(String[] args) {
//        int[] cost = {2,1,3,5,6};
//        int money = 5; // 1,3
        int[] cost = {1,4,5,3,2};
        int money = 4; // 1,4

        System.out.println(Arrays.toString(icecreamParlor(cost,money)));
    }

    static int[] icecreamParlor(int[] cost, int money) {

        // Sort the cost along with original positions
        // get the complementary cost for each item and search in remaining items
        // found then return both complementary postions
        int len =cost.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(map.containsKey(money - cost[i])){
                ans[0] = map.get(money - cost[i]);
                ans[1] = i+1;
                break;
            }
            map.put(cost[i], i+1);
        }
        return ans;
    }

}
