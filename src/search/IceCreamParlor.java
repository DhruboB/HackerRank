package search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    public static void main(String[] args) {
//        int[] cost = {2,1,3,5,6};
//        int money = 5; // 1,3
        int[] cost = {1,4,5,3,2};
        int money = 4; // 1,4

        whatFlavors(cost,money);
    }

    static void whatFlavors(int[] cost, int money) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < cost.length ; i++){
            if(map.containsKey(cost[i])){
                System.out.println(map.get(cost[i]) + " " + (i+1));
                return;
            }
            if(isPurchasable(cost[i],money)) {
                map.put(money - cost[i], i + 1);
            }
        }
    }

    static boolean isPurchasable(int cost, int money){
        return cost > money ? false : true;
    }
}
