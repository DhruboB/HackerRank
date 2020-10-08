package interview.arrays;

import java.util.*;

public class NewYearChaos {

    public static void main(String[] args) {
//        int[] arr = {2,1,5,3,4}; // 3
//        int[] arr = {2,5,1,3,4}; // too chaotic
        int[] arr = {1, 2, 5, 3, 7, 8, 6, 4}; // 7
        minimumBribes(arr);
    }

    static void minimumBribes(int[] arr) {
        int minBribes = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i + 3 || arr[i] < i - 3) {
                System.out.println("Too chaotic");
                return;
            }
            map.put(arr[i], i+1);
        }

        for(Map.Entry key : map.entrySet()){
            int val = (Integer)key.getKey();
            int pos = (Integer)key.getValue();
            if (val == pos) {
                continue;
            }
            System.out.println(map.toString());
            for(int i = pos ; i < val  ; i++ ) {
                swapPosition(map, arr, val);
                minBribes++;
            }
        }
        System.out.println(minBribes);
    }

    static void swapPosition(TreeMap<Integer,Integer> map , int[]  arr, int val1){
        Integer pos1 = map.get(val1); // 8th pos
        Integer pos2 = pos1 + 1; // target position
        Integer val2 = arr[pos2-1]; // target value
        map.put(val1, pos2);
        map.put(val2,pos1);
        swap(arr, pos1-1,pos2-1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
