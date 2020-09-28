package sorting.medium;

import java.util.*;

public class LilysHomework {

    public static void main(String[] args) {
        int[] arr = {7,3,0,4,1,6,5,2}; // 5
//        int[] arr = {7, 15, 12, 3}; //2
//        int[] arr = {2,5,3,1}; // 2
//        int[] arr = {3,4,2,5,1}; // 2

        System.out.println(lilysHomework(arr));
    }

    static int lilysHomework(int[] arr){
        int count = 0;
        TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
        TreeMap<Integer,Integer> tm2 = new TreeMap<Integer, Integer>();
        int[] arrCopy = new int[arr.length];
        for(int i = 0; i < arr.length ; i++ ){
            tm.put(arr[i],i);
            tm2.put(arr[i],i);
            arrCopy[i] = arr[i];
        }

        int index = 0;
        for(Integer key : tm.keySet()){
            int originalPosition = tm.get(key);
            if( key.intValue() != arr[index]){
                swap(arr , index , originalPosition, tm);
                count++;
            }
            index++;
        }

        int count2 = count;
        count = 0;
        index = 0;
        NavigableMap<Integer,Integer> nmap = tm2.descendingMap();
        for(Integer key : nmap.keySet()){
            int originalPosition = tm2.get(key);
            if( key.intValue() != arrCopy[index]){
                swap(arrCopy , index , originalPosition, tm2);
                count++;
            }
            index++;
        }
        return Math.min(count, count2);
    }

    static void swap(int[] arr, int i, int j, TreeMap<Integer,Integer> tm){
        tm.put(arr[i],j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
