package implementation;

public class FindDigits {

    public static void main(String[] args) {
        int n = 1012;
        System.out.println(findDigits(n));
    }

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int digit  = 0;
        int count = 0;
        int num  = n;
        while(num > 0){
            digit = num % 10;
            if(digit != 0 && n % digit == 0){
                count++;
            }
            num = num /10;
        }
        return count;
    }
}
