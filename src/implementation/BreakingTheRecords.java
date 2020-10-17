package implementation;

public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = new int[]{10,5,20,20,4,5,2,25,1};
        for(int v: breakingRecords(scores)) {
            System.out.println(v);
        }
    }

    static int[] breakingRecords(int[] scores) {
        int maxScore = scores[0];
        int minScore = scores[0];
        int maxCounter = 0;
        int minCounter = 0;
        int[] result = new int[2];
        for(int v: scores){
            if(v > maxScore){
                maxScore = v;
                maxCounter++;
            }
            if(v < minScore){
                minScore = v;
                minCounter++;
            }
        }
        result[0] = maxCounter;
        result[1] = minCounter;
        return result;
    }

}
