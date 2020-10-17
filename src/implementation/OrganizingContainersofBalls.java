package implementation;

import java.util.Arrays;

public class OrganizingContainersofBalls {

    public static void main(String[] args) {
        int[][] containers = {{1,1},{1,1}};
//        int[][] containers = {{0,2},{1,1}};
//        int[][] containers = {{0,2},{1,1,5}};
        System.out.println(organizingContainers(containers));
    }

    static String organizingContainers(int[][] container) {
        int containers = container.length;
        int types = container[0].length;
        if(containers != types) return "Impossible";
        int[] capacity = new int[containers];
        int[] noOfEachBalls = new int[types];

        for(int i=0; i <containers ; i++ ){
            int sum = 0;
            for(int j=0; j < types; j++){
                sum += container[i][j];
            }
            capacity[i] = sum;
        }
        for(int i=0; i <types ; i++ ){
            int sum = 0;
            for(int j=0; j < containers; j++){
                sum += container[j][i];
            }
            noOfEachBalls[i] = sum;
        }
        Arrays.sort(capacity);
        Arrays.sort(noOfEachBalls);

        for(int i=0 ; i < containers ; i++){
            if(capacity[i] != noOfEachBalls[i]){
                return "Impossible";
            }
        }
        return "Possible";
    }
}
