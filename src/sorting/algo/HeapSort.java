package sorting.algo;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 8, 9, 3, 10};
//        int[] arr = { 5, 6, 8, 9, 3, 10};
        HeapSort hs = new HeapSort();

        hs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr) {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }
        System.out.println(Arrays.toString(arr));

        // One by one extract max element from heap array
        for (int i = len - 1; i > 0; i--) {
            // Move current root i.e. Max element to end of the array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap i.e. array length is reduced by 1
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int len, int root) {
        int largest = root;
        int left = 2 * largest + 1;
        int right = 2 * largest + 2;
        // If left child is larger than root
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        // If largest is not root
        if (largest != root) {
            int swap = arr[root];
            arr[root] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, len, largest);
        }

    }
}
