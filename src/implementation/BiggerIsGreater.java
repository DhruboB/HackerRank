package implementation;

import java.util.Arrays;

public class BiggerIsGreater {

    public static void main(String[] args) {
        String str = "dkhc"; // hcdk
        System.out.println(biggerIsGreater(str));
    }

    static String biggerIsGreater(String w) {
        int len = w.length();
        char[] chars = w.toCharArray();
        char temp = 0;
        int i = len - 1;
        while (i > 0 && chars[i] <= chars[i-1]) {
            i--;
        }
        if (i <= 0) {
            return "no answer";
        }
        int j = len - 1;
        while (chars[i - 1] >= chars[j]) {
            j--;
        }
        if(i-1 != j) {
            temp = chars[j];
            chars[j] = chars[i - 1];
            chars[i - 1] = temp;
        }

        j = len - 1;
        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return buildString(chars);
    }

    static String buildString(char[] chars){
        StringBuilder sb = new StringBuilder();
        for(char chr: chars){
            sb.append(chr);
        }
        return sb.toString();
    }
}
