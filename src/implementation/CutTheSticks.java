package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {

    public static void main(String args[]) {
        int[]  arr = {1,2,3,4,3,3,2,1};
//        int[]  arr = {5,4,4,2,2,8};
//        int[]  arr = {1,1,1,1};
        System.out.println(Arrays.toString(cutTheSticks(arr)));
    }

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> list  = new ArrayList<>();
        Arrays.sort(arr);
        int len = arr.length;
        list.add(len);
        for(int i = 1 ; i < len ; i++){
            int j = i;
            while(j < len && arr[j] == arr[j-1]){
                j++;
                i++;
            }
            if(len -i != 0)
                list.add(len - i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
