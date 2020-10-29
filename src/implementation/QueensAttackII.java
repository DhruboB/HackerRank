package implementation;

public class QueensAttackII {

    public static void main(String[] args) {
//        int n = 4;
//        int k = 0;
//        int r_q = 4;
//        int c_q = 4;
//        int[][] obstacles = null; // 9


//        int n = 5;
//        int k = 3;
//        int r_q = 4;
//        int c_q = 3;
//        int[][] obstacles = null;

        int n = 100000;
        int k = 0;
        int r_q = 4187;
        int c_q = 5068;
        int[][] obstacles = null;

        if (k != 0) {
            obstacles = new int[][]{
                                    {5, 5},
                                    {4, 2},
                                    {2, 3}
                                    };
        }
            System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
        }

        // Complete the queensAttack function below.
        static int queensAttack ( int n, int k, int r_q, int c_q, int[][] obstacles){
            int count = 0;
            boolean[][] isObstaclePresent = new boolean[n][n];
            initialize(isObstaclePresent, obstacles);
            int x = r_q - 1;
            int y = c_q - 1;
            for (int i = x + 1; i < n; i++) {
                if (isObstaclePresent[i][y]) {
                    break;
                }
                count++;
            }
            for (int i = x - 1; i >= 0; i--) {
                if (isObstaclePresent[i][y]) {
                    break;
                }
                count++;
            }
            for (int i = y + 1; i < n; i++) {
                if (isObstaclePresent[x][i]) {
                    break;
                }
                count++;
            }
            for (int i = y - 1; i >= 0; i--) {
                if (isObstaclePresent[x][i]) {
                    break;
                }
                count++;
            }
            outer1:
            for (int i = x + 1, j = y + 1; i < n && j < n; i++, j++) {
                if (isObstaclePresent[i][j]) {
                    break outer1;
                }
                count++;
            }

            outer2:
            for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
                if (isObstaclePresent[i][j]) {
                    break outer2;
                }
                count++;
            }

            outer3:
            for (int i = x + 1, j = y - 1; i < n && j >= 0; i++, j--) {
                if (isObstaclePresent[i][j]) {
                    break outer3;
                }
                count++;
            }

            outer4:
            for (int i = x - 1, j = y + 1; i >= 0 && j < n; i--, j++) {
                if (isObstaclePresent[i][j]) {
                    break outer4;
                }
                count++;
            }
            return count;
        }

        static void initialize ( boolean[][] isObstaclePresent, int[][] obstacles){
            if (obstacles == null || obstacles.length == 0) return;
            for (int i = 0; i < obstacles.length; i++) {
                for (int j = 0; j < 2; j++) {
                    isObstaclePresent[obstacles[i][0]-1][obstacles[i][1]-1] = true;
                }
            }
        }
    }
