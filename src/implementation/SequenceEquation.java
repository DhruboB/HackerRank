package implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceEquation {
    public static void main(String[] args) {
        int[] p = {2,3,1};
        for(Integer val: permutationEquation(p)) {
            System.out.println(val);
        }
    }

    // Complete the permutationEquation function below.
    static List<Integer> permutationEquation(int[] p) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = p.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i < len; i++){
            map.put(p[i], i+1);
        }
        for(int i=0 ; i < len ;i++){
            list.add(map.get(map.get(i+1)));
        }
        return list;
    }
}
