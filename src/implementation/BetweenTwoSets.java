package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String... args){

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);

        System.out.println(getTotalX(a,b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
//        Collections.sort(a);
//        Collections.sort(b);
        int minNum = a.get(a.size()-1);
        int maxNum = b.get(0);
        int num = minNum;
        while(num <= maxNum){
            boolean isFactored =  false;
            for(int v: a){
                if(!(num%v == 0)){
                    isFactored = false;
                    break;
                }
                isFactored = true;
            }
            boolean isMultiplier = false;
            for(int v: b){
                if(! (v%num == 0)){

                    isMultiplier = false;
                    break;
                }
                isMultiplier = true;
            }
            if(isFactored && isMultiplier){
                count++;
            }
            num += a.get(a.size()-1);
        }
        return count;
    }


}
