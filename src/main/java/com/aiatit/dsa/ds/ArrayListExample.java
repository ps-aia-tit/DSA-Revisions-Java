package com.aiatit.dsa.ds;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		System.out.println("Size: " + cars.size());
		// Add elements
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Size: " + cars.size());
		// Access elements
		System.out.println("First car: " + cars.get(0));

		// Modify an element
		String str0= cars.set(0, "Opel");
		System.out.println("setting new car in list set retruns : " + str0);
		// Remove an element
		String str1= cars.remove(3); // Removes "Mazda"
		System.out.println("car rempved: " + str1);
		// Iterate through the list
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("Size: " + cars.size());
	}
}
