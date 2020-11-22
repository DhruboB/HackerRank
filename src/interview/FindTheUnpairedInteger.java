package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheUnpairedInteger {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str = br.readLine();
        String[] nums = str.split(", ");

        int unpairedNum = 0;

        for(String i : nums){
            unpairedNum ^= Integer.parseInt(i);
        }
        System.out.println(unpairedNum);
    }
}
