package implementation.medium;

import java.util.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Integer[] arr = {1,7,2,4};
        int k = 3;

//        Integer[] arr = {1,7,2,4,5,7,8,9,2,10,6};
//        int k = 1;

//        Integer[] arr = {278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
//        int k = 7; // 11

        System.out.println(nonDivisibleSubset(k, Arrays.asList(arr)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int longestLength = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        Integer remainder = 0;
        Integer num = 0;
        for(int i=0; i < s.size(); i++){
                num = s.get(i);
                remainder = num % k;
            if(!map.containsKey(remainder)){
                map.put(remainder, new ArrayList<Integer>());
            }
            map.get(remainder).add(num);
        }
        List<Integer> list1 = null;
        List<Integer> list2 = null;
        int size1 = 0;
        int size2 = 0;
        for(int i=0; i<k/2+1 ; i++){
            list1 = map.get(i);
            list2 = map.get(k-i);
            size1 = (list1 != null && list1.size() != 0) ? list1.size() : 0;
            size2 = (list2 != null && list2.size() != 0) ? list2.size() : 0;
            if(i == 0 && size1 != 0){
                longestLength++;
            }else {
                longestLength += (size1 > size2 ? size1 : size2);
            }
        }
        return longestLength;
    }
}
