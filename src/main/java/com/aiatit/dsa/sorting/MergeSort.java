package com.aiatit.dsa.sorting;

/***
 * A divide-and-conquer algorithm. It divides the input array into two halves,
 * calls itself for the two halves, and then merges the two sorted halves. Time
 * complexity is O(n log n).
 */
import java.util.Arrays;

public class MergeSort {

	/**
	 * Main sort method that calls the recursive sort function.
	 * 
	 * @param arr The array to be sorted.
	 */
	public static void sort(int[] arr) {
		if (arr == null) {
			return;
		}
		sortRecursive(arr, 0, arr.length - 1);
	}

	/**
	 * Recursive function to divide the array and sort it.
	 */
	private static void sortRecursive(int[] arr, int left, int right) {
		
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort first and second halves
			sortRecursive(arr, left, mid);
			sortRecursive(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	/**
	 * Merges two subarrays of arr[]. First subarray is arr[left..mid] Second
	 * subarray is arr[mid+1..right]
	 */
	private static void merge(int[] arr, int left, int mid, int right) {
		// Find sizes of two subarrays to be merged
		int size1 = mid - left + 1;
		int size2 = right - mid;

		// Create temp arrays
		int[] L = new int[size1];
		int[] R = new int[size2];

		// Copy data to temp arrays
		for (int i = 0; i < size1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < size2; ++j)
			R[j] = arr[mid + 1 + j];

		// Merge the temp arrays

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = left;
		while (i < size1 && j < size2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < size1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < size2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Example Usage
	public static void main(String[] args) {
		int[] data = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Original array: " + Arrays.toString(data));

		sort(data);

		System.out.println("Sorted array: " + Arrays.toString(data));
	}
}
