package stackandqueue;

import java.nio.charset.CharsetEncoder;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String brackets = "{";
//        String brackets = "[{()}}";

        System.out.println(isBalanced(brackets));
    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        // if ending bracket , will put it in a stack
        // if starting bracket then check stack peek , if matches then pop , else return NO
        Stack<Character> stack = new Stack<>();
        char chr;
        for (int i = 0; i < s.length(); i++) {
            chr = s.charAt(i);
            if (chr == ')' && !checkMatchedBracket('(', stack)) {
                return "NO";
            }else if (chr == '}' && !checkMatchedBracket('{', stack)) {
                return "NO";
            }else if (chr == ']' && !checkMatchedBracket('[', stack)) {
                return "NO";
            }
            if(chr == '(' || chr == '{' || chr == '[' ){
                stack.push(chr);
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    static boolean checkMatchedBracket(Character chr, Stack stack) {
        if (!stack.isEmpty() && stack.peek().equals(chr)) {
            stack.pop();
        } else {
            return false;
        }
        return true;
    }

}
