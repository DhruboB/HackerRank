package dynamicprogramming;

import java.util.Arrays;

public class Candies {

    public static void main(String[] args) {
        int[] arr = {3,1,2,2};
        System.out.println(candies(arr.length, arr));
    }

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        int[] candies = new int[arr.length];
        //candies[0] = 1;
        Arrays.fill(candies, 1);
        for(int i= 0 ; i < arr.length -1 ; i++){
            if(arr[i+1] > arr[i]){
                candies[i+1] = candies[i]+1;
            }
        }
        for(int i= arr.length -1 ; i > 0; i--){
            if(arr[i-1] > arr[i] && candies[i-1] <= candies[i]){
                candies[i-1] = candies[i]+1;
            }
        }
        long sum = 0;
        for(int i: candies){
            sum += i;
        }
        return sum;
    }
}
