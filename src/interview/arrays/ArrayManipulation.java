package interview.arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{1,2,100},{2,5,100},{3,4,100}};
        System.out.println(arrayManipulation(n, queries));
    }


    // attempt1 - Not optimized O(NM) worst case
    static long arrayManipulation(int n, int[][] queries){
        long max  = 0;
        long[] helper = new long[n];
        for(int k = 0 ; k < queries.length ; k++){
            int startIndex = queries[k][0]-1;
            int endIndex = queries[k][1]-1;
            int val = queries[k][2];

            for(int i = startIndex ; i <= endIndex; i++){
                helper[i] += val;
                if(helper[i] > max) {
                    max = helper[i];
                }
            }
        }
        return max;
    }
}
