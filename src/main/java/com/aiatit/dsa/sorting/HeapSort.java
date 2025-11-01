package com.aiatit.dsa.sorting;

import java.util.Arrays;

import com.aiatit.dsa.sorting.utils.IntUtils;

public class HeapSort {

    /**
     * Main sort method to sort an array of integers using Heap Sort.
     * @param arr The array to be sorted.
     */
    public static void sort(int[] arr) {
        int n = arr.length;

        // 1. Build a max heap (rearrange array)
        // Start from the last non-leaf node (n/2 - 1) and heapify backwards
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root (maximum element) to end
        	IntUtils.swap(arr, 0, i);

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * A utility function to max heapify a subtree rooted with node i.
     * n is size of heap.
     */
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            IntUtils.swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

 

    /**
     * The main method to test the Heap Sort algorithm.
     */
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(data));

        sort(data); // Call the sort method

        System.out.println("Sorted array: " + Arrays.toString(data));
    }
}

