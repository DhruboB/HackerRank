package sorting;

public class FraudulentActivityNotifications {

    public static void main(String[] args) {
        int[] expenditure = {2, 3, 4, 20, 3, 6, 8, 40, 50};
        int day = 4; // 2
//        int[] expenditure = {1,2,3,4,4};
//        int day = 4; // 0
//        int[] expenditure = {10,20,30,40,50};
//        int day = 3; // 1
        System.out.println(activityNotifications(expenditure, day));
    }


    static int activityNotifications(int[] expenditure, int d) {

        if (d <= 0) return 0;
        if (expenditure.length <= d) return 0;

        int notification = 0;

        int[] counts = new int[201];
        // counting number of occurrences in original arr and storing the value in counts at the index location
        for (int i = d - 1; i >= 0; i--) {
            ++counts[expenditure[i]];
        }

        int medFloor = 0, medCeil = 0;
        int iFloor = (int) Math.floor((d - 1) / 2.0);
        int iCeil = (int) Math.ceil((d - 1) / 2.0);
        for (int i = d; i < expenditure.length; i++) {
            for (int j = 0, k = 0; k <= iFloor; k += counts[j], j++) {
                medFloor = j;
            }
            for (int j = 0, k = 0; k <= iCeil; k += counts[j], j++) {
                medCeil = j;
            }
            float median = (medFloor + medCeil) / 2.0f;
            if (expenditure[i] >= 2 * median) {
                notification++;
            }
            counts[expenditure[i - d]]--; // removing first element from the window to allow next transaction within window
            counts[expenditure[i]]++; // adding one element to the window
        }
        return notification;
    }
}
