package strings;

public class PalindromIndex {


    /**
     * Sample Input
     * aaab
     * baa
     * aaa
     *
     * Sample Output
     * 3
     * 0
     * -1
     *
     * quyjjdcgsvvsgcdjjyq
     * hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh
     * fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf
     * bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb
     * fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf
     * mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm
     * tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt
     * lhrxvssvxrhl
     * prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp
     * kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk
     *
     * 1
     * 8
     * 33
     * 23
     * 25
     * 44
     * 20
     * -1
     * 14
     * -1
     *
     * uxxdlselxmwyiguugtpsypfudffswvwyswyyiiyywsywvsffdufpysptguugiywmxlesldxxu
     * rvscdpyljqglgmiktfndsmfnkgmubrruloqptgohsgneocoyyocoengshogtpqolurrbumgknfmsdntkimglgqjlypdcsvr
     *
     * 28
     * 17
     */

    public static void main(String[] args) {
        String s = "lfcwnnwcwfl"; //
//        String s = "yiguugtpsypfudffswvwyswyyiiyywsywvsffdufpysptguugiy"; // 17
        System.out.println(palindromeIndex(s));
    }


    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        int len = s != null ? s.length() : -1;
        if(len <= 1) return -1;
        int start  = 0;
        int end = len -1;
        boolean isSkippedOnce = false;
        int indexToBeRemoved = -1;
        while(start <= end ){
            if(s.charAt(start) != s.charAt(end)) {
                if(isSkippedOnce){
                    return -1;
                }
                isSkippedOnce = true;
                if(s.charAt(start) == s.charAt(end-1) && isPalidrom(s.substring(start,end))){
                        indexToBeRemoved = end;
                        end--;
                } else if(s.charAt(start+1) == s.charAt(end) && isPalidrom(s.substring(start+1,end+1))){
                        indexToBeRemoved = start;
                        start++;
                }else {
                    return  -1;
                }
            }
            start++;
            end--;
        }
        return !isSkippedOnce && start >  end ? -1 : indexToBeRemoved;
    }

    private static boolean isPalidrom(String s){
        int start = 0 ;
        int end = s.length() -1;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) {
                break;
            }
            start++;
            end--;
        }
        return start > end ? true : false;
    }
}
