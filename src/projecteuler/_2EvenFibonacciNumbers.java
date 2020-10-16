package projecteuler;

import java.util.Scanner;

public class _2EvenFibonacciNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            if( n == 1) {
                System.out.println(0);
                continue;
            }
            if( n == 2) {
                System.out.println(2);
                continue;
            }
            long first =  1;
            long second = 2;
            long num = 1;
            long sum = 2;
            while( true ){
                num = first + second;
                if(num > n) break;
                first = second;
                second = num;
                if( num % 2 == 0){
                    sum += num;
                }
            }
            System.out.println(sum);
        }
    }
}
