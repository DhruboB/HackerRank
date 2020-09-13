package implementation.medium;

public class FormingAMagicSquare {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{4,9,2},{3,5,7},{8,1,5}};
//        int[][] matrix = new int[][]{{4,8,2},{4,5,7},{6,1,6}};
        int result = formingMagicSquare(matrix);
    }

    static int formingMagicSquare(int[][] s){
        for(int i = 0 ; i < s.length; i++){
            for(int j = 0 ; j < s.length; j++){
                System.out.println(" i = " + i + " j= "+ j + " s = " + s[i][j]);
                // TODO PENDING
            }
        }
        return 0;
    }
}
