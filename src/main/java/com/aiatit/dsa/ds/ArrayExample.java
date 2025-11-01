package com.aiatit.dsa.ds;

/***
 * Arrays store a fixed-size sequential collection of elements of the same type.
 */
public class ArrayExample {
	public static void main(String[] args) {
		// Declare and initialize an integer array
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Access elements
		System.out.println("First element: " + numbers[0]);
		System.out.println("Third element: " + numbers[2]);

		// Iterate through the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}
}
