package implementation;

import java.util.Arrays;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */

        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int cost = -1;
        loop:
        for(int i = keyboards.length -1 ; i >= 0 ; i--){
            if( b - keyboards[i] > drives[0]){
                for(int j = drives.length -1 ; j >= 0 ; j--){
                    int temp = keyboards[i] + drives[j];
                    if( temp <= b && temp > cost ){
                        cost = temp;
                    }
                }
            }
        }
        return cost;
    }
}
