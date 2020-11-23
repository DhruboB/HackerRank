package dynamicprogramming;

public class Abbreviation {

    public static void main(String[] args) {

    }

    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
        int n = a.length();
        int m = b.length();
        if(n < m) return "NO";
        // creating a dp to store possibility of match
        boolean[][] dp = new boolean[n+1][m+1];

        dp[0][0] = true;

        for(int i=1; i <= n; i++){
            dp[i][0] = true;
        }

        for(int i=1 ; i <= n ; i++ ){
            for(int j=1; j <= m && j <= i; j++){
                if(Character.isLowerCase(a.charAt(i-1))){
                    dp[i][j] = dp[i][j] || dp[i-1][j];
                }
                if(Character.toUpperCase(a.charAt(i-1)) == b.charAt(j-1)){
                    dp[i][j] = dp[i][j] || dp[i-1][j-1];
                }
            }
        }
        return dp[n][m] ? "YES" : "NO";
    }
}
