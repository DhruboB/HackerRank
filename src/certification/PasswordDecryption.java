package certification;

import java.util.Stack;

public class PasswordDecryption {
    public static void main(String[] args) {
        String encrypted = "43Ah*ck0rr0nk"; // hAck3rr4nk
        System.out.println(decryptPassword(encrypted));
    }

//    Encryption logic
//    1. if s[i] is lowercase and the next character s[i+1] is uppercase, swap them and '*' after
//    them and move to i+2
//    2. If s[i] is a number , replace it with 0, place the original number at the start and move to i+1
//    3. Else, move to i+1
//    4. Stop if i is more than or equal to the string length. Otherwise, go to step 1
    public static String decryptPassword(String s){
        char[] chars = new char[s.length()];
        Stack<Character> digits = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                if(c == '0'){
                    chars[i] = digits.pop();
                }else {
                    for(int j=0; i < s.length(); j++) {
                        char cj = s.charAt(j);
                        if(!Character.isDigit(cj)){
                            break;
                        }
                        digits.add(cj);
                    }
                }
            }else if(c == '*'){
                if(Character.isLowerCase(chars[i-1]) && Character.isUpperCase(chars[i-2])){
                    char temp  = chars[i-1];
                    chars[i-1] = chars[i-2];
                    chars[i-2] = temp;
                }
            }else{
                chars[i] = c;
            }
        }
        return String.valueOf(chars);
    }

}
