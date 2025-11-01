package com.aiatit.dsa.sorting;

import com.aiatit.dsa.sorting.utils.IntUtils;

/***
 * Bubble Sort: Simple but inefficient for large datasets. 
 * Bubble Sort repeatedly A simple algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order. It
 * has a time complexity of O(n²)
 */
public class BubbleSort {

	public static void bubleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		// IntUtils.printArrData(arr);
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					// Swap arr[j] and arr[j+1]
					IntUtils.swap(arr, j);
					swapped = true;
					System.out.println("arr[j]: " + arr[j] + ", arr[j+1]: " + arr[j + 1]);
				}
			}

			// If no two elements were swapped by inner loop, then break
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Array before sorting:");

		IntUtils.printArrData(data);

		BubbleSort.bubleSort(data);

		System.out.println("Array after sorting:");

		IntUtils.printArrData(data);

	}

}