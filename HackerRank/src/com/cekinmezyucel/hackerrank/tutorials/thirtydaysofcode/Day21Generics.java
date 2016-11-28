package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

public class Day21Generics {

	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Day21Generics.class.getDeclaredMethods().length > 2) {
			System.out.println("You should only have 1 method named printArray.");
		}
	}

	static <T> void printArray(T[] array) {
		for (T i : array) {
			System.out.println(i);
		}
	}

}
