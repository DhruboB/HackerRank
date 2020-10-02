import java.io.*;

public class ProblemSolving {

    /*
     * Complete the problemSolving function below.
     */
    static int problemSolving(int k, int[] v) {
        /*
         * Write your code here.
         */
        int solnX = 0;
        int solnY = 0;
        int[][] soln = new int[100][100];
        int day = 0;
        boolean flagToCall = false;

        if (v.length == 0 )
            return 0;

        int lastSolvedIndex = 0;
        for (int i = 0; i < v.length; i++) {
            if (i == 0) {
                soln[solnX][solnY] = v[i];
                continue;
            }
            if (v[i] >= v[lastSolvedIndex] + k) {
                soln[solnX][++solnY] = v[i];
                lastSolvedIndex = i;
            } else {
                soln[++solnX][solnY] = v[i];
                flagToCall = true;
            }
        }
        day++;
        System.out.println(solnX);
        System.out.println(solnY);
        System.out.println(soln[solnX]);
        System.out.println(soln[solnX][solnY]);
        if (flagToCall) {
            if(problemSolving(k,soln[solnX]) == 1){

            }
        }
        return day;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        int t = Integer.parseInt(scanner.nextLine().trim());
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0].trim());
//
//        int k = Integer.parseInt(nk[1].trim());
//
//        int[] v = new int[n];
//
//        String[] vItems = scanner.nextLine().split(" ");
//
//        for (int vItr = 0; vItr < n; vItr++) {
//            int vItem = Integer.parseInt(vItems[vItr].trim());
//            v[vItr] = vItem;
//        }

        int k = 2;

        int[] v = new int[]{5,4,7};

        int result = problemSolving(k, v);

        System.out.println("Output is > " + result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }
}
