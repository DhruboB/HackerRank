package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int k = 2; // ans = 3
        System.out.println(pairs(k, arr));
    }

    // O(N) solution
    static int pairs(int k, int[] arr) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2) {
                    count++;
                }
            } else if (map.containsKey(key + k)) {
                count++;
            }
        }
        return count;
    }
}
