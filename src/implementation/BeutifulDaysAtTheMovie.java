package implementation;

public class BeutifulDaysAtTheMovie {

    public static void main(String[] args) {
        int i = 13, j = 45, k= 3;
        System.out.println(beautifulDays(i,j,k));
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0 ;
        for(int m = i ; m <= j ; m++){
            if( Math.abs(m - reverse(m))%k == 0){
                count++;
            }
        }
        return count;
    }

    static int reverse(int m){
        int reverse = 0;
        while(m > 0){
            reverse = reverse*10 + m%10;
            m = m/10;
        }
        return reverse;
    }
}
