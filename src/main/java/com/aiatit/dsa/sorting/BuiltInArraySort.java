package com.aiatit.dsa.sorting;

import java.util.Arrays;

import com.aiatit.dsa.sorting.utils.IntUtils;

public class BuiltInArraySort {

	public static void main(String[] args) {

		int[] data = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Array before sorting:");
		IntUtils.printArrData(data);
		Arrays.sort(data);

		System.out.println("Array after sorting:");
		IntUtils.printArrData(data);
	}
}
