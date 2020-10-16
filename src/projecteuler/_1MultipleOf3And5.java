package projecteuler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1MultipleOf3And5 {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < t; i++) {
//            int n = in.nextInt();
//            int sum = 0;
//            if (!map.containsKey(n)) {
//                for (int j = 0; j < n; j++) {
//                    if (j % 3 == 0 || j % 5 == 0) {
//                        sum += j;
//                    }
//                }
//                map.put(n, sum);
//            }
//            System.out.println(map.get(n));
//        }
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            long sum = 0;
            int n3 = (n -1) / 3;
            int n5 = (n -1) / 5;
            int n15 = (n -1) / 15;
            sum = 3*n3*(n3 + 1) + 5*n5*(n5+1) - 15* n15 * (n15+1);
            System.out.println(sum >> 1);
        }
    }
}
