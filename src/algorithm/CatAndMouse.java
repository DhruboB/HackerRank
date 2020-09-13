package algorithm;

public class CatAndMouse {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{{1,2,3},{1,3,2}};

        for (int[] arr : matrix) {
            String result = catAndMouse(arr[0], arr[1], arr[2]);
        }
    }

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catAAbs = Math.abs(z-x);
        int catBAbs = Math.abs(z-y);
        if(catAAbs == catBAbs){
            return "Mouse C";
        }
        if(catAAbs < catBAbs){
            return "Cat A";
        }
        return "Cat B";
    }

}
