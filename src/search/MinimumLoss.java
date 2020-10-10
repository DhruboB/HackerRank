package search;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumLoss {
    public static void main(String[] args) {

//        long[] prices = {20,7,8,2,5};
        long[] prices = {5,10,3};
        System.out.println(minimumLoss(prices));
    }

    public static long minimumLoss(long[] price) {

        int len = price.length;
        long[][] sp = new long[len][2]; // sp > sortedPriceWithOriginalIndex

        for(int i=0 ; i < len ; i++){
            sp[i][0] = price[i];
            sp[i][1] = i;
        }
        sortPrices(sp);
        long minLoss = Long.MAX_VALUE;
        for(int i=0; i < len ; i++){
            long loss = searchValidMinLoss(sp, price[i]);
            if( loss > 0 && loss < minLoss){
                minLoss = loss;
            }
        }
        return minLoss;
    }

    public static void sortPrices(long[][] arr){
        Arrays.sort(arr, Comparator.comparingLong(o -> o[0]));
    }

    public static long searchValidMinLoss(long[][] arr, long val){
        int start = 0 ;
        int end = arr.length -1;
        int mid = 0;
        loop:
        while(start <= end){
            mid = (start + end)/2;
            if( val < arr[mid][0]){
                end = mid - 1;
            }else if ( val > arr[mid][0]){
                start = mid + 1;
            }else{
                break loop;
            }
        }
        int i = 1;
        if(mid > 0)
            i = mid - 1;
        else{
            return -1;
        }
        while(i > 0 && arr[mid][1] > arr[i][1] ) {
            i--;
        }
        return val - arr[i][0];
    }

    static void printArray(long[][] arr){
        System.out.print("");
        for(int i =0; i < arr.length ; i++){
            for(int j=0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("\n");
    }

}
