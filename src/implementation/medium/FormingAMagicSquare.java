package implementation.medium;

public class FormingAMagicSquare {

    public static void main(String[] args) {
        int[][] matrix = {{4, 9, 2}, {3, 5, 7}, {8, 4, 6}};
        int result = formingMagicSquare(matrix);
        System.out.println(result);
    }

    static int formingMagicSquare(int[][] arr) {

        int[][][] preset = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
        int minCost = Integer.MAX_VALUE;
        preset:
        for (int p = 0; p < preset.length; p++) {
            int currCost = 0;
            matrix_outer:
            for (int i = 0; i < arr.length; i++) {
                matrix_inner:
                for (int j = 0; j < arr[0].length; j++) {
                    currCost += Math.abs(arr[i][j] - preset[p][i][j]);
                }
            }
            if (minCost > currCost) {
                minCost = currCost;
            }
        }
        return minCost;
    }
}
