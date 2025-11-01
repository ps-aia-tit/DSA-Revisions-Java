package com.aiatit.dsa.sorting;

import com.aiatit.dsa.sorting.utils.IntUtils;

/**
 * Selection Sort divides the input list into two parts: a sorted sublist and an
 * unsorted sublist. It repeatedly finds the minimum element from the unsorted
 * sublist and puts it at the end of the sorted sublist.
 * 
 * Finds the minimum
 * element from the unsorted part of the array and puts it at the beginning. It
 * has a time complexity of O(n²).
 * 
 */
public class SelectionSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			IntUtils.swap(arr, minIndex, i);

		}
	}

	public static void main(String[] args) {
		int[] data = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Array before sorting:");
		IntUtils.printArrData(data);

		SelectionSort.sort(data);

		System.out.println("Array after sorting:");
		IntUtils.printArrData(data);

	}
}
