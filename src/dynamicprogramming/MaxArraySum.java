package dynamicprogramming;

public class MaxArraySum {

    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 6,5};

        System.out.println(maxSubsetSum(arr));
    }

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        if(arr.length > 1){
            dp[1] = Math.max(arr[0],arr[1]);
        }
        for(int i= 2 ; i < arr.length ; i++){
            dp[i] = Math.max(Math.max(dp[i-2]+arr[i],dp[i-1]),arr[i]);
        }
        return dp[arr.length-1];
    }
}
