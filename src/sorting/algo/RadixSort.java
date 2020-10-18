package sorting.algo;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int arr[] = {7653, 689, 236, 57, 71, 90, 678, 32, 9, 73};
        // sorting with radix algo
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int[] arr) {
        int max = getMaximum(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] counts = new int[10];
        for (int i = 0; i < n; i++) {
            ++counts[(arr[i] / exp) % 10];
        }

        for (int i = 1; i < 10; i++) {
            counts[i] += counts[i - 1];
        }
        int[] sortedArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArr[--counts[(arr[i] / exp) % 10]] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }
    }

    static int getMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
