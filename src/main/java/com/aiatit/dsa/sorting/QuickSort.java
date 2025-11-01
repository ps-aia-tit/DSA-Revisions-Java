package com.aiatit.dsa.sorting;

/**
 * Another divide-and-conquer algorithm. It picks a 'pivot' element and
 * partitions the array around the picked pivot. Time complexity is O(n log n)
 * on average, but O(n²) in the worst case.
 */
import java.util.Arrays;

import com.aiatit.dsa.sorting.utils.IntUtils;

public class QuickSort {

    /**
     * Main sort method to be called by the user.
     * @param arr The array to be sorted.
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * The main function that implements QuickSort()
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * This function takes last element as pivot, places the pivot element
     * at its correct position in sorted array, and places all smaller
     * elements to left of pivot and all greater elements to right of pivot.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                IntUtils.swap(arr, i, j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        IntUtils.swap(arr, i + 1, high);

        return i + 1;
    }

   

    /**
     * The main method to test the Quick Sort algorithm.
     */
    public static void main(String[] args) {
        int[] data = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Original array: " + Arrays.toString(data));

        sort(data); // Call the sort method

        System.out.println("Sorted array: " + Arrays.toString(data));
    }
}

