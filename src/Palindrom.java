public class Palindrom {

    public static void main(String[] args) {
        int num = 876678;
        System.out.println(isPalindrom("" + num));
        System.out.println(isPalindrom(num));
    }

    static boolean isPalindrom(String str){
        int n = str.length();
        for(int i = 0 ; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-1 -i)){
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrom(int num){
        int reverseInt = 0;
        int remainder = 0;
        int originalNum = num;
       while( num != 0) {
           remainder = num % 10;
           reverseInt = reverseInt*10 + remainder;
           num /= 10;
        }
       if(reverseInt == originalNum)
            return true;
       else
           return false;
    }
}
