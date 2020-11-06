package algorithm;

import java.util.Arrays;

public class PriyankaAndToys {

    // Complete the toys function below.
    static int toys(int[] w) {
        int count = 1;
        Arrays.sort(w);
        int minWeight = w[0];
        for(int i=0 ; i < w.length ; i++){
            if(w[i] > minWeight + 4){
                count++;
                minWeight = w[i];
            }
        }
        return count;
    }
}
