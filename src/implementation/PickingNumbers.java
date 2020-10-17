package implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {
        Integer[] list  = {1,2,2,3,1,2};
        System.out.println(pickingNumbers(Arrays.asList(list)));
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int longestCount = a.get(0);
        int count = 1;
        Integer startValue = a.get(0);
        for(int i = 1 ; i < a.size();  i++){
            Integer val = a.get(i);
            if(Math.abs(startValue - val) <= 1){
                count++;
            }else{
                count = 1;
                startValue = a.get(i);
            }
            if(longestCount < count){
                longestCount = count;
            }
        }
        return longestCount;
    }

}
