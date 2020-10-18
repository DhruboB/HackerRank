package sorting.algo;

// Java program to sort an array
// using bucket sort

import java.util.Collections;
import java.util.Vector;

public class BucketSort {

    // Function to sort arr[] of size n
    static void bucketSort(float arr[]) {
        int n = arr.length;
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int idx = (int) (arr[i] * n);
            buckets[idx].add(arr[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]); // 3) Sort individual buckets
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j); // 4) Concatenate all buckets into arr[]
            }
        }
    }

    // Driver code
    public static void main(String args[]) {
        float arr[] = {(float) 0.497, (float) 0.165,
                (float) 0.536, (float) 0.434,
                (float) 0.425, (float) 0.984, (float) 0.7684, (float) 0.243};
        bucketSort(arr);
        System.out.print("Sorted array is > ");
        for (float el : arr) {
            System.out.print(el + " ");
        }
    }
}

