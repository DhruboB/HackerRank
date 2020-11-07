package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class JimAndTheOrders {

    public static void main(String[] args) {
        int[][] orders = {{8, 1},
                {4, 2},
                {5, 6},
                {3, 1},
                {4, 3}};
        System.out.println(Arrays.toString(jimOrders(orders)));
    }

    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
        int len = orders.length;
        int[] delivery = new int[len];
        int[][] orderTime = new int[len][2];

        for (int i = 0; i < len; i++) {
            orderTime[i][0] = orders[i][0] + orders[i][1];
            orderTime[i][1] = i + 1;
        }
        Arrays.sort(orderTime, Comparator.comparing(o -> o[0]));
        for (int i = 0; i < len; i++) {
            int j = i;
            while (j + 1 < len && orderTime[j][0] == orderTime[j + 1][0]) {
                j++;
            }
            Arrays.sort(orderTime, i, j, Comparator.comparing(o -> o[1]));
        }
        for (int i = 0; i < len; i++) {
            delivery[i] = orderTime[i][1];
        }
        return delivery;
    }
}
