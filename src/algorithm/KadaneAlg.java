package algorithm;

public class KadaneAlg {

    static void maxSubArraySum(int a[], int size) {
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0, startIndex = 0, // if all values are negatives then initialize with arr[0]
                endIndex = 0, startIndicator = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                startIndex = startIndicator;
                endIndex = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                startIndicator = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + startIndex);
        System.out.println("Ending index " + endIndex);
    }

    public static void main(String[] args) {
//        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int a[] = {-2, 1, -2, 4, -1, 2, 1, -5, 4};
        int n = a.length;
        maxSubArraySum(a, n);
    }
}
