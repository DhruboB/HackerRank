package strings.easy;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "&+^&";
//        String str = "!@#$%^&*()-+";
//        for(int i=0; i < str.length(); i++){
//            System.out.println( str.charAt(i) + " = "+ (int)str.charAt(i));
//        }
        int length = password.length();
        int remainingChar = verifyPassword(length,password);
        System.out.println(remainingChar);
    }

/**
 *     Its length is at least .
 *     It contains at least one digit.
 *     It contains at least one lowercase English character.
 *     It contains at least one uppercase English character.
 *     It contains at least one special character. The special characters are: !@#$%^&*()-+
 */
    static int verifyPassword(int length, String password){
        int count = 0;
        boolean isDigitPresent = false;
        boolean isLowerCasePresent = false;
        boolean isUpperCasePresent = false;
        boolean isSpecialCasePresent = false;
        for(int i = 0; i < length ; i++){
            int chr = password.charAt(i);
            if( !isDigitPresent && (chr >= 48 && chr <= 57 )){
                isDigitPresent = true;
                continue;
            }
            if( !isUpperCasePresent && (chr >= 65 && chr <= 90 ) ){
                isUpperCasePresent = true;
                continue;
            }
            if( !isLowerCasePresent && (chr >= 97 && chr <= 122) ){
                isLowerCasePresent = true;
                continue;
            }
            if( !isSpecialCasePresent && ((chr >= 33 && chr <= 43 && chr != 39 && chr != 34) || chr == 45 || chr == 94 || chr == 64)){
                isSpecialCasePresent = true;
                continue;
            }
        }
        if(!isDigitPresent){
            count++;
        }
        if(!isLowerCasePresent){
            count++;
        }
        if(!isSpecialCasePresent){
            count++;
        }
        if(!isUpperCasePresent){
            count++;
        }
        return 6 - length > count ? 6- length : count;
    }
}
