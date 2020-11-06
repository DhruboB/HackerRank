package interview.warmup;

import java.util.Arrays;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int max = Arrays.stream(ar).max().getAsInt();
        int pair = 0;
        int[] counts = new int[max+1];
        for(int i=0; i < ar.length ; i++){
            counts[ar[i]]++;
        }
        for(int i=0; i <= max ; i++){
            if(counts[i] > 1){
                pair += counts[i]/2;
            }
        }
        return pair;
    }
}
