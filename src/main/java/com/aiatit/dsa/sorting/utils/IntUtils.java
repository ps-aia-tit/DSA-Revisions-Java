package com.aiatit.dsa.sorting.utils;

public class IntUtils {

	public static void printArrData(int[] data) {
		for (int x : data) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	/**
	 * @param arr
	 * @param j
	 */
	public static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

	/**
	 * A utility function to swap two elements in an array.
	 */
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	/**
	 * @param arr
	 * @param i
	 * @param minIndex
	 *//*
		 * public static void swapMinIndex(int[] arr, int i, int minIndex) { // Swap the
		 * found minimum element with the first element int temp = arr[minIndex];
		 * arr[minIndex] = arr[i]; arr[i] = temp; }
		 */

	/**
	 * @param arr
	 * @param i
	 * @param j
	 *//*
		 * public static void swapByIndex(int[] arr, int i, int j) { // swap arr[i] and
		 * arr[j] int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
		 */

	/**
	 * @param arr
	 * @param high
	 * @param i
	 */
	public static void swapHigh(int[] arr, int high, int i) {
		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
	}
}