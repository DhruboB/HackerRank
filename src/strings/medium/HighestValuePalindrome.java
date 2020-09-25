package strings.medium;

/**
 * TODO WRONG solution. will be improved soon.
 */
public class HighestValuePalindrome {

    public static void main(String[] args) {
//        String s = "0011";
        String s = "092282";
        int noOfChange = 1;
        System.out.println(highestValuePalindrome(s, s.length(), noOfChange));
    }

    static String highestValuePalindrome(String s , int n, int k){
        String na = "-1";
        int i = 0;
        int li = n -1;
        while(k > 0 && i < n) {
            if(s.charAt(i) != s.charAt(li - i)) {
                if (k > 1) {
                    s = replace(s, i, '9');
                    k--;
                    if (k > 0) {
                        s = replace(s, li - i, '9');
                        k--;
                    }
                    continue;
                }
                if (k == 1) {
                    char maxValue = Integer.valueOf(s.charAt(i)) > Integer.valueOf(s.charAt(li - i)) ? s.charAt(i)  : s.charAt(li - i);
                    s = replace(s, i, maxValue);
                    s = replace(s, li - i, maxValue);
                    k--;
                }
            }
            i++;
        }
        boolean flag = true;
        for(int j = 0; j <= n / 2 ; j++){
            if(s.charAt(j) != s.charAt(li - j)){
                flag = false;
                break;
            }
        }
        if(flag)
            return s;
        return na;
    }

    static String replace(String  s , int index, char ch){
        char[] strngs = s.toCharArray();
        strngs[index] = ch;
        return String.valueOf(strngs);
    }
}
