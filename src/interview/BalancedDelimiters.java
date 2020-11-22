package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedDelimiters {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){

            if(c == ']' ) {
                if( stack.pop() != '[') {
                    System.out.println("False");
                    return;
                }
            }else if(c == '}' ){
                if(stack.pop() != '{') {
                    System.out.println("False");
                    return;
                }
            }else if(c == ')'  ){
                if( stack.pop() != '(') {
                    System.out.println("False");
                    return;
                }
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
