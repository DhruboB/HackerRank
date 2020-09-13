package warmap;

import java.util.*;

public class _9BirthdayCakeCandles {

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>() ;
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        Collections.sort(candles);
        int maxCount = 0;
        int max = candles.get(candles.size() -1 );
        for(int value : candles){
            if(value == max){
                maxCount++;
            }
        }
        System.out.println(maxCount);
    }
}
