package com.aiatit.dsa.sorting;

import com.aiatit.dsa.sorting.utils.IntUtils;

/***
 * Insertion Sort (Simple/Brute Force) Builds the final sorted array one item at
 * a time. It takes an element from the unsorted part and inserts it into its
 * correct position in the sorted part. Time complexity is O(n²) in the worst
 * case, but efficient for small or nearly sorted lists (O(n) in the best case).
 */
public class InsertionSort {
	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] data = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Array before sorting:");
		IntUtils.printArrData(data);

		InsertionSort.sort(data);

		System.out.println("Array after sorting:");
		IntUtils.printArrData(data);

	}
}
