package strings;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(theLoveLetterMystery(s));
    }

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        // iteration condition would be to check whether start < end
        // iterate through fro both end and comapre whether characters are matching or not
        // if true -->  we are good
        // if false --> calculate cost by absolute difference
        // increase the cost of operation by that count
        int start = 0;
        int end = s.length()-1;
        int char1 = -1;
        int char2 = -1;
        int cost =0;
        while(start < end){
            char1 = s.charAt(start);
            char2 = s.charAt(end);
            if( char1 != char2){
                cost += Math.abs(char1-char2);
            }
            start++;
            end--;
        }
        return cost;
    }
}
