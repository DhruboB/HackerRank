package implementation;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {

    public static void main(String[] args) {
        Integer[] arr = {1,4,4,4,5,3};
        System.out.println(migratoryBirds(Arrays.asList(arr)));
    }

    static int migratoryBirds(List<Integer> arr){
        if(arr.size() == 0 ) return 0;
        int[] types = new int[5];
        for(int i : arr){
            ++types[i-1];
        }
        int max = types[0];
        int type = 1;
        for(int i =0; i < 5 ; i++){
            if(types[i] > max){
                max = types[i];
                type = i + 1;
            }
        }
        return type;
    }
}
