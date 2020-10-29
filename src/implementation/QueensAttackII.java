package implementation;

public class QueensAttackII {

    public static void main(String[] args) {
//        int n = 4;
//        int k = 0;
//        int r_q = 4;
//        int c_q = 4;
//        int[][] obstacles = null; // 9


        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q = 3;
        int[][] obstacles = new int[][]{
                {5, 5},
                {4, 2},
                {2, 3}
        };

//        int n = 100000;
//        int k = 0;
//        int r_q = 4187;
//        int c_q = 5068;
//        int[][] obstacles = null;

        System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
    }

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int up = n - r_q;
        int down = r_q - 1;
        int right = n - c_q;
        int left = c_q - 1;

        int ruMin = Math.min(up, right);
        int rdMin = Math.min(right, down);
        int luMin = Math.min(left, up);
        int ldMin = Math.min(left, down);

        if (obstacles == null) return up + down + right + left + ruMin + rdMin + luMin + ldMin;

        for (int[] oXY : obstacles) {
            if (oXY[1] == c_q) {
                if (oXY[0] < r_q)
                    down = Math.min(down, r_q - 1 - oXY[0]);
                else
                    up = Math.min(up, oXY[0] - r_q - 1);
            } else if (oXY[0] == r_q) {
                if (oXY[1] < c_q)
                    left = Math.min(left, c_q - 1 - oXY[1]);
                else
                    right = Math.min(right, oXY[1] - c_q - 1);
            } else if (Math.abs(oXY[0] - r_q) == Math.abs(oXY[1] - c_q)) {
                if (oXY[1] > c_q) {
                    if (oXY[0] > r_q)
                        ruMin = Math.min(ruMin, oXY[1] - c_q - 1);
                    else
                        rdMin = Math.min(rdMin, oXY[1] - c_q - 1);
                } else {
                    if (oXY[0] > r_q)
                        luMin = Math.min(luMin, c_q - 1 - oXY[1]);
                    else
                        ldMin = Math.min(ldMin, c_q - 1 - oXY[1]);
                }
            }
        }
        return up + down + right + left + ruMin + rdMin + luMin + ldMin;
    }
}
