package implementation.medium;

public class DivisibleSumPairs {

    public static void main(String... args) {
//        int[] arr = {1,2,3,4,5,6};
//        int k = 5; // 3
        int[] arr = {1, 3, 2, 6, 1, 2};
        int k = 3;
        System.out.println(divisibleSumPairs(arr, k));

    }

    private static int divisibleSumPairs(int[] arr, int k) {
        int a[] = new int[k];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            number = number % k;
            count += a[k - (number == 0 ? k : number)];
            ++a[number];
        }
        return count;
    }


    // Not recommended
    private static int divisibleSumPairsONSquare(int[] arr, int k) {
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
